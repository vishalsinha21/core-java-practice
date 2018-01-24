package vs.test;

import java.util.Scanner;

public class PrintInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String input = scanner.next();
            System.out.println("your input is: " + input);
        }

    }
}
