package Hashing;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        String str = "abcdaebf";
        characterHashing1(str);

    }
/*
  Ah, I see! You're interested in how the term "hash" is used in this specific Java code snippet, which employs a technique called character hashing or frequency counting using an array. It's a slightly different concept from the cryptographic hashing we were just discussing. Let's break down how it works in this context:

 In this code, the hash array isn't the result of a complex mathematical hash function like SHA-256. Instead, it's used as a direct-address table or a very simple form of hashing where the character itself (or rather, its ASCII value) acts as the "key" to directly access its count.

 Here's how it works step-by-step within the characterHashing1 method:

 Pre-computation (Building the "Hash Table"):

 int[] hash = new int[256]; An integer array named hash of size 256 is created. This array is designed to store the frequency of each possible ASCII character (since there are 256 possible ASCII values, from 0 to 255). Initially, all elements in this array are initialized to 0 by default.
 for (int i = 0; i < str.length(); i++) { ... } This loop iterates through each character in the input string str. hash[str.charAt(i)]++; This is the core of the "hashing" in this context. Let's break it down further:
 str.charAt(i): This gets the character at the current index i in the string.
 (int) str.charAt(i): When a char is used as an index for an integer array, it's implicitly converted to its ASCII (American Standard Code for Information Interchange) integer value. For example, the ASCII value of 'a' is 97, 'b' is 98, 'A' is 65, and so on.
 hash[...]++: This uses the ASCII value of the character as the index into the hash array. The ++ operator then increments the integer value at that specific index. So, if the character 'a' is encountered, hash[97] will be incremented. This effectively counts the occurrences of each character.
 System.out.println(hash[str.charAt(i)]);: This line prints the current count of the character encountered in the string as the loop progresses. This is happening during the pre-computation phase.
 Analogy: Imagine you have 256 labeled mailboxes (indexed 0 to 255). As you go through the string, for each character, you find its corresponding mailbox (based on its ASCII value) and put a counter in it. If you see the same character again, you just increment the counter in its mailbox.
*/

    //Method 1: When all characters are included
    public static void characterHashing1(String str) {
        Scanner sc = new Scanner(System.in);
        //precompute
        int[] hash = new int[256];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
            System.out.println(hash[str.charAt(i)]);
        }

        //fetching
        // Input: The line int q = sc.nextInt(); reads an integer value from the user's input. This value is then stored in the variable q. The user is essentially telling the program, "I want to ask you this many questions about the characters in the string."
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
        // for only 26 characters
        //  this code is designed to count the frequency of only the lowercase English alphabets (a through z).
        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
            /*
            str.charAt(i) - 'a': This is where the magic happens. Let's consider an example:
            If the character is 'a', its ASCII value is 97. The ASCII value of 'a' is also 97. So, 'a' - 'a'              evaluates to 97 - 97 = 0. This means the frequency of 'a' will be stored at hash[0].
            If the character is 'b', its ASCII value is 98. 'b' - 'a' evaluates to 98 - 97 = 1. The frequency             of 'b' will be stored at hash[1].
            This pattern continues for all lowercase letters. 'z' (ASCII 122) - 'a' (ASCII 97) will be 122 - 97           = 25, so the frequency of 'z' will be stored at hash[25].
            */
            System.out.println(hash[str.charAt(i)]);
        }

        //fetching
        int q = sc.nextInt();

        while (q-- > 0) {
            char ch = sc.next().charAt(0);

            System.out.println(hash[ch - 'a']);
        }
    }
}
