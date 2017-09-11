package pattern.structural.decorator;

public class TestDecorator {

    public static void main(String[] args) {

        //House Blend with mocha and whip
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());

        //Espresso with 2 mocha and whip
        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.cost());
    }
}
