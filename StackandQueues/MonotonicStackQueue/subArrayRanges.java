package StackandQueues.MonotonicStackQueue;

import java.util.Stack;

public class subArrayRanges {
     int[] getNGL(int nums[],int n){
         int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.empty()) result[i] = -1;
            else{
                while(!st.empty() && nums[st.peek()]<=nums[i]) st.pop();
                result[i] = st.empty()?-1:st.peek();
            }
            st.push(i);
        }
        return result;
    }
      int[] getNGR(int nums[],int n){
         int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(st.empty()) result[i] = n;
            else{
                while(!st.empty() && nums[st.peek()]<nums[i]) st.pop();
                result[i] = st.empty()?n:st.peek();
            }
            st.push(i);
        }
        return result;
    }

    long sumMax(int nums[]){
        int n = nums.length;
        int NGL[] = getNGL(nums,n);
        int NGR[] = getNGR(nums,n);
        long sum =0;
        for(int i=0;i<n;i++){
            long ls = i-NGL[i];
            long rs = NGR[i] - i;
            long totalWays = ls*rs;
            long totalSum = (long) nums[i]*totalWays;
            sum = sum+totalSum;
        }
        return sum;
    }
    int[] getNSL(int []nums,int n){
        int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.empty()) result[i] = -1;
            else{
                while(!st.empty() && nums[st.peek()]>nums[i]) st.pop();
                result[i] = st.empty()?-1:st.peek();
            }
            st.push(i);
        }
        return result;
    }
    int[] getNSR(int nums[],int n){
         int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(st.empty()) result[i] = n;
            else{
                while(!st.empty() && nums[st.peek()]>=nums[i]) st.pop();
                result[i] = st.empty()?n:st.peek();
            }
            st.push(i);
        }
        return result;
    }
    long sumMin(int nums[]){
        int n = nums.length;
        int NSL[] = getNSL(nums,n);
        int NSR[] = getNSR(nums,n);
        long sum =0;
        for(int i=0;i<n;i++){
            long ls = i-NSL[i];
            long rs = NSR[i] - i;
            long totalWays = ls*rs;
            long totalSum = (long) nums[i]*totalWays;
            sum = sum+totalSum;
        }
        return sum;
    }
    public long subArrayRanges(int[] nums) {
        // BruteForce TC:O(N^2) SC:O(1)
        // int sum = 0;
        // for(int i=0;i<nums.length;i++){
        //     int largest = nums[i];
        //     int smallest = nums[i];
        //     for(int j=i+1;j<nums.length;j++){
        //         largest = Math.max(largest,nums[j]);
        //         smallest = Math.min(smallest,nums[j]);
        //         sum+=(largest-smallest);
        //     }
        // }
        // return sum;

        return (sumMax(nums) - sumMin(nums));
    }
    
}
