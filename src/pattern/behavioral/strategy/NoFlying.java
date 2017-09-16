package pattern.behavioral.strategy;

public class NoFlying implements FlyingBehavior {
    @Override
    public String fly() {
        return "not flying";
    }
}
