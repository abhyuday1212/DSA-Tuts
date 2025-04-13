package tests;

import java.util.*;
import java.io.*;


public class j01 {
    public static void main(String[] args) throws IOException { // Add "throws IOException"
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // Read number of test cases
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine()); // Read N
            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] left = new int[N];
            int[] right = new int[N];

            // Stack for finding left boundaries
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < N; i++) {
                while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                    stack.pop();
                }
                left[i] = stack.isEmpty() ? 0 : (stack.peek() + 1);
                stack.push(i);
            }

            stack.clear();

            // Stack for finding right boundaries
            for (int i = N - 1; i >= 0; i--) {
                while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                    stack.pop();
                }
                right[i] = stack.isEmpty() ? (N - 1) : (stack.peek() - 1);
                stack.push(i);
            }

            // Compute and store the result
            for (int i = 0; i < N; i++) {
                sb.append(right[i] - left[i] + 1).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}


