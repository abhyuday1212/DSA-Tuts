package Recursion.Subset;

// Sunsets is defined as the Permutations and combination of non-adjacent collection
/*
[3,5,6] --> [3], [3,5], [3,9], [3,5,9], [5, 9], [5], [9]
* */

//-> This pattern of taking some elements & removing same is known as this subset pattern.
// This will Always have two options either take it or ignore it.

import java.util.ArrayList;
import java.util.List;

public class SubSequence {

    public static void main(String[] args) {
//        subseq("", "jknjnwef");

        //-----------------
//        System.out.println(subseqReturnArrayList("", "abc"));

        //        char ch = 'a';
//        System.out.println(ch + 0);

//        subseqAscii("", "abc");
//        ArrayList<String> ans = subseqAsciReturnList("", "abc");
//        System.out.println(ans);

        // Method-4
//        int[] myArr = {1, 2, 3};
//        List<List<Integer>> ans = subset(myArr);
//        System.out.println(ans);


        // Method-5
//        int[] myArr2 = {1, 2, 3};
//        List<List<Integer>> ans2 = recusiveSubset(myArr2);
//        System.out.println(ans2);

        // Method-6

//        int[] myArr3 = {1, 2, 3};
//        ArrayList<Integer> list = new ArrayList<>();
//        List<List<Integer>> ans3 = recursiveSubset(list, myArr3, 0);
//        System.out.println(ans3);

        //M-7
//        int[] myArr7 = {1, 2, 1};
//        ArrayList<Integer> list7 = new ArrayList<>();
//        subsetSum(list7, myArr7, 0, 0);

        //M-8
//        int[] myArr8 = {9, 7, 0, 7, 3, 4, 3, 2, 4, 0, 0, 4, 6, 9, 3, 3, 6, 1, 6, 2, 8, 4, 9, 4, 5, 0, 0};
//        int n = myArr8.length;
//        ArrayList<Integer> list8 = new ArrayList<>();
//        int ans = subsetTargetSum(list8, myArr8, n, 2, 0, 0, 0);
//        System.out.println(ans);


        // M-9
//        int[] candidates = {1, 2, 1};
//        int n = candidates.length;
//        List<Integer> newArr = new ArrayList<>();
//
//        List<List<Integer>> ansList = new ArrayList<>();
//        List<List<Integer>> ans = subsetTargetSum(newArr, candidates, n, 2, 0, 0);
//        System.out.println(ans);


        // M-10
        int[] candidates = {1, 2, 1};
        int n = candidates.length;
        List<Integer> newArr = new ArrayList<>();
        List<List<Integer>> ans = subsetTargetSum(newArr, candidates, n, 3, 0, 0);
        System.out.println(ans);

    }

    // M-1
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

        // not take
        ArrayList<String> right = subseqReturnArrayList(newStr, originalStr.substring(1));

        left.addAll(right);


        return left;
    }

    // M-2
    static void subseqAscii(String newStr, String originalStr) {
        if (originalStr.isEmpty()) {
            System.out.println(newStr);
            return;
        }

        char ch = originalStr.charAt(0);

        //take
        subseqAscii(newStr + ch, originalStr.substring(1));

        // not take
        subseqAscii(newStr, originalStr.substring(1));

        //
        subseqAscii(newStr + (ch + 0), originalStr.substring(1));
    }

    // M-3
    static ArrayList<String> subseqAsciReturnList(String newStr, String originalStr) {
        if (originalStr.isEmpty()) {

            ArrayList<String> list = new ArrayList<>();
            list.add(newStr);
            return list;
        }

        char ch = originalStr.charAt(0);

        //take
        ArrayList<String> taken = subseqAsciReturnList(newStr + ch, originalStr.substring(1));

        // not take
        ArrayList<String> notTaken = subseqAsciReturnList(newStr, originalStr.substring(1));

        //This solves the small problem of getting the new Ascii values
        ArrayList<String> ascii = subseqAsciReturnList(newStr + (ch + 0), originalStr.substring(1));

        taken.addAll(notTaken);
        taken.addAll(ascii);
        return taken;
    }

    // M-4
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int everyNum : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));     //! internal will be the copy of outer.get(i)
                internal.add(everyNum);
                outer.add(internal);
            }
        }

        return outer;
    }

    // M-5
