package Recursion.Subset;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    public static void main(String[] args) {

        int[] myArr = {1, 2};
        List<Integer> myAns = new ArrayList<>();
        subsetSum1(new ArrayList<>(), myArr, 0, myAns, 0);
        System.out.println(myAns);
    }

    static void subsetSum1(List<Integer> ds, int[] orgArr, int index, List<Integer> ans, int sum) {
        if (orgArr.length == index) {
            // a subset is found
            ans.add(sum);
            return;
            // This will give the list of subsets into the ans Arr
        }

        //take
        ds.add(orgArr[index]);

        subsetSum1(ds, orgArr, index + 1, ans, sum + orgArr[index]);

        //remove the elements that you modified
        ds.remove(ds.size() - 1);

        //not-take
        subsetSum1(ds, orgArr, index + 1, ans, sum);

    }




}
