package Recursion.CombinationSum;

// Sunsets is defined as the Permutations and combination of non-adjacent collection
/*
[3,5,6] --> [3], [3,5], [3,9], [3,5,9], [5, 9], [5], [9]
* */

//-> This pattern of taking some elements & removing same is known as this subset pattern.
// This will Always have two options either take it or ignore it.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleSum {

    public static void main(String[] args) {
        // L-40
        int[] candidates1 = {10, 1, 2, 7, 6, 1, 5};
        Arrays.sort(candidates1);


//        List<List<Integer>> ansList2 = new ArrayList<>();
//        combinationSum2(new ArrayList<>(), candidates1, 8, 0, ansList2);
//        System.out.println(ansList2);


        //-------------------------------------------
        int[] candidates2 = {2, 3, 6, 7};
        List<List<Integer>> ansList1 = new ArrayList<>();
        combinationSum1(new ArrayList<>(), candidates2, 7, 0, ansList1);
        System.out.println(ansList1);

        // M-10
//        int[] candidates2 = {2,3,1,4,5};
//        int n2 = candidates2.length;
//        List<Integer> newArr2 = new ArrayList<>();
//        List<List<Integer>> ans2 = combinationSum(newArr2, candidates2, n2, 3, 0);
//        System.out.println(ans2);

    }


//* 40. Combination Sum II

    static void combinationSum2(List<Integer> ds, int[] orgArr, int target, int index, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
//            System.out.println(ans);
            return;
        }

        //*now run a for loop as variable number of recursion call is needed

        for (int i = index; i < orgArr.length; i++) {
            // ! check for duplicates
            if (i > index && orgArr[i] == orgArr[i - 1]) continue;

            // ! check for current Element is greater than the required sum or bot
            if (orgArr[i] > target || target < 0) break;

            ds.add(orgArr[i]);

            // ! index i is already equal to index, so why here index + 1 didnt work?
            combinationSum2(ds, orgArr, target - orgArr[i], i + 1, ans);

            ds.remove(ds.size() - 1);
        }
    }


    //* LeetCode-39. Combination Sum-1
    static void combinationSum1(List<Integer> ds, int[] orgArr, int target, int index, List<List<Integer>> ans) {
        // base condition
        if (index == orgArr.length) {

            if (target == 0) {
                ans.add(new ArrayList<>(ds));  //Add the copy of the newArray
            }
            return;
        }

        // If the current element is less than or equal to the target, consider taking it
        if (orgArr[index] <= target) {
            ds.add(orgArr[index]);
            combinationSum1(ds, orgArr, target - orgArr[index], index, ans);
            ds.remove(ds.size() - 1);
        }

        //not take
        combinationSum1(ds, orgArr, target, index + 1, ans);

    }
    //-------------------------------------------------

    // M-9
    // * wap to return the list of ALl the subsequences possible, if the sum== target (Not counting the current character,more than 1 time)
//    static List<List<Integer>> singleSubsetTargetSum(List<Integer> newArr, int[] orgArr, int n, int target, int sum, int index) {
//        // base case
//        // whenever your index reaches the end of the original length stop the iteration
//        // over there
//        if (index == orgArr.length) {
//            List<List<Integer>> baseResult = new ArrayList<>();
//
//            if (target == sum) {
//                baseResult.add(new ArrayList<>(newArr));  //Add the copy of the newArray
//            }
//            return baseResult;
//        }
//
//        //* when you are taking and summing up & somehow you cannot add this line in the recursive function call.
////        List<Integer> takenArr = new ArrayList<>();
//        newArr.add(orgArr[index]);
//
//        List<List<Integer>> takenAns = singleSubsetTargetSum(newArr, orgArr, n, target, sum + orgArr[index], index + 1);
//
//        // Backtrack: remove last element : This is not needed as the takenArr is being created and not the same array is being modified
//        newArr.remove(newArr.size() - 1);
//
//        List<List<Integer>> notTakenAns = singleSubsetTargetSum(newArr, orgArr, n, target, sum, index + 1);
//
////        if (takenAns.contains(newArr) || notTakenAns.contains(newArr)){
////            return takenAns;
////        }
//
//        takenAns.addAll(notTakenAns);
//
//        return takenAns;
//    }

    // M-10
    // * wap to return the list of ALl the subsequences possible, if the sum== target ( Counting the current character, more than 1 time)
//    static List<List<Integer>> combinationSum1(List<Integer> newArr, int[] orgArr, int target, int sum, int index) {
//        if (orgArr.length == index) {
//            List<List<Integer>> baseResult = new ArrayList<>();
//            // so I want also continuously Adding the last element to the
//            if (target == sum) {
//                baseResult.add(new ArrayList<>(newArr));
//                return baseResult;
//            }
//            return baseResult;
//        }
//
//        newArr.add(orgArr[index]);
//
//        List<List<Integer>> takenAns = combinationSum(newArr, orgArr, target, sum + orgArr[index], index + 1);
//
//        //Recursion.backtracking
//        newArr.remove(newArr.size() - 1);
//        List<List<Integer>> notTakenAns = combinationSum(newArr, orgArr, target, sum, index + 1);
//
//        takenAns.addAll(notTakenAns);
//
//        return takenAns;
//
//    }
}
