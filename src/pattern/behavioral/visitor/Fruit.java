package pattern.behavioral.visitor;

public class Fruit implements Visitable {

    private int weight;
    private String name;

    public Fruit(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
