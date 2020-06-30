package vs.test.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SimpleSerialization {

    public static void main(String[] args) {
        Car car = new Car(2012, "Honda", "Red");

        serializeCar(car);
        Car deserializedCar1 = deserializeCar();
        Car deserializedCar2 = deserializeCar();

        System.out.println(deserializedCar1);
        System.out.println(deserializedCar2);

        System.out.println(car.hashCode());
        System.out.println(deserializedCar1.hashCode());
        System.out.println(deserializedCar2.hashCode());
    }

    private static Car deserializeCar() {
        try {
            FileInputStream fileInputStream = new FileInputStream("car.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Car deserializedCar = (Car) objectInputStream.readObject();
            return deserializedCar;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void serializeCar(Car car) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("car.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(car);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
