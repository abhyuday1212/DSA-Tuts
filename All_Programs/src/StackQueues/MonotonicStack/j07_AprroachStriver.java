package StackQueues.MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class j07_AprroachStriver {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println(Arrays.toString(arr));
        System.out.println(largestRectangleArea(arr));
    }

    public static int largestRectangleArea(int[] heights) {
        int[] prevSmall = findPrevSmall(heights);
        int[] nextSmall = findNextSmall(heights);
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            int currHt = heights[i];
            int w = nextSmall[i] - prevSmall[i] - 1;
            int area = Math.abs(w) * currHt;
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }

    public static int[] findPrevSmall(int[] arr) {
        int[] ans = new int[arr.length];

        ans[0] = 0;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        return ans;
    }

    public static int[] findNextSmall(int[] arr) {
        int[] ans = new int[arr.length];
        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }

        return ans;
    }

}
