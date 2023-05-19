package ooad.parking2;

import java.util.List;

public class Bus extends Vehicle {

    public Bus(String licensePlate) {
        super(licensePlate);
    }

    @Override
    void park(List<ParkingSpot> parkingSpots) {
        boolean parked = false;

        for (int i = 0; i < parkingSpots.size(); i++) {
            if (i + 5 <= parkingSpots.size()) {
                if (parkingAvailable(parkingSpots.subList(i, i + 5))) {
                    parkingSpots.subList(i, i + 5).forEach(spot -> spot.park(this));
                    parked = true;
                    break;
                }
            } else {
                break;
            }
        }

        if (!parked) {
            System.out.println(String.format("Vehicle %s cannot be parked in given spots", this));
        }

    }

    private boolean parkingAvailable(List<ParkingSpot> parkingSpots) {
        boolean isLevelSame = true;
        boolean isRowSame = true;
        boolean isAdjacent = true;
        boolean isLarge = true;
        boolean isAvailable = true;


        ParkingSpot current = parkingSpots.get(0);

        for (int i = 1; i < parkingSpots.size(); i++) {
            isLevelSame = isLevelSame && (current.level.level == parkingSpots.get(i).level.level);
            isRowSame = isRowSame && (current.row == parkingSpots.get(i).row);
            isAdjacent = isAdjacent && (parkingSpots.get(i).spotNumber - current.spotNumber == 1);
            isLarge = isLarge && current.spotSize == SpotSize.LARGE;
            isAvailable = isAvailable && current.isAvailable();

            current = parkingSpots.get(i);
        }

        return isLevelSame && isRowSame && isAdjacent && isLarge && isAvailable;
    }
}
