package pattern.behavioral.strategy;

public class SlowFlying implements FlyingBehavior {
    @Override
    public String fly() {
        return "flying slow";
    }
}
