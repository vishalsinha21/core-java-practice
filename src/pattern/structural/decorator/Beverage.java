package pattern.structural.decorator;

public abstract class Beverage {

    String description = "unknown description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