//    static List<List<Integer>> recusiveSubset(int[] arr) {
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//        int index = 0;
//        for (int everyNum : arr) {
//            int n = outer.size();
//
//            // call a helper function, that whenever called will give the Array of small elements
//
//            List<Integer> smallAns = helperSubset(arr, outer, n, index, everyNum);
////            outer.add(smallAns);
//        }
//
//        return outer;
//    }
//
//    static List<Integer> helperSubset(int[] arr, List<List<Integer>> outer, int n, int index, int everyNum) {
//        if (n <= index) return new ArrayList<>();
//
//        // internal will have the copy of the just previous one, once the copy is created, will have the current iterating values of the variables
//        List<Integer> internal = new ArrayList<>(outer.get(index));
//
//        internal.add(everyNum);
//        outer.add(internal);
//
//        List<Integer> smallRecursiveAns = helperSubset(arr, outer, n, index + 1, everyNum);
//
//        smallRecursiveAns.addAll(internal);
//
//        return internal;
//    }

    // M-6
    static List<List<Integer>> recursiveSubset(List<Integer> newArr, int[] orgArr, int index) {
        if (index == orgArr.length) {
            List<List<Integer>> baseResult = new ArrayList<>();
            baseResult.add(new ArrayList<>(newArr)); // Add a copy of newArr
            return baseResult;
        }


        //----implement take not take method, Recursion need to do two things, once it need to calculate values when it has taken the characters
        // Now the question is what is the self work that we need to do
        // * The self work is to calculate at every index the element it is iterating and then passing the current index as a parameter on the further recursion calls.
        List<Integer> takenArr = new ArrayList<>(newArr);
        takenArr.add(orgArr[index]);
        List<List<Integer>> takenAns = recursiveSubset(takenArr, orgArr, index + 1);

        List<List<Integer>> notTakenAns = recursiveSubset(newArr, orgArr, index + 1);

        takenAns.addAll(notTakenAns);
        return takenAns;

    }

    //M-7
    // Print the sum whose sum of the subset is equal to given question
    static void subsetSum(List<Integer> newArr, int[] orgArr, int sum, int index) {
        if (index == orgArr.length) {
            if (sum == 2) {
                System.out.println(newArr);
                return;
            }
            return;
        }

        //Take
        newArr.add(orgArr[index]);
        sum = sum + orgArr[index];
        subsetSum(newArr, orgArr, sum, index + 1);

        //! backtracking that's why removing the unwanted results.
        //* Clear the result of the newArr and the sum as we are moving up-word we need our old values to be back.
        newArr.removeLast();
        sum = sum - orgArr[index];

        //Not Take
        subsetSum(newArr, orgArr, sum, index + 1);
    }

    //M-8
    // Count the sum whose sum of the subset is equal to given question
    static int subsetTargetSum(List<Integer> newArr, int[] orgArr, int n, int target, int sum, int index, int count) {
        //base case
        // whenever your index reaches the end of the original length stop the iteration over there
        if (index == n) {
            //Now imagine you are standing at the end of the tree, so at the root node check weather
            // the sum is equal to target or not
            if (sum == target) {
                return count + 1;
            }
            return count;
        }


        // when you are taking and summing up
        newArr.add(orgArr[index]);

        count = subsetTargetSum(newArr, orgArr, n, target, sum + orgArr[index], index + 1, count);
        newArr.remove(newArr.size() - 1);

        //now when you are coming above the loop
//        newArr.removeLast();       // This method couldnt be used in Java 1.8;


        // we need to remove the elements added to newArr
//            newArr.remove(orgArr[index]);   //! This line gave error for this -->  int[] myArr8 = {9, 7, 0, 7, 3, 4, 3, 2, 4, 0, 0, 4, 6, 9, 3, 3, 6, 1, 6, 2, 8, 4, 9, 4, 5, 0, 0};


        count = subsetTargetSum(newArr, orgArr, n, target, sum, index + 1, count);

        return count;
    }


    // M-9
    // * wap to return the list of ALl the subsequences possible, if the sum== target (Not counting the current character,more than 1 time)
    static List<List<Integer>> subsetTargetSum(List<Integer> newArr, int[] orgArr, int n, int target, int sum, int index) {
        // base case
        // whenever your index reaches the end of the original length stop the iteration
        // over there
        if (index == orgArr.length) {
            List<List<Integer>> baseResult = new ArrayList<>();
            if (target == sum) {
                baseResult.add(new ArrayList<>(newArr));  //Add the copy of the newArray
                return baseResult;
            }
            return baseResult;
        }

        //* when you are taking and summing up & somehow you cannot add this line in the recursive function call.
//        List<Integer> takenArr = new ArrayList<>();
        newArr.add(orgArr[index]);

        List<List<Integer>> takenAns = subsetTargetSum(newArr, orgArr, n, target, sum + orgArr[index], index + 1);

        // Backtrack: remove last element : This is not needed as the takenArr is being created and not the same array is being modified
        newArr.remove(newArr.size() - 1);

        List<List<Integer>> notTakenAns = subsetTargetSum(newArr, orgArr, n, target, sum, index + 1);

        takenAns.addAll(notTakenAns);

        return takenAns;
    }

    // M-10
    // * wap to return the list of ALl the subsequences possible, if the sum== target ( Counting the current character, more than 1 time)
    static List<List<Integer>> combinationSum(List<Integer> newArr, int[] orgArr, int target, int sum, int index) {
        if (orgArr.length == index) {
            List<List<Integer>> baseResult = new ArrayList<>();
            // so I want also continuously Adding the last element to the
            if (target == sum) {
                baseResult.add(new ArrayList<>(newArr));
                return baseResult;
            }
            return baseResult;
        }

        newArr.add(orgArr[index]);

        List<List<Integer>> takenAns = combinationSum(newArr, orgArr, target, sum + orgArr[index], index + 1);

        //backtracking
        newArr.remove(newArr.size() - 1);
        List<List<Integer>> notTakenAns = combinationSum(newArr, orgArr, target, sum, index + 1);

        takenAns.addAll(notTakenAns);

        return takenAns;

    }
}
