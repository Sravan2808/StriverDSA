package StackandQueues.Learning;

import java.util.Stack;

public class MyQueueStack {
     Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack();
        st2 = new Stack();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        if(st1.empty() && st2.empty()) return -1;
        if(st2.empty()){
            while(!st1.empty()){
                st2.push(st1.pop());
            }
        }
        int ele = st2.pop();
        return ele;
        
    }
    
    public int peek() {
        if(st2.empty()){
            while(!st1.empty()) st2.push(st1.pop());
        }
        return st2.empty()?-1:st2.peek();
    }
    
    public boolean empty() {
        return st2.empty()&&st1.empty();
    }
    
}
