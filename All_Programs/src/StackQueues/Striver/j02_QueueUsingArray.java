package StackQueues.Striver;

public class j02_QueueUsingArray {

    int front, rear;
    int arr[] = new int[100005];

    public j02_QueueUsingArray() {
        front = 0;
        rear = 0;
    }

    //Function to push an element x in a queue.
    void push(int x) {
        //* check for overflow
        if (rear >= 100004) {
            return;
        }

        arr[rear] = x;
        rear++;
    }

    //Function to pop an element from queue and return that element.
    int pop() {
        if (front == rear) {
            return -1;
        }

        int removedElem = arr[front];
        front++;
        return removedElem;
    }

    public static void main(String[] args) {
        j02_QueueUsingArray q = new j02_QueueUsingArray();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        System.out.println("Popped: " + q.pop());
    }
}
