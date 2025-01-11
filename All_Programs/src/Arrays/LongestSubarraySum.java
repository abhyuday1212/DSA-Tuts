package Arrays.RotateArray;

public class LongestSubarraySum {
    public static void main(String[] args) {

    }


    // optimal only for possitive
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int left = 0, right = 0;
        int n = a.length;

        long sum = 0;
        int maxLength = 0;

        while (right < n) {

            sum = sum + a[right];

            while (sum > k && left <= right) {
                sum = sum - a[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++;
        }

        return maxLength;

    }

    //Better
    // M-2
    public static int maxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
    }
}