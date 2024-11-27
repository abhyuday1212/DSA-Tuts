package RecursionQuests.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {
        letterCombination("", "12");
    }

    static void letterCombination(String newStr, String originalStr) {
        if (originalStr.isEmpty()) {
            System.out.println(newStr);
            return;
        }

        //convert character into unicode/ asccci values
        int digit = originalStr.charAt(0) - '0';  //this will convert '2' into 2, basically 'character' - '0'   ;

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i); // 'a' +2 = c, 'a' + 7 = h'
            //recursion call
            letterCombination(newStr + ch, originalStr.substring(1));

        }
    }


    static ArrayList<String> letterCombinationRetArrayList(String newStr, String originalStr) {
        if (originalStr.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(newStr);
            return list;
        }

        //convert character into unicode/ asccci values
        int digit = originalStr.charAt(0) - '0';  //this will convert '2' into 2, basically 'character' - '0'   ;

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i); // 'a' +2 = c, 'a' + 7 = h'
            //recursion call
            list.addAll(letterCombinationRetArrayList(newStr + ch, originalStr.substring(1)));
        }

        return list;
    }


    static int padCount(String newStr, String originalStr) {
        if (originalStr.isEmpty()) {
            return 1;
        }

        int count = 0;
        int digit = originalStr.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padCount(newStr + ch, originalStr.substring(1));
        }

        return count;
    }

}
