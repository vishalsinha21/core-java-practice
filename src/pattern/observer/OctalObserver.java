package pattern.observer;

public class OctalObserver implements Observer {

    public OctalObserver() {
        this.register();
    }

    @Override
    public void register() {
        Subject.register(this);
    }

    @Override
    public void notifyMessage(int state) {
        System.out.println("Octal value:" + Integer.toOctalString(state));
    }
}
