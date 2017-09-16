package pattern.behavioral.strategy;

public class RocketDuck extends Duck {

    public RocketDuck() {
        setFlyingBehavior(new FastFlying());
        setQuackingBehavior(new LoudQuack());
    }

    @Override
    String describe() {
        return "rocket duck";
    }
}
