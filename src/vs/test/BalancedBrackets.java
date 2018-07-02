package vs.test;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    private static final Scanner scanner = new Scanner(System.in);

    public static String isBalancedBrackets(String expr) {
        return isBalancedAlt(expr) ? "YES" : "NO";
    }

    public static boolean isBalanced(String expr) {
        String[] strArr = expr.split("");
        Stack<String> stack = new Stack<>();

        for (String str : strArr) {
            if (str.equals("{") || str.equals("[") || str.equals("(")) {
                stack.push(str);
            } else {
                if (!stack.empty() && str.equals(")") && stack.peek().equals("(")) {
                    stack.pop();
                } else if (!stack.empty() && str.equals("}") && stack.peek().equals("{")) {
                    stack.pop();
                } else if (!stack.empty() && str.equals("]") && stack.peek().equals("[")) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static boolean isBalancedAlt(String expr) {
        String[] arr = expr.split("");
        Stack<String> stack = new Stack<>();

        for (String str : arr) {
            switch (str) {
                case "{":
                    stack.push("}");
                    break;
                case "[":
                    stack.push("]");
                    break;
                case "(":
                    stack.push(")");
                    break;
                default:
                    if (stack.empty() || !stack.peek().equals(str)) {
                        return false;
                    } else {
                        stack.pop();
                    }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBalancedBrackets("{[()]}"));
        System.out.println(isBalancedBrackets("{[(])}"));
        System.out.println(isBalancedBrackets("{{[[(())]]}}"));
    }


}
