package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class j02_characterReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("KRSCDCSONAJNHLBMDQGIFCPEKPOHQIHLTDIQGEKLRLCQNBOHNDQGHJPNDQPERNFSSSRDEQLFPCCCARFMDLHADJADAGNNSBNCJQOF", 1));
    }

    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> mp = new HashMap<>();
        char maxChar = s.charAt(0);
        int maxCount = 0;

        // pre compute
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            int count = mp.getOrDefault(key, 0) + 1;
            mp.put(key, count);

            if (count > maxCount) {
                maxCount = count;
                maxChar = key;
            }
        }

        System.out.println("Max character: " + maxChar + " with count: " + maxCount);

        // max

        return longestRepeatingChars(s, k, maxChar);
    }

    public static int longestRepeatingChars(String str, int k, char maxChar) {
        int l = 0, r = 0, maxLen = 0;
        int zeros = 0;
        int len = 0;
        char[] charArr = str.toCharArray();

        while (r < charArr.length) {
            int curr = charArr[r];

            if (curr == 0) {
                zeros++;
            }

            // break condition
            while (zeros > k) {
                // if the encountered number is zero
                if (charArr[l] != maxChar) {
                    zeros--;
                }
                l++;
            }

            // Check the length
            if (zeros <= k) {
                len = r - l + 1;
                maxLen = Math.max(maxLen, len);
            }

            r++;
        }

        return maxLen;

    }
}
