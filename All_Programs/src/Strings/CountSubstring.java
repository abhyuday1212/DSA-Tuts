package Strings;

import java.util.ArrayList;
import java.util.List;

public class CountSubstring {
    public static void main(String[] args) {
        List<String> ans = countSubstr("", "aba", 2);
        System.out.println(ans);
    }

    public static List<String> countSubstr(String ds, String orgStr, int k) {

        if (orgStr.isEmpty()) {
            List<String> baseResult = new ArrayList<>();
            if (ds.length() == k) {
                baseResult.add(ds);
            }
            return baseResult;
        }
        char ch = orgStr.charAt(0);
        List<String> ans = new ArrayList<>();

        //Take
        List<String> takenAns = countSubstr(ds + ch, orgStr.substring(1), k);

        //Not-take
        List<String> notTakenAns = countSubstr(ds, orgStr.substring(1), k);

        takenAns.addAll(notTakenAns);
        return takenAns;
    }
}
