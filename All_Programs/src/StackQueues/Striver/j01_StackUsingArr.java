package StackQueues.Striver;

public class j01_StackUsingArr {
    private int[] arr;
    private int top;

    private j01_StackUsingArr() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // what if the size of the stack is full
        if (top >= 999) { //* Stack Overflow check
            System.out.println("Stack Overflow! Cannot push " + x);
            return;
        }

        top++;
        arr[top] = x;
    }

    public int pop() {
        if (top == -1) { //* Stack UnderFlow check
            System.out.println("Stack Underflow! Nothing to pop.");
            return -1;
        }

        int poppedElem = arr[top];
        top--;
        return poppedElem;
    }

    public static void main(String[] args) {
        j01_StackUsingArr stack = new j01_StackUsingArr(); // Create stack object
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop());
    }
}
