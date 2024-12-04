package RecursionQuests.Permutations;

import java.util.ArrayList;

//Hard
// no. of recursive calls is dependent on the size of processed
//no. of recursion call is equal to size of newString + 1;
public class PermutationUsingRecursion {
    public static void main(String[] args) {
//        permutations("", "abc")
        ArrayList<String> ans = permutationsReturnArrayList("", "abc");
        System.out.println(ans);
    }


    static void permutations(String newStr, String originalStr) {
        if (originalStr.isEmpty()) {
            System.out.println(newStr);
            return;
        }

        char ch = originalStr.charAt(0);

        for (int i = 0; i <= newStr.length(); i++) {
            String first = newStr.substring(0, i);
            String second = newStr.substring(i, newStr.length());

            //call the recursive function
            permutations(first + ch + second, originalStr.substring(1));

        }
    }


    static ArrayList<String> permutationsReturnArrayList(String newStr, String originalStr) {
        if (originalStr.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();

            //whenever you find that substing is empty, then add the newStr into list and return that.
            list.add(newStr);

            return list;
        }

        char ch = originalStr.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= newStr.length(); i++) {
            String first = newStr.substring(0, i);
            String second = newStr.substring(i, newStr.length());

            //call the recursive function
            ans.addAll(permutationsReturnArrayList(first + ch + second, originalStr.substring(1)));
        }

        return ans;
    }
}
