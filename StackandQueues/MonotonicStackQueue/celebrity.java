package StackandQueues.MonotonicStackQueue;

import java.util.Stack;

public class celebrity  {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int n = mat[0].length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(mat[v1][v2] == 0){
                st.push(v1);
            }
            else if(mat[v2][v1] == 0){
                st.push(v2);
            }
            if(st.size() == 0) return -1;
        }
        int potential = st.pop();
        for(int j=0;j<n;j++){
            if(mat[potential][j] == 1) return -1;
        }
        for(int i=0;i<n;i++){
            if(i==potential) continue;
            if(mat[i][potential] == 0) return -1;
        }
        return potential;
    }
}
