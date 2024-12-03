package StackandQueues.MonotonicStackQueue;

import java.util.Stack;

public class sumSubarrayMins {
    int[] getNSL(int[] arr ,int n){
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            if(st.empty()) result[i] = -1;
            else{
                while(!st.empty() && arr[st.peek()]>arr[i]) st.pop();
                result[i] = st.empty()?-1:st.peek();
            }
            st.push(i);
        }
        return result;
    }
    int[] getNSR(int[] arr ,int n){
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            if(st.empty()) result[i] = n;
            else{
                while(!st.empty() && arr[st.peek()]>=arr[i]) st.pop();
                result[i] = st.empty()?n:st.peek();
            }
            st.push(i);
        }
        return result;
    }
    public int sumSubarrayMins(int[] arr) {
        // BruteForce Appraoch TimeComplexity:O(N^2) SpaceComplexity:O(1)
        // int sum = 0;
        // int mod = (int)1e9+7;
        // for (int i = 0; i < arr.length; i++) {
        //     int mini = arr[i];
        //     for (int j = i; j < arr.length; j++) {
        //         mini=Math.min(mini, arr[j]);
        //         sum = (sum + mini)% mod;
        //     }
        // }

        // return sum;

        // By using Stack
        int n = arr.length;
        int[] NSL = getNSL(arr,n);
        int[] NSR = getNSR(arr,n);
        long sum =0;
        int mod =(int) 1e9+7;

        for(int i=0;i<n;i++){
            long ls = i-NSL[i];
            long rs = NSR[i]-i;

            long totalWays = ls*rs;

            long totalSum = arr[i]*totalWays;
            sum =(sum+totalSum)%mod;

        }
        return (int) sum;
    }
}
