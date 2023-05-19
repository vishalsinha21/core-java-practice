package vs.test.problems;

import java.util.Arrays;

public class FindAnagram {

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "margana";

        char[] chars1 = str1.toLowerCase().toCharArray();
        char[] chars2 = str2.toLowerCase().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        System.out.println(chars1);
        System.out.println(chars2);

        System.out.println(Arrays.equals(chars1, chars2));
    }

}
