package Recursion.Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetExistOrNot {
    public static void main(String[] args) {

        int[] myArr = {42, 46, 43, 28, 37, 42, 5, 3, 4};
        int target = 5;
        System.out.println(isSubsetExist(myArr, 0, 9, 3));
    }

    /*You are given an array 'A' of 'N' integers. You have to return true if there exists a subset of elements of 'A' that sums up to 'K'. Otherwise, return false.*/

    public static boolean isSubsetExist(int[] orgArr, int index, int n, int target) {
        if (target == 0) {
            return true;
        }

        if (index == n || target < 0) {
            return false; // End of array or target not achievable
        }

        if (target < orgArr[index]) {
            return false; // No need to check further
        }


        //take
        boolean takenAns = isSubsetExist(orgArr, index + 1, n, target - orgArr[index]);

        //not take
        boolean notTakenAns = isSubsetExist(orgArr, index + 1, n, target);

        return takenAns || notTakenAns;
    }
}
