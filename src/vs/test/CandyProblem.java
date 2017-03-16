package vs.test;

public class CandyProblem {

    public static void main(String[] args) {
        int n = 8;
        int t = 4;
        int[] c = new int[]{3, 1, 7, 5};

        if (n >= 5 && n <= 100 && t >= 1 && t <= 100) {
            boolean inputsValid = true;
            int remaining = n;
            int totalCandiesAdded = 0;

            for (int i = 0; i < t - 1; i++) {
                if (c[i] >= 1 && c[i] <= n && c[i]<=remaining) {
                    int candiesAdded = 0;

                    remaining = remaining - c[i];
                    if (remaining < 5) {
                        candiesAdded = n - remaining;
                        remaining = n;
                    }
                    totalCandiesAdded += candiesAdded;
                } else {
                    inputsValid = false;
                    break;
                }
            }

            if (inputsValid) {
                System.out.println(totalCandiesAdded);
            }
        }

    }

}
