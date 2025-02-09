package StackQueues.Striver;

import java.util.LinkedList;
import java.util.Queue;

public class j03_StackUsingQ {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int front;

    public j03_StackUsingQ() {
        front = -1;
    }

    public void push(int x) {
        q2.add(x);

        front = x;

        // Transfer all the elements from q1 to q2, for reversing the queue
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap q1 and q2.
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

    }

    public int pop() {
        int popped = q1.remove();

        if (!q1.isEmpty()) {
            front = q1.peek();
        } else {
            front = -1;
        }

        return popped;
    }

    public int top() {
        return front;
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        j03_StackUsingQ stack = new j03_StackUsingQ();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Popped element is: " + stack.pop());
//
        System.out.println("Top element is now: " + stack.top());
//        System.out.println("Top element is now: " + stack.top());
//
//        System.out.println("Is stack empty? " + stack.empty());
    }
}
