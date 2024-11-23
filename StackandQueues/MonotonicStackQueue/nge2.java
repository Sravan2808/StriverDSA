package StackandQueues.MonotonicStackQueue;

import java.util.Stack;

public class nge2 {
    public int[] nextGreaterElements(int[] nums) {
        // // BruteForce Approach TC:O(N^2) SC:O(N)
        // int n = nums.length;
        // int nge[] = new int[n];
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<1+n-1;j++){
        //         int index=j%n;
        //         if(nums[index]>nums[i]){
        //             nge[i]=nums[index];
        //             break;
        //         }
        //     }
        // }
        // return nge;
        
        // OptimizedApproach TC:O(4N) SC:O(2N)+O(N);
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!st.empty() && st.peek()<=nums[i%n]) st.pop();
            
            if(i<n){
                nge[i] = st.empty()?-1:st.peek();
            }
            st.push(nums[i%n]);
        }
        return nge;
    }
    
}
