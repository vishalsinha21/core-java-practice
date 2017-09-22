package pattern.behavioral.visitor;

public class Book implements Visitable {

    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
