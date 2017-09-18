package pattern.behavioral.template;

public class TestTemplate {

    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        System.out.println("recipe for tea");
        System.out.println("--------------------");
        tea.recipe();

        System.out.println();

        CaffeineBeverage coffee = new Coffee();
        System.out.println("recipe for coffee");
        System.out.println("--------------------");
        coffee.recipe();
    }
}
