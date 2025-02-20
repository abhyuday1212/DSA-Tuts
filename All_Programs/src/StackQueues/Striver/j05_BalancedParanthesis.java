package StackQueues.Striver;

import java.util.Stack;

public class j05_BalancedParanthesis {
    public static void main(String[] args) {
        boolean ans = isValid("(){}}{");
        System.out.println(ans);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                //current wla closing character h
                if (stack.isEmpty()) return false;

                char poppedBracket = stack.peek();
                stack.pop(); // also pop the bracket from the stack

                if (poppedBracket == '(' && s.charAt(i) == ')' || poppedBracket == '[' && s.charAt(i) == ']' || poppedBracket == '{' && s.charAt(i) == '}') {
                    continue;
                } else {
                    return false;
                }

            }
        }

        return false;
    }
}
