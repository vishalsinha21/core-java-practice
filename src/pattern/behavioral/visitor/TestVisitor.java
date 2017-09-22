package pattern.behavioral.visitor;

import java.util.List;

import static java.util.Arrays.asList;

public class TestVisitor {

    public static void main(String[] args) {
        Book book1 = new Book("book1", "author1");
        Book book2 = new Book("book2", "author2");

        Fruit fruit1 = new Fruit(1, "apple");
        Fruit fruit2 = new Fruit(2, "orange");


        List<Visitable> itemList = asList(book1, book2, fruit1, fruit2);

        int cashPrice = itemList.stream().mapToInt(item -> item.accept(new CashPriceVisitor())).sum();
        System.out.println("cash price::" + cashPrice);

        int cardPrice = itemList.stream().mapToInt(item -> item.accept(new CardPriceVisitor())).sum();
        System.out.println("card price::" + cardPrice);
    }

}
