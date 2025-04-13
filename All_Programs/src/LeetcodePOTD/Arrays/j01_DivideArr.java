package LeetcodePOTD.Arrays;

import java.util.Arrays;

public class j01_DivideArr {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println(divideArray(arr));
    }

    public static boolean divideArray(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length ; i = i + 2) {
            if (nums[i] != nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean divideArrayBetter(int[] nums) {
        int[] freq = new int[501]; // since nums[i] is in range 1 to 500
        for (int num : nums) {
            freq[num]++;
        }
        for (int count : freq) {
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
