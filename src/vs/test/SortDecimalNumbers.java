package vs.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortDecimalNumbers {


    public static void main(String[] args) {

        String[] s = new String[]{"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};

        Arrays.sort(s, 0, 10, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return a.compareTo(b);
            }
        }));

        //Output
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
