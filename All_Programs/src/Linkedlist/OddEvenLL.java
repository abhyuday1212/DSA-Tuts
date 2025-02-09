package Linkedlist;

public class OddEvenLL {
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
        int[] arr = {1, 2, 3, 4, 5, 6,7};
        Node head = convertArr2LL(arr);
        printLL(oddEvenList(head));
    }

    public static Node oddEvenList(Node head) {
        if (head == null && head.next == null) {
            return head;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while ( even != null && even.next != null) {
//            prev = odd;
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next; //iteration
            even = even.next.next; //iteration
        }

        odd.next = evenHead;
        return head;
    }
}
