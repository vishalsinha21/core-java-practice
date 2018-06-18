package ooad.parking;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class TestParking {

    public static void main(String[] args) {
        List<ParkingSlot> slots = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            slots.add(new ParkingSlot(String.valueOf(i), String.valueOf(i), ParkingStatus.EMPTY));
        }

        Vehicle vehicle1 = new Car("car1");
        Vehicle vehicle2 = new Car("car2");
        Vehicle vehicle3 = new Car("car3");

        slots.get(0).parkVehicle(vehicle1);
        slots.get(6).parkVehicle(vehicle2);
        slots.get(17).parkVehicle(vehicle3);

        Floor floor1 = new Floor("1", 1, "ground floor", slots.subList(0, 9));
        Floor floor2 = new Floor("2", 2, "first floor", slots.subList(10, 19));
        Parking parking = new Parking("1", asList(floor1, floor2), "vs parking", "vs lane, norway");

        System.out.println(parking);

        parking.emptyWholeParkingLot();

        System.out.println(parking);
    }
}
