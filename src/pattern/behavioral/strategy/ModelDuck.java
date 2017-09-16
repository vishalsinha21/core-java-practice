package pattern.behavioral.strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        setFlyingBehavior(new NoFlying());
        setQuackingBehavior(new Muted());
    }

    @Override
    String describe() {
        return "model duck";
    }
}
