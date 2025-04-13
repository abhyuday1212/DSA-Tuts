package StackQueues.MonotonicStack;

import java.util.Stack;

public class RemoveK {
    public static void main(String[] args) {
        String str = "1432219";
        System.out.println(removeKdigits(str, 3));
    }

    public static String removeKdigits(String num, int k) {
        int n = num.length();

        if (k == n)
            return "0";

        String ans = "";
        StringBuilder rev = new StringBuilder();

        // put the number in the stack one by one
        Stack<Integer> st = new Stack<>();
        char[] ch = num.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (!st.isEmpty() && st.peek() > ch[i] - '0') {
                st.pop();
                k--;
            }

            if (k == 0) {
                while (i != ch.length) {
                    st.push(ch[i] - '0');
                    i++;
                }
                break;
            }


            st.push(ch[i] - '0');
        }

        System.out.println("ans 1: " + st);

        if (!st.isEmpty()) {
            while (!st.isEmpty()) {
                ans += st.peek();

                System.out.println("ans 2: " + ans);
                st.pop();
            }

            rev.append(ans);
            ans = rev.reverse().toString();
        }


        ans = ans.charAt(0) == '0' ? "0" : removeLeadingZeros(ans);

        return ans;
    }

    public static String removeLeadingZeros(String str) {
        if (str.isEmpty()) {
            return str;
        }

        if (str.charAt(0) == '0') {
            str = removeLeadingZeros(str.substring(1));
            return str;
        }

        return str;
    }

//    public static String removeKdigits(String num, int k) {
//        if (k >= num.length()) return "0";
//
//        // move the sliding window and keep the track of the minimum
//        // int smallestInteger = Integer.MAX_VAL;
//        char[] ch = num.toCharArray();
//        String ans = "0";
//        int lastElem = Integer.MIN_VALUE;
//
//        for (int i = 0; i < ch.length; i++) {
//            if (lastElem < ch[i] - '0' && i != 0) {
//                ans = newAns(ch, i, k);
//
//                if (ans.isEmpty()) {
//                    return "0";
//                }
//
//                return ans;
//            }
//            lastElem = ch[i] - '0';
//        }
//
//        return ans;
//    }
//
//    public static String newAns(char[] ch, int index, int k) {
//        String ans = "";
//        for (int i = 0; i < index; i++) {
//            if (ch[i] == '0' && ans.isEmpty()) continue;
//
//            ans += ch[i];
//            System.out.println(ans);
//        }
//
//        for (int j = index + k; j < ch.length; j++) {
//            // before adding this line runtime was 4ms and after adding it became 6ms
//            if (ch[j] == '0' && ans.isEmpty()) continue;
//
//            ans += ch[j];
//            System.out.println("loop 2..." + ans);
//        }
//
//        return ans;
//    }
//
//    public static String removeLeadingZeros(String str) {
//
//        if (str.length() == 0) {
//            return str;
//        }
//        if (str.charAt(0) == '0') {
//            str = removeLeadingZeros(str.substring(1));
//            return str;
//        }
//
//        return str;
//    }

}
