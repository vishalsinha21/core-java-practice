package ooad.parking;

import java.util.List;

public class Parking {
    private String parkingId;
    private List<Floor> floors;
    private String parkingName;
    private String address;

    public Parking(String parkingId, List<Floor> floors, String parkingName, String address) {
        this.parkingId = parkingId;
        this.floors = floors;
        this.parkingName = parkingName;
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("parking name: %s, address: %s", parkingName, address)).append("\n");
        for (Floor floor : floors) {
            builder.append(floor);
        }
        return builder.toString();
    }

    public void emptyWholeParkingLot() {
        for (Floor floor : floors) {
            floor.emptyFloor();
        }
    }
}
