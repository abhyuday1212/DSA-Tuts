package StackQueues.Striver;

import java.util.Stack;

public class j07_InfixToPrefix {
    //! Not important
    public static void main(String[] args) {
        String ans = infixToPrefix("a+b*(c^d-e)^(f+g*h)-i");
        System.out.println(ans);
    }

    public static String infixToPrefix(String s) {
        String ans = "";

        // Step 1: reverse the infix expression
        String reversedString = reverseStr(s);

        // Step 2: Infix to Postfix
        String infixToPostfix = infixToPostfix(reversedString);

        // step 3: reverse the final string
        ans = reverseStr(infixToPostfix);

        return ans;
    }

    public static String reverseStr(String s) {
        String reverseString = "";

        for (int i = s.length() - 1; i != 0; i--) {
            if (s.charAt(i) == '(') {
                reverseString = reverseString + ')';
            } else if (s.charAt(i) == ')') {
                reverseString = reverseString + '(';
            } else {
                reverseString += s.charAt(i);
            }

        }
        System.out.println(reverseString);

        return reverseString;
    }

    public static String infixToPostfix(String s) {
        String ans = "";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            //here we need to handle four edge cases
            char ch = s.charAt(i);
            if ('A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z' || '0' <= ch && ch <= '9') {
                // in case of operands
                ans = ans + ch;
            } else if (ch == '(') {
                //opening bracket
                st.push(ch);
            } else if (ch == ')') {
                // closing bracket
                while (!st.isEmpty() && st.peek() != '(') {
                    ans = ans + st.peek();
                    st.pop();
                }
                st.pop();
            } else {
                // operator
                if (ch == '^') {
                    while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
                        ans = ans + st.peek();
                        st.pop();
                    }
                } else {
                    while (!st.isEmpty() && priority(ch) < priority(st.peek())) {
                        ans = ans + st.peek();
                        st.pop();
                    }
                }
                st.push(ch);
            }
        }

        while (!st.empty()) {
            ans += st.peek();
            st.pop();
        }

        return ans;
    }

    public static int priority(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return 0;
    }
}
