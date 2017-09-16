package pattern.behavioral.strategy;

public abstract class Duck {

    FlyingBehavior flyingBehavior;
    QuackingBehavior quackingBehavior;

    abstract String describe();

    String fly() {
        return flyingBehavior.fly();
    }

    String quack() {
        return quackingBehavior.quack();
    }

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void setQuackingBehavior(QuackingBehavior quackingBehavior) {
        this.quackingBehavior = quackingBehavior;
    }

    public void activate() {
        System.out.println(String.format("%s is %s and %s", describe(), quack(), fly()));
    }
}
