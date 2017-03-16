package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private static List<Observer> observers = new ArrayList<>();
    private int state = 0;
    
    public static void register(Observer observer) {
        observers.add(observer);
    }
    
    public void update(int state) {
        this.state = state;
        notifyAllObservers(state);
    }
    
    private void notifyAllObservers(int state) {
        observers.forEach(obs -> obs.notifyMessage(state));
    }
    
}
