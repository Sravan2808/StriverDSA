package StackandQueues.MonotonicStackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nextLargerElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        // BruteForce Approach TC:O(n^2) SC:O(N)
        // ArrayList<Integer> nge = new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]>arr[i]){
        //             nge.add(arr[j]);
        //             break;
        //         }
        //     }
        // }
        // return nge;
         
        //  BruteForce Approach TC:O(2N + Nlogn) SC:O(N )
        
        ArrayList<Integer> nge = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for(int i=n-1 ;i>=0;i--){
            while(!stack.empty() && stack.peek()<=arr[i]) stack.pop();
            
            if(stack.empty()) nge.add(-1);
            else nge.add(stack.peek());
            
            stack.push(arr[i]);
        }
        Collections.reverse(nge);
        return nge;
    }
    
}
