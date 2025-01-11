package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeaderArray {
    public static void main(String[] args) {
        int[] arr1 = {51, 87};
        ArrayList<Integer> listAns = leaders2(arr1);
        System.out.println(listAns);
    }

    //M1: Optimal
    //Optima:
    static ArrayList<Integer> leaders2(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int maxVal = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {

            if (arr[i] >= maxVal) {
                list.add(arr[i]);
            }

            maxVal = Math.max(maxVal, arr[i]);
        }

        Collections.reverse(list);

        return list;

    }


    // Brute force which required a lot of handling
    static ArrayList<Integer> leaders(int arr[]) {

        // brute Force approach: we use two for loop to calculate the list

        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int flag = 0;

        if (arr.length == 0) return new ArrayList<>();

        else if (arr.length == 1) {
            list.add(arr[0]);
            return list;
        } else if (arr.length == 2) {
            if (arr[0] != arr[1]) {
                list.add(arr[0]);
                list.add(arr[1]);
            } else return new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (arr[i] >= arr[j]) {
                    // the current element is a Leader
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}
