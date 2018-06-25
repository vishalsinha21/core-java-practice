package refactoring.chapter1.refactored;

import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

public class Statement {

    public static String statement(CustomerRentals customerRentals) {
        AmountDetails amountDetails = getAmountDetails(customerRentals);
        return getTextStatement(customerRentals, amountDetails);
    }

    private static String getTextStatement(CustomerRentals customerRentals, AmountDetails amountDetails) {
        StringBuilder builder = new StringBuilder();
        builder.append("Rental Record for " + customerRentals.getCustomer().getName() + "\n");

        //show figures for this rental
        for (Map.Entry<Movie, Double> entry : amountDetails.getMovieRentalAmountMap().entrySet()) {
            builder.append("\t" + entry.getKey().getTitle() + "\t" +
                    String.valueOf(entry.getValue()) + "\n");
        }

        //add footer lines
        builder.append("Amount owed is " + String.valueOf(amountDetails.getTotalAmount()) + "\n");
        builder.append("You earned " + String.valueOf(amountDetails.getFrequentRenterPoints()) +
                " frequent renter points");
        return builder.toString();
    }

    private static AmountDetails getAmountDetails(CustomerRentals customerRentals) {
        Enumeration rentals = customerRentals.getRentals().elements();

        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Map<Movie, Double> movieRentalAmountMap = new LinkedHashMap<>();

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            //determine amounts for each line
            switch (each.getMovie().getMovieType()) {
                case REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getMovieType() == MovieType.NEW_RELEASE) &&
                    each.getDaysRented() > 1) frequentRenterPoints++;

            movieRentalAmountMap.put(each.getMovie(), thisAmount);
            totalAmount += thisAmount;
        }

        return new AmountDetails(totalAmount, movieRentalAmountMap, frequentRenterPoints);
    }
}
