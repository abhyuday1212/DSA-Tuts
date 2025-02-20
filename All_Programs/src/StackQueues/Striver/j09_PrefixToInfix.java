package StackQueues.Striver;

import java.util.Stack;

public class j09_PrefixToInfix {
    public static void main(String[] args) {
        String ans = prefixToInfix("*+pq-mn");
        System.out.println(ans);
    }

    public static String prefixToInfix(String exp) {
        exp = exp.trim();
        Stack<String> st = new Stack<>();
        int n = exp.length();

        for (int i = n-1; i > -1; i--) {
            char ch = exp.charAt(i);

            // This can be also used to check for the letter
            // if (Character.isLetterOrDigit(ch))
            if ('A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z' || '0' <= ch && ch <= '9') {
                // if the character is a operand
//                st.push(ch + "");
                st.push(Character.toString(ch));
            } else {
                // it is operator
                String secondElem = st.peek(); // Pop second operand first
                st.pop();

                String firstElem = st.peek(); // Pop first operand second
                st.pop();

                String result = "(" + firstElem + ch + secondElem + ")"; // Correct order
                st.push(result);

            }
        }

        return st.peek();
    }


}
