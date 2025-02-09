package Linkedlist;

public class SortALL {

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
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 2, 2, 1};
        Node head = convertArr2LL(arr);
        printLL(segregate(head));
    }

    private static Node segregate(Node head) {
        Node temp1 = new Node(-1); //for Storing 0s
        Node temp2 = new Node(-1); //for Storing 1s
        Node temp3 = new Node(-1);  // for storing 2s

        Node temp1Head = temp1;
        Node temp2Head = temp2;
        Node temp3Head = temp3;

        Node temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                temp1.next = temp;
                temp1 = temp;
            } else if (temp.data == 1) {
                temp2.next = temp;
                temp2 = temp;
            } else if (temp.data == 2) {
                temp3.next = temp;
                temp3 = temp;
            }

            temp = temp.next;
        }

        temp1.next = temp2Head.next != null ? temp2Head.next : temp3Head.next;
        temp2.next = temp3Head.next;
        temp3.next = null;


        return temp1Head.next;
    }
}
