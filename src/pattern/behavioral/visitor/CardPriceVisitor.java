package pattern.behavioral.visitor;

public class CardPriceVisitor implements Visitor {

    @Override
    public int visit(Book book) {
        return 8;
    }

    @Override
    public int visit(Fruit fruit) {
        return fruit.getWeight() * 1;
    }

}
