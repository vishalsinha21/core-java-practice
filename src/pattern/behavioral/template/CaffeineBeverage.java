package pattern.behavioral.template;

public abstract class CaffeineBeverage {

    final void recipe() {
        boil();
        brew();
        pour();
        addCondiments();
    };

    void boil() {
        System.out.println("boiling water");
    }

    abstract void brew();

    void pour() {
        System.out.println("pour in cup");
    }

    abstract void addCondiments();

}
