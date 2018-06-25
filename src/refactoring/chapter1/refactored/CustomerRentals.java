package refactoring.chapter1.refactored;

import java.util.Vector;

public class CustomerRentals {

    private Customer customer;
    private Vector rentals = new Vector();

    public CustomerRentals(Customer customer) {
        this.customer = customer;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vector getRentals() {
        return rentals;
    }
}
