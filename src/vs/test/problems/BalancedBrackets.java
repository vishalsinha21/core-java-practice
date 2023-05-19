package vs.test.problems;

import java.util.Stack;

public class BalancedBrackets {

    public static String isBalancedBrackets(String expr) {
        return isBalancedAlt(expr) ? "YES" : "NO";
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
