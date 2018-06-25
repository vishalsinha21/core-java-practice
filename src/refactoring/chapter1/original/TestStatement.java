package refactoring.chapter1.original;

import refactoring.chapter1.original.Movie;

public class TestStatement {

    public static void main(String[] args) {
        Movie movie1 = new Movie("movie1", 0);
        Movie movie2 = new Movie("movie2", 1);
        Movie movie3 = new Movie("movie3", 2);

        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 2);
        Rental rental3 = new Rental(movie3, 3);

        Customer customer = new Customer("customer");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println(customer.statement());
    }
}
