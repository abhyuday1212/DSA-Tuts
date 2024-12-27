package Arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 11};
        int[] myAns = twoSum(nums, 10);
        System.out.println(Arrays.toString(myAns));
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length; i++) {
            int firstElement = nums[i];
            for (int j = i+1; j <= nums.length -1 ; j++) {
                int seccondElem = nums[j];
                int sum = seccondElem + firstElement;
                if (sum == target) {
//                    finalAns.add(i);
//                    finalAns.add(j);
//                    return finalAns;

                    return new int[]{i, j};
                }

            }
        }

        return new int[0];

    }
}
