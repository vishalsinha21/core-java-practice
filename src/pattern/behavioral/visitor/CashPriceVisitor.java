package pattern.behavioral.visitor;

public class CashPriceVisitor implements Visitor {

    @Override
    public int visit(Book book) {
        return 10;
    }

    @Override
    public int visit(Fruit fruit) {
        return fruit.getWeight() * 2;
    }

}
