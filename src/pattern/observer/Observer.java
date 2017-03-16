package pattern.observer;

public interface Observer {
    
    public void register();
    public void notifyMessage(int state);
    
}
