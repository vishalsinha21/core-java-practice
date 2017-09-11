package pattern.structural.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void fly() {
        System.out.println("I am flying for short distance");
    }

    @Override
    public void gobble() {
        System.out.println("I am gobbling");
    }
}
