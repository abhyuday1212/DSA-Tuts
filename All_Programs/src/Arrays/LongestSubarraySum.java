package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public class LongestSubarraySum {
    public static void main(String[] args) {

//        int[] arr2 = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10};
//        long ans = maxSubArray(arr2);
//        System.out.println(ans);

//        -----------------------
//        int[] arr4 = {4, 3, 1, 5, 6};
//        int myAns4 = printMaxSubArray(arr4);
//        System.out.println(myAns4);
//        -----------------------

        int[] arr5 = {12, 35, 1, 10, 34, 1};
        int myAns5 = maxSumFromMinsInSubArray(arr5);
        System.out.println(myAns5);
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
//     M-2
    public static long maxSubarraySum2(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        // long maxSum = Integer.MIN_VALUE;
        long maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            long sum = 0; // Use long for sum to avoid overflow

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
    }


    // M-3 : Kadanes Algorithm
    public static int maxSubArray3(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }


        // long maxSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;

            }
            if (sum < 0) {
                sum = 0;
                continue;
            }
        }

        return maxSum;
    }


    // M-4 : GFG, Getting the maximum Subarray
    public static int printMaxSubArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        List<Integer> list = new ArrayList<>();


        // long maxSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;

        int sum = 0;

        int ansStart = -1;
        int ansEnd = -1;
        int start = 0;
        List<Integer> subArr = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                start = i;
                subArr.add(arr[i]);
            }

            subArr.add(arr[i]);


            if (sum > maxSum) {
                ansStart = arr[start];
                ansEnd = arr[i];

                maxSum = ansStart + ansEnd;
            }

            System.out.println(subArr);

        }


        return maxSum;
    }

    // M-5 : GFG, Getting the maximum Subarray
    public static int maxSumFromMinsInSubArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        // long maxSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            List<Integer> ds = new ArrayList<>();

            for (int j = i; j < arr.length; j++) {
                ds.add(arr[j]);

                // find Minimum and seccond Minimum elements from the given array
                int firstMin = Collections.min(ds); //gives the first minimum element in the ds
                int secondMin = findSecondMin(ds, firstMin); //gives the seccond minimum element in the ds
                // and sum them up,
                sum = firstMin + secondMin;

                // if their sum is greater from the present ds, then modify the value of the maxSum
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }

        }


        return maxSum;
    }

    public static int findSecondMin(List<Integer> arr, int firstMin) {

        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > firstMin && num < second) {
                second = num;
            }
        }

        return second == Integer.MAX_VALUE ? 0 : second;
    }


}