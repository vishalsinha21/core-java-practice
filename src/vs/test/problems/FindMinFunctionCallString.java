package vs.test.problems;

public class FindMinFunctionCallString {

    public static void main(String[] args) {
        int n = 5;
        String functionCall = "min(int, int)";

        if (n >= 2) {
            for (int i = 2; i < n; i++) {
                functionCall = "min(int, " + functionCall + ")";
            }
            System.out.println(functionCall);
        }

    }
}
