package Recursion.CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    public static void main(String[] args) {
        List<List<Integer>> finalAns = new ArrayList<>();
        int[] allowedElements = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        combinationSum3(new ArrayList<>(), allowedElements, 0, 7, 3, finalAns);
        System.out.println(finalAns);

    }

    static void combinationSum3(List<Integer> ds, int[] orgArr, int index, int target, int k, List<List<Integer>> ans) {
        //if target == 0, this means that particular combination of the data structure has valid combination
        if (target == 0 && ds.size() == k) {
            ans.add(new ArrayList<>(ds));  // Add the copy of the ds, as it is being modified below
            // System.out.println(ans);
            return;
        }

        //now running loop for various number of function calls at each level
        for (int i = index; i < orgArr.length; i++) {

            if (orgArr[i] > target || ds.size() >= k)
                break;

            if (i > index && orgArr[i] == orgArr[i - 1])
                continue;


            ds.add(orgArr[i]);

            combinationSum3(ds, orgArr, i + 1, target - orgArr[i], k, ans);

            ds.remove(ds.size() - 1);


        }

    }

}
