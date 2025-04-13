package StackQueues.MonotonicStack;

import java.util.Arrays;

public class j06_TrapRainwater {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};

        //M-1
        int ans = trap(arr);
//        System.out.println();

        // M-2
    }


    //--------------------- Method: 1
    /*
     * Tc: O(2n{prefixMax & suffixMax}) + O(main loop)
     * SC: o(2n)
     * */
    public static int trap(int[] height) {
        int sum = 0;
        int n = height.length;
        int[] leftMax = prefixMax(height);
        int[] rightMax = suffixMax(height);

        for (int i = 0; i < n; i++) {
            if (height[i] < leftMax[i] && height[i] < rightMax[i]) {
                sum = sum + (Math.min(leftMax[i], rightMax[i])) - height[i];
            }
        }

        return sum;
    }

    public static int[] prefixMax(int[] height) {
        // it has similar concept of prefixMax
        int[] prefix = new int[height.length];
        int n = height.length;

        prefix[0] = height[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(height[i], prefix[i - 1]);
        }
        System.out.println(Arrays.toString(prefix));

        return prefix;
    }

    public static int[] suffixMax(int[] height) {
        // it has similar concept of suffixMax
        int[] suffix = new int[height.length];
        int n = height.length;

        suffix[n - 1] = height[n - 1];

        for (int i = n - 2; 0 <= i; i--) {
            suffix[i] = Math.max(height[i], suffix[i + 1]);
        }
        System.out.print(Arrays.toString(suffix));


        return suffix;
    }
}
