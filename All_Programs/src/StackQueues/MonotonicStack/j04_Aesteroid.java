package StackQueues.MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class j04_Aesteroid {
    public static void main(String[] args) {
        int arr[] = {8,10, -8};
        int[] ans = asteroidCollision(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] < 0) { // compare with st.peek
                while (!st.isEmpty() && Math.abs(asteroids[i]) > st.peek()) {
                    st.pop();
                }

                if (!st.isEmpty() && Math.abs(asteroids[i]) == st.peek()) {
                    st.pop();
                } else if (st.isEmpty() && st.peek() < 0) {
                    st.push(asteroids[i]);
                }

            } else {
                // for possitive arr[i] vals

                st.push(asteroids[i]);

            }

        }

        int[] arr = new int[st.size()];
        int index = 0;
        if (st.isEmpty()) {
            return new int[0];
        }

        while (!st.isEmpty()) {
            arr[index] = st.peek();
            st.pop();
            index++;
        }

        return arr;
    }
}
