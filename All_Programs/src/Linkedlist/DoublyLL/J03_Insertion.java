package Linkedlist.DoublyLL;

public class J03_Insertion {
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


        printDLL(insertAtK(head, 10, 1));
    }

    //Insert Before the kth node of the linked list

    private static Node insertAtK(Node head, int val, int k) {

        if (head == null && k == 0) {
            return new Node(val);
        }

        Node prev = head;
        Node temp = head;
        int count = 0;


        if (k == 1) {
            Node newNode = new Node(val, head, null);
            head.back = newNode;
            return newNode;
        }

        while (temp.next != null) {//Stopping at the last index
            count++;
            if (count == k) {
                Node newNode = new Node(val, prev.next, temp.back);
                temp.back = newNode;
                prev.next = newNode;
            }
            prev = temp;
            temp = temp.next;
        }
        //handle for if inserted at last index
        // a-b-c-d(prev)-e(temp)
        // a-b-c-d-e-f
        temp.next = new Node(val, null, temp);


        return head;


    }

    private static Node addNode(Node head, int p, int x) {

        if (head == null) {
            return new Node(x);
        }

        Node prev = head;
        Node temp = head;
        int count = 0;


        if (p == 0) {
            Node newNode = new Node(x);
            newNode.next = head;
            newNode.back = null;

            if (head != null) {
                head.back = newNode;
            }

            return newNode;
        }

        while (temp != null && count <= p) {
            prev = temp;
            temp = temp.next;
            count++;
        }


        if (count > p) {
            Node newNode = new Node(x);
            newNode.next = temp;
            newNode.back = prev;

            if (temp != null) {
                temp.back = newNode;
            }

            if (prev != null) {
                prev.next = newNode;
            }
        }

        return head;

    }
}
