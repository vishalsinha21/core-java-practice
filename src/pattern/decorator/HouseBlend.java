package pattern.decorator;

public class HouseBlend extends Beverage {

    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public String getDescription() {
        return "House Blend";
    }
}
