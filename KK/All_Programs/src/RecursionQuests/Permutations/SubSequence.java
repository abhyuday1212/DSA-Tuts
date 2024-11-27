package RecursionQuests.Permutations;

// Sunsets is defined as the Permutations and combination of non-adjacent collection
/*
[3,5,6] --> [3], [3,5], [3,9], [3,5,9], [5, 9], [5], [9]
* */

//-> This pattern of taking some elements & removing same is known as this subset pattern.
// This will Always have two options either take it or ignore it.

import java.util.ArrayList;

public class SubSequence {

    public static void main(String[] args) {
//        subseq("", "jknjnwef");

        System.out.println(subseqReturnArrayList("", "abc"));
    }

    static void subseq(String newStr, String originalStr) {
        if (originalStr.isEmpty()) {
            System.out.println(newStr);
            return;
        }

        char ch = originalStr.charAt(0);

        //Take
        subseq(newStr + ch, originalStr.substring(1));

        //Not-take
        subseq(newStr, originalStr.substring(1));

    }

    static ArrayList<String> subseqReturnArrayList(String newStr, String originalStr) {
        if (originalStr.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(newStr);
            return list;
        }

        char ch = originalStr.charAt(0);

        ArrayList<String> left = subseqReturnArrayList(newStr + ch, originalStr.substring(1));
        ArrayList<String> right = subseqReturnArrayList(newStr, originalStr.substring(1));

        left.addAll(right);

        return left;
    }


}
