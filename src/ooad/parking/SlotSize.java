package ooad.parking;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static ooad.parking.VehicleType.BIKE;
import static ooad.parking.VehicleType.COMPACT;
import static ooad.parking.VehicleType.SEDAN;
import static ooad.parking.VehicleType.TRUCK;

public enum SlotSize {

    SMALL(asList(BIKE, COMPACT)),
    MEDIUM(asList(BIKE, COMPACT, SEDAN)),
    LARGE(asList(BIKE, COMPACT, SEDAN, TRUCK));

    private final List<VehicleType> vehicleTypesAllowed;

    SlotSize(List<VehicleType> vehicleTypes) {
        this.vehicleTypesAllowed = vehicleTypes;
    }

    public boolean isVehicleParkingPossible(Vehicle vehicle) {
        return vehicleTypesAllowed.contains(vehicle.getType());
    }

    public SlotSize from(VehicleType vehicleType) {
        return Arrays.stream(SlotSize.values())
                .filter(size -> size.vehicleTypesAllowed.contains(vehicleType))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("no slot size found for vehicle type: " + vehicleType));
    }
}
