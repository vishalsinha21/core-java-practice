package pattern.behavioral.visitor;

public interface Visitable {

    public int accept(Visitor visitor);

}
