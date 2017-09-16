package pattern.behavioral.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyingBehavior(new SlowFlying());
        setQuackingBehavior(new Squeak());
    }

    @Override
    String describe() {
        return "mallard duck";
    }
}
