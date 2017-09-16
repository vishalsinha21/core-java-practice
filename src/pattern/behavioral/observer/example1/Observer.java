package pattern.behavioral.observer.example1;

public interface Observer {
    
    public void register();
    public void notifyMessage(int state);
    
}
