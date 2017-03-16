package vs.test;

import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int substrLength = scan.nextInt();

        TreeSet<String> sorted = new TreeSet<>();
        for (int i = 0; i <= line.length() - substrLength; i++) {
            sorted.add(line.substring(i, i + substrLength));
        }

        System.out.println(sorted.first());
        System.out.println(sorted.last());
    }
}
