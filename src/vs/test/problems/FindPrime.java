package vs.test.problems;

import java.math.BigInteger;

public class FindPrime {

    public static void main(String[] args) {
        System.out.println(new BigInteger("14").isProbablePrime(1));
        System.out.println(new BigInteger("13").isProbablePrime(1));
    }
}
