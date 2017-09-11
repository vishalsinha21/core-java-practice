package pattern.structural.adapter;

public class DuckAdapter implements Turkey {

    private Duck duck;

    public DuckAdapter() {
        this.duck = new MallardDuck();
    }

    @Override
    public void fly() {
        duck.fly();
    }

    @Override
    public void gobble() {
        duck.quack();
    }
}
