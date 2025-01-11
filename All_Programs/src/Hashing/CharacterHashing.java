package Hashing;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        String str = "abcdaebf";
        characterHashing1(str);

    }

    //Method 1: When all characters are included
    public static void characterHashing1(String str) {
        Scanner sc = new Scanner(System.in);
        //precompute
        int[] hash = new int[256];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }

        //fetching
        int q = sc.nextInt();

        while (q-- > 0) {
            char ch = sc.next().charAt(0);

            System.out.println(hash[ch]);
        }
    }

    //Method 2: When all characters are included
    public static void characterHashing2(String str) {
        Scanner sc = new Scanner(System.in);
        //precompute
        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }

        //fetching
        int q = sc.nextInt();

        while (q-- > 0) {
            char ch = sc.next().charAt(0);

            System.out.println(hash[ch - 'a']);
        }
    }
}
