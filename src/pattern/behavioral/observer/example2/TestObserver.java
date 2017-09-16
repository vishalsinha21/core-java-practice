package pattern.behavioral.observer.example2;

public class TestObserver {

    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        subject.setTemperature(2.0);

        Display1 display1 = new Display1();
        Display2 display2 = new Display2();
        Display3 display3 = new Display3();
        subject.addObserver(display1);
        subject.addObserver(display2);
        subject.addObserver(display3);
        subject.setTemperature(3.0);
        subject.setTemperature(3.2);

        subject.removeObserver(display3);
        subject.setTemperature(3.4);

    }
}
