package vs.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a);
            System.out.println(b);
            System.out.println(a/b);
        }   catch(InputMismatchException ix) {
            System.out.println(ix.getClass().getCanonicalName());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
