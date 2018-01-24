package vs.test;

public class SwapString {

    public static void main(String[] args) {
        String one = "one";
        String two = "two";

        one = one + ',' + two;
        two = one + ',' + two;

        one = one.split(",")[1];
        two = two.split(",")[0];

        System.out.println(one);
        System.out.println(two);

    }
}
