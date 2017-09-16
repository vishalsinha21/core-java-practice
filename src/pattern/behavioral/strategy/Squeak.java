package pattern.behavioral.strategy;

public class Squeak implements QuackingBehavior {
    @Override
    public String quack() {
        return "squeaking";
    }
}
