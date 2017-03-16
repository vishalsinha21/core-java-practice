package pattern.observer;

public class HexaObserver implements Observer {

    public HexaObserver() {
        this.register();
    }

    @Override
    public void register() {
        Subject.register(this);
    }

    @Override
    public void notifyMessage(int state) {
        System.out.println("Hexa value:" + Integer.toHexString(state));
    }
}
