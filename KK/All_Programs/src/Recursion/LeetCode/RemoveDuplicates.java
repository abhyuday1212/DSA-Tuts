package Recursion.LeetCode;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 2, 6, 8};
        int ans = recursiveApproach(nums, 0, 0);
//        return ans;
        System.out.println(ans);

        int[] trimmedNums = Arrays.copyOf(nums, ans);

        System.out.println("Unique Count: " + ans);
        System.out.println("Trimmed Array: " + Arrays.toString(trimmedNums));
    }

    static int recursiveApproach(int[] nums, int index, int count) {
        if (nums.length == 0) {
            return 0;
        }
        if (index >= nums.length) {
//            nums[count] = nums[nums.length-1];
            return count;
        }
        System.out.println(Arrays.toString(nums));
        if (count == 0 || nums[index] != nums[count - 1]) {
            nums[count] = nums[index];
            return recursiveApproach(nums, index + 1, count + 1);
        }

        // Skip the current element if it's a duplicate
        return recursiveApproach(nums, index + 1, count);
    }
}
