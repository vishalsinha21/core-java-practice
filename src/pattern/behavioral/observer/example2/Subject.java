package pattern.behavioral.observer.example2;

public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObservers();

}
