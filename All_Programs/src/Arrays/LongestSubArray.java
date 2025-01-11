package Arrays;

import java.util.Arrays;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr1 = {100, 4, 200, 1, 3, 2};
        int ans = longestConsecutive(arr1);
        System.out.println(ans);
    }

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if (n == 0)
            return 0;

        int maxLength = 1;
        int count = 1;


        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) continue;

            if (nums[i] == 1 + nums[i - 1]) {
                count++;
                maxLength = Math.max(count, maxLength);
            } else {
                count = 1;
            }
        }

        return maxLength;

    }
}
