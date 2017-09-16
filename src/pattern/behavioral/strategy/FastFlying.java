package pattern.behavioral.strategy;

public class FastFlying implements FlyingBehavior {
    @Override
    public String fly() {
        return "flying fast";
    }
}
