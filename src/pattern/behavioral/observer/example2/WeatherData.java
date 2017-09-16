package pattern.behavioral.observer.example2;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {

    Set<Observer> observerList;

    double temperature;

    public WeatherData() {
        this.observerList = new HashSet<>();
    }

    public double getTemperature() {
        return temperature;
    }


    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observerList.contains(o)) {
            observerList.remove(o);
        }
    }

    @Override
    public void notifyAllObservers() {
        observerList.forEach(o -> o.update(temperature));
        if (observerList.size() > 0) {
            System.out.println("all observers notified");
        } else {
            System.out.println("no observers to notify as of now");
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }
}
