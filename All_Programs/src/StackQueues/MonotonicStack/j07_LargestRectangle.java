package StackQueues.MonotonicStack;

import java.util.Stack;

public class j07_LargestRectangle {
    public static void main(String[] args) {
        int[] arr = {3, 7, 6};
        System.out.println(largestRectangleArea(arr));
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        System.out.println(n);
        if (n == 1) return heights[0];
        if (n == 2 && heights[0] == 0 || heights[1] == 0) return Math.max(heights[0], heights[1]);


        int maxArea = 0;
        Stack<Integer> stR = pushArr(heights);
        Stack<Integer> stL = new Stack<>();
        int width = 0;

        for (int i = 1; i < n; i++) {
            if (!stR.isEmpty()) {
                stR.pop();
            }

            int ht = heights[i - 1]; // current ht

            if (ht == heights[i]) {
                width = width + 1;
                int area = ht * (width + 1);
                maxArea = Math.max(area, maxArea);
            } else {
                int rightWidth = findRightWidth(stR, heights, i - 1);
                int leftWidth = findLeftWidth(stL, heights, i - 1);

                int area = ht * (rightWidth + leftWidth + 1);
                maxArea = Math.max(area, maxArea);
            }

            stL.push(heights[i - 1]);
        }

        return maxArea;
    }

    public static int findRightWidth(Stack<Integer> stR, int[] arr, int index) {
        Stack<Integer> st = new Stack<>();
        st.addAll(stR);

        int currentHt = arr[index];
        int w = 0;

        for (int i = index + 1; i < arr.length; i++) {

            while (!st.isEmpty() && st.peek() >= currentHt) {
                w += 1;
                st.pop();
            }

            if (!st.isEmpty() && st.peek() < currentHt) {
                return w;
            }
        }

        return w;
    }

    public static int findLeftWidth(Stack<Integer> stL, int[] arr, int index) {
        Stack<Integer> st = new Stack<>();
        st.addAll(stL);

        int w = 0;
        int currentHt = arr[index];

        // if I am standing at 5 then LS => 2,1
        while (!st.isEmpty() && st.peek() >= currentHt) {
            w += 1;
            st.pop();
        }

        if (!st.isEmpty() && st.peek() < currentHt) {
            return w;
        }

        return w;
    }

    public static Stack<Integer> pushArr(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            st.push(arr[i]);
        }

        return st;
    }
}
