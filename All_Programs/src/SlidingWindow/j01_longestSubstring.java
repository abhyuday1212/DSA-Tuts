package SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class j01_longestSubstring {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        int l = 0, maxLen = 0;
        int currLen = 0;

        Map<Character, Integer> mp = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char current = s.charAt(r);

            // important after and is due to this test case: "abba"
            if (mp.containsKey(current) && mp.get(current) >= l) {
                l = mp.get(current) + 1;
            }

            mp.put(current, r);
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;

    }
}
