package pattern.behavioral.strategy;

public class LoudQuack implements QuackingBehavior {
    @Override
    public String quack() {
        return "quacking loudly";
    }
}
