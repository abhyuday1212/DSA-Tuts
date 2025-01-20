package Linkedlist;

public class J02_ConvertArrayToLL {
    private static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            //move the mover to temp
            mover = temp;
        }
        return head;
    }

    private static void traverseLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    private static int lenghtOfLL(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8};
        Node head = convertArrToLL(arr);
//        System.out.println(head.data);

        // Traverse a Linked List
        traverseLL(head);

        System.out.println("\nLength of LL: " +lenghtOfLL(head));



    }
}
