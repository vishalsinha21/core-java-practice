package pattern.observer;

public class BinaryObserver implements Observer {

    public BinaryObserver() {
        this.register();
    }

    @Override
    public void register() {
        Subject.register(this);
    }

    @Override
    public void notifyMessage(int state) {
        System.out.println("Binary value:" + Integer.toBinaryString(state));
    }
}
