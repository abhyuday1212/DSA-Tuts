package Linkedlist.DoublyLL;

public class J04_ReverseDLL {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        Node head = convertArr2DLL(arr);


        printDLL(reverseDLL(head));
    }

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

    private static Node reverseDLL(Node head) {
        if (head == null || head.next == null) return head;

        Node temp = null;
        Node current = head;

        while (current != null) {
            temp = current.back;
            current.back = current.next;
            current.next = temp;
            current = current.back;
        }

        head = temp.back;


        return head;
    }
}
