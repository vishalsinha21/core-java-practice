package pattern.structural.decorator;

public class Espresso extends Beverage {

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
