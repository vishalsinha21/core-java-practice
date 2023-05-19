package ooad.parking2;

import java.util.List;

public abstract class Vehicle {

    String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    abstract void park(List<ParkingSpot> parkingSpots);

    @Override
    public String toString() {
        return licensePlate;
    }
}
