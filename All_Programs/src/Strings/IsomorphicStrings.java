package Strings;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";


        if (s.length() != t.length()) {
            System.out.println("false");
//            return false;
        }
        //preCompute and asigninng values
        boolean isomorphic = true;

        HashMap<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char secChar = t.charAt(i);
            if (mp.containsKey(key)) {
                if (mp.get(key) != secChar) {
                    isomorphic = false;
//                    return false; // Inconsistent mapping
                }
//                break;
                isomorphic = false;
            }

            mp.put(key, secChar);
        }

        // now check weather it is isomorphic or not
        for (int i = 0; i < s.length(); i++) {
            // now for every key and its coressponding value, check weather in the seccond string it is same or not
            char currElem = s.charAt(i);
            if (mp.containsKey(currElem)) {
                // current Element Value r character at that position is
                if (mp.get(currElem) == t.charAt(i)) {
                    continue;
                } else {
                    isomorphic = false;
                }
            } else {
                isomorphic = false;
            }
        }

        System.out.println(isomorphic);

        System.out.println(mp.toString());
    }
}
