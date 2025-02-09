package StackQueues.Striver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class j04_QUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public j04_QUsingStack() {

    }

    public void push(int x) {
        stack1.add(x);
        return;
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.peek());
                stack1.pop();
            }
        }

        //now all the elements are in stack 2
        int poppedElem = stack2.peek();
        stack2.pop();
        return poppedElem;
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.peek());
                stack1.pop();
            }
        }

        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        j04_QUsingStack q = new j04_QUsingStack();


        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);


        System.out.println("Popped element is: " + q.pop()); // Uses your pop() method
        System.out.println("Top element is now: " + q.peek()); // Uses your peek() method
    }


}
