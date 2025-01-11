package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMap {
    public static void main(String[] args) {
        String s = "tree";
        StringBuilder ans = new StringBuilder(s.length());

        // precompute
        Map<Character, Integer> mp = new HashMap<>();
        for (char key : s.toCharArray()) {
            mp.put(key, mp.getOrDefault(key, 0) + 1);
        }

        List<Character> list = new ArrayList<>(mp.keySet());

        //Sort the List
        // This Method of sorting was failing for extremely large integer
        list.sort((ob1, ob2) -> mp.get(ob2) - mp.get(ob1));

        list.sort((ob1, ob2) -> Integer.compare(mp.get(ob2), mp.get(ob1)));

        for (char key : list) {
            for (int i = 0; i < mp.get(key); i++) {
                ans.append(key);
            }
        }

        System.out.println(ans.toString());
    }

}
