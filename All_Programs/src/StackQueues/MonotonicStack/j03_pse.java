package StackQueues.MonotonicStack;

import java.util.ArrayList;
import java.util.Stack;


public class j03_pse {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(6);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(1);
        ArrayList<Integer> ans = prevSmaller(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> nse = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i< A.size(); i++){
            while(!st.isEmpty() && st.peek() >= A.get(i)){
                st.pop();
            }

            if(st.isEmpty()){
                nse.add(-1);
            }
            else{
                nse.add(st.peek());
            }

            st.push(A.get(i));
        }

        return nse;
    }
}
