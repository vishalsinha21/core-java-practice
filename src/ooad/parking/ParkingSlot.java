package ooad.parking;

public class ParkingSlot {
    private String slotId;
    private String slotNumber;
    private ParkingStatus status;
    private Floor floor;
    private Parking parking;
    private Vehicle vehicle;

    public ParkingSlot(String slotId, String slotNumber, ParkingStatus status) {
        this.slotId = slotId;
        this.slotNumber = slotNumber;
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("slot number: %s, status: %s, vehicle: %s", slotNumber, status, vehicle);
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        status = ParkingStatus.OCCUPIED;
    }

    public void emptySlot() {
        this.vehicle = null;
        status = ParkingStatus.EMPTY;
    }

}
