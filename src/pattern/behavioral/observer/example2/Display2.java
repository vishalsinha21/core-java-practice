package pattern.behavioral.observer.example2;

public class Display2 implements Observer, Display {

    private double temperature;

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("display 2::" + temperature);
    }
}
