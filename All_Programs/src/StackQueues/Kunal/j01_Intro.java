package StackQueues.Kunal;

import java.util.*;

public class j01_Intro {
    public static void main(String[] args) {
//        stackImplementation();
//        queueImplementation();
        dequeImplementation();
    }

    public static void dequeImplementation() {
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.println(deque.add(1));
        System.out.println(deque.add(2));
        System.out.println(deque.add(3));

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(deque.addAll(list));

        System.out.println(deque.pop());

        System.out.println(deque.peek());
    }

    public static void queueImplementation() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println("Removed Element: " + queue.remove());
        System.out.println("New Peek: " + queue.peek());
    }

    public static void stackImplementation() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
//        stack.elementAt()

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
