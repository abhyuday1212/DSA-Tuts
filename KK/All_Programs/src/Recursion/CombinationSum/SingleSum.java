package Recursion.CombinationSum;

// Sunsets is defined as the Permutations and combination of non-adjacent collection
/*
[3,5,6] --> [3], [3,5], [3,9], [3,5,9], [5, 9], [5], [9]
* */

//-> This pattern of taking some elements & removing same is known as this subset pattern.
// This will Always have two options either take it or ignore it.

import java.util.ArrayList;
import java.util.List;

public class SingleSum {

    public static void main(String[] args) {
        // M-9
        int[] candidates1 = {1, 2, 1};
        int n1 = candidates1.length;
        List<Integer> newArr1 = new ArrayList<>();

        List<List<Integer>> ansList1 = new ArrayList<>();
        List<List<Integer>> ans1 = subsetTargetSum(newArr1, candidates1, n1, 2, 0, 0);
        System.out.println(ans1);


        // M-10
        int[] candidates2 = {1, 2, 1};
        int n2 = candidates2.length;
        List<Integer> newArr2 = new ArrayList<>();
        List<List<Integer>> ans2 = subsetTargetSum(newArr2, candidates2, n2, 3, 0, 0);
        System.out.println(ans2);

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
}
