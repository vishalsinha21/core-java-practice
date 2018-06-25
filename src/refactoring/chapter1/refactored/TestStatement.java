package refactoring.chapter1.refactored;

public class TestStatement {

    public static void main(String[] args) {
        Movie movie1 = new Movie("movie1", MovieType.REGULAR);
        Movie movie2 = new Movie("movie2", MovieType.NEW_RELEASE);
        Movie movie3 = new Movie("movie3", MovieType.CHILDRENS);

        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 2);
        Rental rental3 = new Rental(movie3, 3);

        Customer customer = new Customer("customer");

        CustomerRentals customerRentals = new CustomerRentals(customer);

        customerRentals.addRental(rental1);
        customerRentals.addRental(rental2);
        customerRentals.addRental(rental3);

        System.out.println(Statement.statement(customerRentals));
    }
}
