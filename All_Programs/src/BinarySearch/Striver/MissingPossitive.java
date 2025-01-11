package BinarySearch.Striver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MissingPossitive {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int ans = -1;

        HashMap<Integer, Integer> mp = new HashMap<>(1000);
        // precompute

        // int maxElem = "";
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            mp.put(key, mp.getOrDefault(key, 0) + 1);
        }

        for (int i = 1; i < 1000; i++) {
            int key = i;
            if (mp.get(key) == null) {
                mp.put(key, 0);
            } else {
                continue;
            }
        }

//         System.out.println(mp);

        List<Integer> emptyList = new ArrayList<>();

        if (mp.size() < k)
            return -1;
        // if the elements to be found is greater than the number of elements in the emptly list than the elements cannot be found

        // create an empty list and a filter that only those values are added to the
        // list whose values are == 0;

        for (Integer key : mp.keySet()) {
//            System.out.println(key);
            if (mp.get(key) != 1) {
                emptyList.add(key);
            }
        }

        return emptyList.get(k-1);

//        for (int i = 1; i <= k; i++) {
//            if (i == k) {
//                ans = emptyList.get(i - 1);
//            }
//        }
//
//        return ans;

    }
}

