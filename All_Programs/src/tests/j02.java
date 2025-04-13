package tests;

import java.util.*;


public class j02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            String S = scanner.next();
            System.out.println(findLongestFlatSubstring(S));
        }
        scanner.close();
    }


    public static int findLongestFlatSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int left = 0;

        Map<Character, Integer> freqMap = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

            while (!isFlat(freqMap, right - left + 1)) {
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                if (freqMap.get(leftChar) == 0) {
                    freqMap.remove(leftChar);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    private static boolean isFlat(Map<Character, Integer> freqMap, int length) {
        int threshold = length / 2;
        for (int freq : freqMap.values()) {
            if (freq >= threshold) {
                return true;
            }
        }
        return false;
    }
}
