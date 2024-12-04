package StackandQueues.MonotonicStackQueue;

import java.util.Stack;

public class asteroidCollision {
     public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int a : asteroids){
            // When collision happens
            while(!st.empty() && st.peek()>0 && a<0){
                int sum = a+st.peek();
                if(sum<0){
                    st.pop();
                }else if(sum>0){
                     a=0;
                     break;                   
                }else{//sum=0
                    st.pop();
                    a=0;
                }
            }
            if(a!=0){
                st.push(a);
            }
        }
        int s = st.size();
        int result[] = new int[s];
        int i=s-1;
        while(!st.empty()){
            result[i]=st.peek();
            st.pop();
            i--;
        }
        return result;
    }
    
}
