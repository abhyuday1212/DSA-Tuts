package Linkedlist;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class J01_LinkedList {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8};
        Node y = new Node(arr[0]);
        System.out.println(y.data);
        System.out.println(y.next);


        Node y2 = new Node(arr[1]);
        System.out.println(y2.data);
        System.out.println(y2.next);
    }
}
