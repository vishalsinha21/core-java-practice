package pattern.behavioral.visitor;

public interface Visitor {

    int visit(Book book);

    int visit(Fruit fruit);

}
