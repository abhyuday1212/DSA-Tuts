package Recursion.Permutations;

import java.util.ArrayList;
import java.util.List;

//Hard
// no. of recursive calls is dependent on the size of processed
//no. of recursion call is equal to size of newString + 1;
public class PermutationUsingRecursion {
    public static void main(String[] args) {

//        M - 2
        permutations("", "abc");
        ArrayList<String> ans = permutationsReturnArrayList("", "abc");
        System.out.println(ans);


//        // M-3
//        int[] values = {1, 2, 3};
//        List<Integer> myList = new ArrayList<>();
//        List<List<Integer>> ans3 = recursivePermute(myList, values, 0);
//        System.out.println(ans3);


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
            //whenever you find that originalStr substing is empty, then add the newStr into list and return that.
            list.add(newStr);
            return list;
        }

        char ch = originalStr.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();


        // This i is deciding the number of the function calls;
        for (int i = 0; i <= newStr.length(); i++) {
            String first = newStr.substring(0, i);
            String second = newStr.substring(i, newStr.length());

            //call the recursive function
            ans.addAll(permutationsReturnArrayList(first + ch + second, originalStr.substring(1)));
        }

        return ans;
    }

    //M-3: Permutations
    static List<List<Integer>> recursivePermute(List<Integer> newArr, int[] orgArr, int index) {
        // base case: If you reach the end, or the index == orgArr index then you should
        // terminate the function call
        List<List<Integer>> finalAns = new ArrayList<>();

        if (orgArr.length == index) {

            finalAns.add(new ArrayList<>(newArr)); // Add a copy of newArr to avoid reference issues

            return finalAns;
        }

        // Self work is that we have to calculate the current element and firstPlace and
        // seccondPlace by ourselves and ask recursion to do the remaing

        int currentElem = orgArr[index];


        for (int i = 0; i <= newArr.size(); i++) {
            newArr.add(i, currentElem); // Insert currentElem at position `i`
            finalAns.addAll(recursivePermute(newArr, orgArr, index + 1));
            newArr.remove(i); // Backtrack: Remove the inserted element
        }
        return finalAns;

    }
}
