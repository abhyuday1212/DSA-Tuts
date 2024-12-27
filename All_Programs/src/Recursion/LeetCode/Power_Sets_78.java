package Recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Power_Sets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        return generateSubsets(nums, 0);
    }

    private List<List<Integer>> generateSubsets(int[] nums, int index) {
        // Result here is a 2D array
        List<List<Integer>> result = new ArrayList<>();

        if (index == nums.length) {
            result.add(new ArrayList<>());
            return result;
        }

        // Recursive call: generate all subsets for the remaining elements
        List<List<Integer>> subsetsWithoutCurrent = generateSubsets(nums, index + 1);

        // For each subset in subsetsWithoutCurrent, add both the subset itself and
        // a new subset that includes the current element (nums[index])
        for (int i = 0; i < subsetsWithoutCurrent.size(); i++) {
            // Get the subset at index i without the current element
            List<Integer> subset = subsetsWithoutCurrent.get(i);
            result.add(new ArrayList<>(subset)); // Add subset without the current element

            // Create a new subset that includes the current element
            List<Integer> subsetWithCurrent = new ArrayList<>(subset);
            subsetWithCurrent.add(nums[index]);
            result.add(subsetWithCurrent); // Add subset with the current element
        }


        return result;
    }

    public static void main(String[] args) {
        Power_Sets_78 solution = new Power_Sets_78();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.subsets(nums);
        System.out.println(result);
    }
}
