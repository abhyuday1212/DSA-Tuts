package Linkedlist;

public class J03_DeleteLL {
    //convert arr to LL
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

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 6};
        Node head = convertArrToLL(arr);

        //delete head
//        traverseLL(deleteHead(head));

        // delete tail
//        traverseLL(deleteTail(head));

        //delete the k-th element index
//        traverseLL(deleteK(head, 1));

        //delete the k-th element
        traverseLL(deleteEl(head, 5));

    }


    //M-1 :  Delete from start
    private static Node deleteHead(Node head) {

        if (head == null || head.next == null) return null;

        head = head.next;

        return head;
    }

    //M-2 : Delete the tail
    private static Node deleteTail(Node head) {
        if (head == null || head.next == null) return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    //M-3 : Delete the kth index element
    private static Node deleteK(Node head, int k) {
        if (head == null) return head;

        if (k == 1) {
            head = head.next;
            return head;
        }

        int count = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    //M-4 : Delete the kth element directly
    private static Node deleteEl(Node head, int el) {
        if (head == null) return null;

        if (head.data == el) {
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;

        while (temp.next != null) {
            if (temp.data == el) {
                prev.next = prev.next.next;
                break;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }

}
