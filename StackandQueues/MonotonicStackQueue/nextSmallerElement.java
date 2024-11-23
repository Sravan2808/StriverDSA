package StackandQueues.MonotonicStackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nextSmallerElement {
     static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n) {
    ArrayList<Integer> nse = new ArrayList<>(); // Initialize result with -1
    Stack<Integer> st = new Stack<>();

    // Traverse the array from right to left
    for (int i = n - 1; i >= 0; i--) {
        // Remove elements from the stack that are not smaller
        while (!st.isEmpty() && st.peek() >= arr.get(i)) {
            st.pop();
        }

        // If stack is not empty, the top is the next smaller element
        if (!st.isEmpty()) {
            nse.add(st.peek());
        }
        else nse.add(-1);

        // Push the current element onto the stack
        st.push(arr.get(i));
    }
    Collections.reverse(nse);

    return nse;
}
    
}
