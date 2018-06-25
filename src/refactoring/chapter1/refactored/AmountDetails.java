package refactoring.chapter1.refactored;

import java.util.Map;

public class AmountDetails {

    private Double totalAmount;
    private int frequentRenterPoints;
    private Map<Movie, Double> movieRentalAmountMap;

    public AmountDetails(Double totalAmount, Map<Movie, Double> movieRentalAmountMap, int frequentRenterPoints) {
        this.totalAmount = totalAmount;
        this.movieRentalAmountMap = movieRentalAmountMap;
        this.frequentRenterPoints = frequentRenterPoints;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Map<Movie, Double> getMovieRentalAmountMap() {
        return movieRentalAmountMap;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }
}
