package ooad.parking2;

import java.util.List;
import java.util.Optional;

import static ooad.parking2.SpotSize.COMPACT;
import static ooad.parking2.SpotSize.LARGE;

public class Car extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    void park(List<ParkingSpot> parkingSpots) {
        Optional<ParkingSpot> first = parkingSpots.stream()
                .filter(spot -> spot.isAvailable() && spot.spotSize.isOneOf(COMPACT, LARGE))
                .findFirst();

        if (first.isPresent()) {
            first.get().park(this);
        } else {
            System.out.println(String.format("Vehicle %s cannot be parked in given spots", this));
        }
    }
}
