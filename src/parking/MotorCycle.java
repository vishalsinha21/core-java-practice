package parking;

import java.util.List;

public class MotorCycle extends Vehicle {

    public MotorCycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    void park(List<ParkingSpot> parkingSpots) {
        parkingSpots.stream()
                .filter(ParkingSpot::isAvailable)
                .findFirst()
                .ifPresent(spot -> spot.park(this));
    }
}
