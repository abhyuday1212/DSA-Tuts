package arrays;

import java.util.*;

public class solution2 {

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        // Copy elements from nums to ans
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }

        // Copy elements from nums to ans again

        for (int i = 0; i < n; i++) {
            ans[i + 1] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = getConcatenation(nums);

        for (int element : result) {
            System.out.print(element + " ");
        }
        System.out.println();

    }


}
