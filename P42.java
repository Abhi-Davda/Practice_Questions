
// Given a string s representing an expression containing various types of brackets: {}, (), and [], the task is to determine whether the brackets in the expression are balanced or not. A balanced expression is one where every opening bracket has a corresponding closing bracket in the correct order.
// Input: s = “[{()}]” Output: true Explanation: All the brackets are well-formed.
// Input: s = “([]” Output: false Explanation: The expression is not balanced as there is a missing ‘)’ at the end.
import java.util.Scanner;

public class P42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        boolean out = false;
        int cnt = 0;
        if (s.length() % 2 != 0) {
            out = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == '[') {
                        if (s.charAt(j) == ']') {
                            cnt++;
                        }
                    }
                    if (s.charAt(i) == '{') {
                        if (s.charAt(j) == '}') {
                            cnt++;
                        }
                    }
                    if (s.charAt(i) == '(') {
                        if (s.charAt(j) == ')') {
                            cnt++;
                        }
                    }

                }
            }
            if (cnt == (s.length() / 2)) {
                out = true;
            }
            System.out.println("Output: " + out);
            sc.close();
        }

    }
}

// import java.util.Scanner;
// import java.util.Stack;

// public class P42 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter String: ");
// String s = sc.nextLine();
// System.out.println("Output: " + isBalanced(s));
// sc.close();
// }

// public static boolean isBalanced(String s) {
// Stack<Character> stack = new Stack<>();

// for (char ch : s.toCharArray()) {
// if (ch == '(' || ch == '{' || ch == '[') {
// stack.push(ch);
// } else if (ch == ')' || ch == '}' || ch == ']') {
// if (stack.isEmpty())
// return false;

// char top = stack.pop();
// if (!matches(top, ch))
// return false;
// }
// }

// return stack.isEmpty();
// }

// private static boolean matches(char open, char close) {
// return (open == '(' && close == ')') ||
// (open == '{' && close == '}') ||
// (open == '[' && close == ']');
// }
// }
