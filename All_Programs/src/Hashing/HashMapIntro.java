package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapIntro {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 3, 2, 2, 6, 7};
        Scanner sc = new Scanner(System.in);

        //Precompute
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) {
                freq = mp.get(key);
                freq++;
            }
            mp.put(key, freq);
        }


        //fetching
        int q = 5;
        while (q-- > 0) {
            int elem = sc.nextInt();
            if (mp.containsKey(elem)) {
                System.out.println(mp.get(elem));
            } else {
                System.out.println("Element does not exist");
            }
        }
    }
}
