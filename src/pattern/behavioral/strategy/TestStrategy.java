package pattern.behavioral.strategy;

public class TestStrategy {

    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        Duck duck2 = new ModelDuck();
        Duck duck3 = new RocketDuck();

        duck1.activate();
        duck2.activate();
        duck3.activate();
    }
}
