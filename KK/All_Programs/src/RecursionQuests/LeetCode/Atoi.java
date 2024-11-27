package RecursionQuests.LeetCode;

import java.lang.Math.*;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myRecursionFun("2323v"));
    }

    static int myRecursionFun(String s) {
        // Remove leading whitespaces
        s = s.trim();

        //If the string is empty or pointer has reached the last index then it will be called, check for white spaces.
            if (s.isEmpty()) return 0;

        int sign = 1;
        int index = 0;

        // Check for the sign
        if (s.charAt(index) == '-') {
            sign = -1;
            index++;  //to skip the first character if sign is present
        } else if (s.charAt(index) == '+') {
            index++;  // to skip the first character if the sign is present
        }

        // Recursive helper function to process each digit
        return sign * helper(s, index, 0);
    }


    static int helper(String s, int index, int result) {
        // Base case: stop if we've reached a non-digit character or the end of the string
        if (index >= s.length() || !Character.isDigit(s.charAt(index))) {
            return result;
        }

        // Get the digit at the current position
        int digit = s.charAt(index) - '0';

        // Check for overflow
        if (result > (Integer.MAX_VALUE - digit) / 10) {
            return Integer.MAX_VALUE; // For positive overflow
        } else if (result < (Integer.MIN_VALUE + digit) / 10) {
            return Integer.MIN_VALUE; // For negative overflow
        }

        // Recursive call to process the next character
        return helper(s, index + 1, result * 10 + digit);
    }

}
