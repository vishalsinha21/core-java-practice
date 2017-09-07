package pattern.adapter;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter() {
        this.turkey = new WildTurkey();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
