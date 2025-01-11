package Arrays.RotateArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] a = {-7, 8};
        int[] b = {-8, -3, 8};

        ArrayList<Integer> ans = findUnion(a, b);

        System.out.println(ans);

    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n1 = a.length;
        int n2 = b.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> unionArr = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
            } else { // b[j] < a[i]
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                    unionArr.add(b[j]);
                }
                j++;
            }
        }

        while (j < b.length) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                unionArr.add(b[j]);
            }
            j++;
        }

        // Add remaining elements from array a
        while (i < a.length) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                unionArr.add(a[i]);
            }
            i++;
        }

        return unionArr;
    }


// BruteForce
//    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
//            ArrayList<Integer> temp = new ArrayList<>();
//            Arrays.sort(a);
//            Arrays.sort(b);
//
//            Set<Integer> sortedSet = new TreeSet<>();
//
//            for (int i = 0; i< a.length; i++){
//                sortedSet.add(a[i]);
//            }
//
//            for (int i = 0; i< b.length; i++){
//                sortedSet.add(b[i]);
//            }
//
//            temp.addAll(sortedSet);
//
//            return temp;
//
//    }


//    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
//        ArrayList<Integer> temp = new ArrayList<>();
//
//
//        if (a.length >= b.length) {
//            for (int i = 1; i < b.length; i++) {
//                if (b[i-1] == b[i] ) {
//                    continue;
//                }
//                if (b[i - 1] == a[i-1]) {
//                    // If at index i, the character of a and b are same then only
//                    temp.add(a[i-1]);
//                } else if (b[i-1] < a[i-1]) {
//                    temp.add(b[i-1]);
//                    temp.add(a[i-1]);
//                } else {
//                    temp.add(a[i-1]);
//                    temp.add(b[i-1]);
//                }
//            }
//
//            for (int i = temp.size(); i < a.length; i++) {
//                temp.add(a[i]);
//            }
//        } else { //b> a
//            for (int i = 0; i < a.length; i++) {
//                if (b[i] == a[i]) {
//                    // If at index i, the character of a and b are same then only
//                    temp.add(b[i]);
//                } else if (b[i] < a[i]) {
//                    temp.add(b[i]);
//                    temp.add(a[i]);
//                } else {
//                    temp.add(a[i]);
//                    temp.add(b[i]);
//                }
//            }
//
//            for (int i = temp.size(); i < b.length; i++) {
//                temp.add(b[i]);
//            }
//        }
//
//        return temp;
//
//    }


}
