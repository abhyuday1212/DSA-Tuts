package Recursion.Subset;

// Sunsets is defined as the Permutations and combination of non-adjacent collection
/*
[3,5,6] --> [3], [3,5], [3,9], [3,5,9], [5, 9], [5], [9]
* */

//-> This pattern of taking some elements & removing same is known as this subset pattern.
// This will Always have two options either take it or ignore it.

import java.util.ArrayList;
import java.util.Arrays;
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


        // Method-5: there is some issues here
//        int[] myArr2 = {1, 2, 3};
//        List<List<Integer>> ans2 = recursiveSubset5(myArr2);
//        System.out.println(ans2);

        // Method-6
//        int[] myArr3 = {1, 2, 3};
//        ArrayList<Integer> list = new ArrayList<>();
//        List<List<Integer>> ans3 = recursiveSubset6(list, myArr3, 0);
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
//        int[] candidates = {1, 2, 1};
//        int n = candidates.length;
//        List<Integer> newArr = new ArrayList<>();
//        List<List<Integer>> ans = subsetTargetSum(newArr, candidates, n, 3, 0, 0);
//        System.out.println(ans);

        // M-11
//        int[] orgArr = {1, 2, 2};
//        List<List<Integer>> ans11 = new ArrayList<>();
//        nonDuplicateSubsets(new ArrayList<>(), orgArr, 0, ans11);
//        System.out.println(ans11);


        //Method-12
        // List<Integer> ds, int[] orgArr, int index, List<List<Integer>> ans
        List<Integer> ds = new ArrayList<>();

        int[] myArr12 = {1, 2, 3};
        List<List<Integer>> finalAns12 = consequentSubset(ds, myArr12, 0, -1);
        System.out.println(finalAns12);
    }

    //----------------------------------- Answers -----------------
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

    // M-1-B
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

        for (int i = 0; i < arr.length; i++) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                //! internal will be the copy of outer.get(i)
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }

    // M-5: Something is wrong here
    static List<List<Integer>> recursiveSubset5(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int index = 0;
        for (int everyNum : arr) {
            int n = outer.size();

            // call a helper function, that whenever called will give the Array of small elements

            List<Integer> smallAns = helperSubset(arr, outer, n, index, everyNum);
//            outer.add(smallAns);
        }

        return outer;
    }

    static List<Integer> helperSubset(int[] arr, List<List<Integer>> outer, int n, int index, int everyNum) {
        if (n <= index) return new ArrayList<>();

        // internal will have the copy of the just previous one, once the copy is created, will have the current iterating values of the variables
        List<Integer> internal = new ArrayList<>(outer.get(index));

        internal.add(everyNum);
        outer.add(internal);

        List<Integer> smallRecursiveAns = helperSubset(arr, outer, n, index + 1, everyNum);

        smallRecursiveAns.addAll(internal);

        return internal;
    }

    // M-6: This is correct
    static List<List<Integer>> recursiveSubset6(List<Integer> ds, int[] orgArr, int index) {
        if (index == orgArr.length) {
            List<List<Integer>> baseResult = new ArrayList<>();
            baseResult.add(new ArrayList<>(ds)); // Add a copy of newArr
            return baseResult;
        }


        //----implement take not take method, Recursion need to do two things, once it need to calculate values when it has taken the characters
        // Now the question is what is the self work that we need to do
        // * The self work is to add the current element into the ds so that it is iterating and then passing the incremented index as a parameter on the further recursion calls.

        ds.add(orgArr[index]); //adding the current element to the ans list, ex: [1,2,3]
        List<List<Integer>> takenAns = recursiveSubset6(ds, orgArr, index + 1);
        ds.remove(ds.size() - 1);

        List<List<Integer>> notTakenAns = recursiveSubset6(ds, orgArr, index + 1);

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

        //! Recursion.backtracking that's why removing the unwanted results.
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

        //Recursion.backtracking
        newArr.remove(newArr.size() - 1);
        List<List<Integer>> notTakenAns = combinationSum(newArr, orgArr, target, sum, index + 1);

        takenAns.addAll(notTakenAns);

        return takenAns;

    }

    // Method-11
    //subset-2
    // Leetcode#90
    /*
     * Given an integer array nums that may contain duplicates, return all possible subsets (the power set). The solution set must not contain duplicate subsets. Return the solution in any order.
     */
    static void nonDuplicateSubsets(List<Integer> ds, int[] orgArr, int index, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(ds));

        for (int i = index; i < orgArr.length; i++) {
            if (i != index && orgArr[i] == orgArr[i - 1]) {
                continue;
            }

            ds.add(orgArr[i]);

            // ! index i is already equal to index, so why here index + 1 didnt work?
            nonDuplicateSubsets(ds, orgArr, i + 1, ans);

            ds.remove(ds.size() - 1);
//            System.out.println(ds);

        }
    }

    //Method-12
    static List<List<Integer>> consequentSubset(List<Integer> ds, int[] orgArr, int index, int lastIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        if (!ds.isEmpty()) {
            System.out.println(ds);
            ans.add(new ArrayList<>(ds));
        }

        if (index == orgArr.length) {
            return ans;
        }

        for (int i = index; i < orgArr.length; i++) {
            if (!ds.isEmpty() && lastIndex != i - 1) {
                continue;
            }

            ds.add(orgArr[i]);

            // ! index i is already equal to index, so why here index + 1 didnt work?
            List<List<Integer>> halfAns = consequentSubset(ds, orgArr, i + 1, i);
            ds.remove(ds.size() - 1);

            ans.addAll(halfAns);
        }

        return ans;

    }

    //    M-13
    private static void generateSubsetsHelper(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: if we've processed all elements, add the current subset to result.
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Recursive step 1: include the current element
        current.add(nums[index]);
        generateSubsetsHelper(nums, index + 1, current, result);

        // Backtrack: remove the current element before exploring the next possibility
        current.remove(current.size() - 1);

        // Recursive step 2: do not include the current element
        generateSubsetsHelper(nums, index + 1, current, result);
    }

}
