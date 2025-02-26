package StackQueues.MonotonicStack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class j01_nge1 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] ans = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        int[] ans = new int[nums1.length];

        for (int i = nums2.length - 1; -1 < i; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            // The next greater element is the top of the stack if available; otherwise, -1.
            nextGreaterMap.put(nums2[i], st.isEmpty() ? -1 : st.peek());
            st.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreaterMap.get(nums1[i]);
        }

        return ans;
    }

}
