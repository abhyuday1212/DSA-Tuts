package Linkedlist.DoublyLL;

public class J02_Deletion {
    private static void printDLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

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

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 3};
        Node head = convertArr2DLL(arr);

//        printDLL(deleteKIndex(head, 3));


        deleteNode(head.next);
        printDLL(head);
    }

    private static Node deleteKIndex(Node head, int x) {

        if (x == 1) {
            Node prev = head;
            head = head.next;
            head.back = null;
            prev.next = null;

            return head;
        }

        Node temp = head;
        Node prev = head;
        int count = 0;
        boolean flag = false;


        while (temp.next != null) {
            count++;
            if (count == x) {
                //perform deletion
                flag = true;
                prev.next = temp.next; // forward connection bn gya
                temp.next.back = prev; // backward connection bn gya


                temp.back = null;
                return head;
                // break;
            }

            // for iterations
            prev = temp;
            temp = temp.next;

        }

        if (!flag) {
            prev.next = null;
            temp.back = null;
        }


        return head;
    }


    //    ----------------------------
    private static void deleteNode(Node temp) {
        Node prev = temp.back;
        Node front = temp.next;

        if (front == null) {
            temp.back = null;
            prev.next = null;
            return;
        }

        // a-b-c
        prev.next = front;
        front.back = prev;

        temp.next = temp.back = null;
        return;
    }
}
