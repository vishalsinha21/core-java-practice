package ooad.parking2;

import static java.util.Arrays.asList;

public class TestParking {

    public static void main(String[] args) {
        ParkingSpot spot1 = new ParkingSpot(new Level(1), 1, 1, SpotSize.SMALL);
        ParkingSpot spot2 = new ParkingSpot(new Level(1), 1, 2, SpotSize.COMPACT);
        ParkingSpot spot3 = new ParkingSpot(new Level(1), 1, 3, SpotSize.LARGE);

        Vehicle vehicle1 = new MotorCycle("M1");
        vehicle1.park(asList(spot1));

        Vehicle vehicle2 = new Car("C1");
        vehicle2.park(asList(spot1));
        vehicle2.park(asList(spot3));

        asList(spot1, spot2, spot3).forEach(spot -> System.out.println(spot));

        ParkingSpot spot11 = new ParkingSpot(new Level(1), 2, 1, SpotSize.LARGE);
        ParkingSpot spot12 = new ParkingSpot(new Level(1), 2, 2, SpotSize.LARGE);
        ParkingSpot spot13 = new ParkingSpot(new Level(1), 2, 3, SpotSize.LARGE);
        ParkingSpot spot14 = new ParkingSpot(new Level(1), 2, 4, SpotSize.LARGE);
        ParkingSpot spot15 = new ParkingSpot(new Level(1), 2, 5, SpotSize.LARGE);

        Vehicle vehicle3 = new Bus("B1");
        vehicle3.park(asList(spot11, spot12, spot13, spot14, spot15));

        asList(spot11, spot12, spot13, spot14, spot15).forEach(spot -> System.out.println(spot));

    }
}
