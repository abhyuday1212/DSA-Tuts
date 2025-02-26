package StackQueues.MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class j02_NGE2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = nextGreaterElements(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];

            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            // Only update the answer when i is in the first pass (i < n)
            if (i < n) {
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(curr);
        }

        return ans;
    }

}
