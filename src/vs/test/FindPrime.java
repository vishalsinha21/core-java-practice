package vs.test;

import java.math.BigInteger;

public class FindPrime {

    public static void main(String[] args) {
        BigInteger integer = new BigInteger("14");

        boolean probablePrime = integer.isProbablePrime(1);

        System.out.println(probablePrime);
    }
}
