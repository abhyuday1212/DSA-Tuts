package Linkedlist;

public class J05_ReverseLL {
    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    private static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArr2LL(arr);
        printLL(reverseList(head));
    }

    public static Node reverseList(Node head) {
        Node temp = head;
        Node last = head;
        Node front = head.next;

        while (temp.next != null) {
            temp.next = last;
            front.next = temp;


            // for iteration of last
            // for iteration of temp
            front = front.next;
        }

        return temp;

    }
}
