package Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class IntroHash {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        int n = arr.length;

        Scanner sc = new Scanner(System.in);

        //precompute
        int[] hash = new int[12]; //hash of size 0 -- 11 (12)

        System.out.println(Arrays.toString(hash));
        for (int i = 0; i < n; i++) {
            //get the hash element and update its value
            hash[arr[i]] += 1;
        }


        int q = sc.nextInt();

        while (q-- > 0) {
            int number = sc.nextInt();
            //fetching
            System.out.println(hash[number]);
        }

    }
}
