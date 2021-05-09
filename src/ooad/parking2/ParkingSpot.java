package ooad.parking2;

public class ParkingSpot {

    Level level;
    int row;
    int spotNumber;
    SpotSize spotSize;

    Vehicle vehicle;

    public boolean isAvailable() {
        return vehicle == null;
    }

    public void park(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot(Level level, int row, int spotNumber, SpotSize spotSize) {
        this.level = level;
        this.row = row;
        this.spotNumber = spotNumber;
        this.spotSize = spotSize;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "level=" + level +
                ", row=" + row +
                ", spotNumber=" + spotNumber +
                ", spotSize=" + spotSize +
                ", vehicle=" + vehicle +
                '}';
    }
}
