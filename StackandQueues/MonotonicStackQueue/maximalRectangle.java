package StackandQueues.MonotonicStackQueue;

import java.util.Stack;

class Solution {
    int findMaxArea(int height[]){
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];
        int width[] = new int[n];

        for(int i=0;i<n;i++){
            while(!st.empty() && height[st.peek()]>=height[i]) st.pop();
            if(st.empty()) leftSmall[i]=0;
            else leftSmall[i] = st.peek()+1;
            st.push(i);
        }

        while(!st.empty()) st.pop();

        for(int i=n-1;i>=0;i--){
            while(!st.empty() && height[st.peek()]>=height[i]) st.pop();
            if(st.empty()) rightSmall[i]=n-1;
            else rightSmall[i] = st.peek()-1;
            st.push(i);
        }
        int max = 0;
        for(int i=0;i<n;i++){
            width[i] = (rightSmall[i]-leftSmall[i]+1);
            max = Math.max(max,height[i]*width[i]);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int height[] = new int[m];
         
        
        int maxArea= 0;

        for(int row = 0; row < n; row++){
            for(int col =  0; col < m; col++){
                if(matrix[row][col] == '0'){
                    height[col] = 0;
                }else{
                    height[col]+=1;
                }
            }
            maxArea = Math.max(maxArea,findMaxArea(height));
        }
        return maxArea;
        
    }
}
    

