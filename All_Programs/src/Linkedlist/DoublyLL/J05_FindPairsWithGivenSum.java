package Linkedlist.DoublyLL;

import java.util.ArrayList;
import java.util.List;

public class J05_FindPairsWithGivenSum {
    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev); //backward connection
            prev.next = temp; //forward connection
            prev = temp;  // for iteration
        }


        return head;
    }

    private static void printDLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        Node head = convertArr2DLL(arr); // making a linked list

        ArrayList<Integer> arr2 = convertDLL2Arr(head);

        ArrayList<Integer> ds = new ArrayList<>();

        ArrayList<ArrayList<Integer>> ans = findPair(ds, arr2, 31, 0);

        System.out.println(ans);
    }

    // convert DLL 2 Arr
    public static ArrayList<Integer> convertDLL2Arr(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }

        return arr;
    }


    public static ArrayList<ArrayList<Integer>> findPair(ArrayList<Integer> ds, ArrayList<Integer> arr, int target, int index) {
        ArrayList<ArrayList<Integer>> baseResult = new ArrayList<>();
        if (arr.size() == index || target < 0) {
//            if (arr.size() == 2){
//                return baseResult;
//            }
            if (target == 0 && ds.size() == 2) {
                ArrayList<Integer> newAns = new ArrayList<>(ds);
                baseResult.add(newAns);
                return baseResult;
//            baseResult.add(ds);
//            return baseResult;
            }
            return baseResult;
        }


        ds.add(arr.get(index));
        ArrayList<ArrayList<Integer>> takenAns = findPair(ds, arr, target - arr.get(index), index + 1);
        ds.remove(ds.size() - 1); // remove the added number during backtracking steps

        ArrayList<ArrayList<Integer>> notTakeAns = findPair(ds, arr, target, index + 1);
        takenAns.addAll(notTakeAns);
        return takenAns;
    }


}
