package SlidingWindow;

public class j03_binarySubArr {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0};
        int goal = 0;
        System.out.println(numSubarraysWithSum(arr, goal));
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int l = 0, r = 0, count = 0;
        int subArrSum = 0;
        int n = nums.length;

        while (r < n) {
            subArrSum += nums[r];

            // break condition
            if (subArrSum > goal) {
                subArrSum -= nums[l];
                l++;
            }

            if (subArrSum == goal) {
                count++;
            }

            r++;
        }

        while (subArrSum == goal && l < n - 1) {
            l++;
            count++;
            subArrSum -= nums[l];
        }


        return count;
    }
}
