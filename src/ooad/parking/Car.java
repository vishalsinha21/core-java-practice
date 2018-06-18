package ooad.parking;

public class Car implements Vehicle {

    private String carNumber;

    public Car(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "car number=" + carNumber;
    }
}
