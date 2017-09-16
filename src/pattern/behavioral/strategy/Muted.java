package pattern.behavioral.strategy;

public class Muted implements QuackingBehavior {
    @Override
    public String quack() {
        return "quiet";
    }
}
