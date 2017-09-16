package vs.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;

public class TestBigDecimal {

    public static void main(String[] args) {
        BigDecimal decimal = BigDecimal.valueOf(4.2878);

        System.out.println(decimal.intValue()); //4
        System.out.println(decimal.doubleValue()); //4.2878

        BigDecimal rounded = decimal.setScale(2, BigDecimal.ROUND_FLOOR);
        System.out.println(rounded.doubleValue()); //4.28

        BigDecimal movedLeft = decimal.movePointLeft(2);
        System.out.println(movedLeft.doubleValue()); //.04278

        BigDecimal newDecimal = BigDecimal.valueOf(428.7897);
        BigDecimal roundedNegative = newDecimal.setScale(-2, RoundingMode.HALF_UP);
        System.out.println(roundedNegative.doubleValue()); //400

        Currency eur = Currency.getInstance("NOK");
        System.out.println(eur.getDefaultFractionDigits());

        BigDecimal bigNumberWithoutDecimals = BigDecimal.valueOf(44455667788l);
        BigDecimal scale = bigNumberWithoutDecimals.setScale(2);
        System.out.println(scale.doubleValue());
    }
}
