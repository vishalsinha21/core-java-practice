package vs.test.problems;

public class FindPalindrome {

    public static void main(String[] args) {
        String word = "madam";

        String reverse = new StringBuilder(word).reverse().toString();

        System.out.println(word.equals(reverse) ? "Yes" : "No");
    }

}
