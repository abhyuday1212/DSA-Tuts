package Linkedlist;

public class J04_Insertion {
    private static void traverseLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

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

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 9};
        Node head = convertArr2LL(arr);

        //Insert at the start
//        traverseLL(insertStart(head, 12));

        // Insert at the Last
//        traverseLL(insertTail(head, 12));

        // Insert at the k
        traverseLL(insertAtK(head, 12,3));
    }

    private static Node insertStart(Node head, int el) {
        return new Node(el, head);
//        temp.next = head;
    }

    private static Node insertTail(Node head, int el) {
        if (head == null) {
            return new Node(el);
        }

        Node temp = head;

        while (temp.next != null) { // stop when you are at the last element
            temp = temp.next;
        }
        temp.next = new Node(el);

        return head;
    }

    private static Node insertAtK(Node head, int val, int index){
        if (head == null) return new Node(val);

        if(head.next == null){
            if (index == 1) {
                return new Node(val,head);
            }
            return head;
        }

        int count = 0;
        Node temp =head;

        while(temp != null){
            count++;

            if (count == index -1){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }

        return head;
    }
}
