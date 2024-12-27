package Recursion.RecursionQuests;

import java.util.ArrayList;

public class FindAlLLIndex {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 3, 57, 4};
        int target = 0;
        findAllIndex(arr, target, 0);
        System.out.println(list);
        System.out.println(findAllIndex2(arr, 0, 0, new ArrayList<>()));
//This new ArrayList object will remain sdme throughout


        // On Running Method -3
        System.out.println(findAllIndex3(arr, 2, 0));
    }

    static ArrayList<Integer> list = new ArrayList<>();


    //    Method -1
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        findAllIndex(arr, target, index + 1);
    }


    // Method -2
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        return findAllIndex2(arr, target, index + 1, list);
//        all the list passed as a recursion function call are different refferences pointing towards same object
    }

    //Method - 3
    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelow = findAllIndex3(arr, target, index + 1);
        list.addAll(ansFromBelow);
        return list;

    }

}
