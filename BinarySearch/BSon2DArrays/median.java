public class median {
       // int mediann(int matrix[][],int R,int C){
    //     List<Integer> ls = new ArrayList<>();
    //     for(int i=0;i<R;i++){
    //         for(int j=0;j<C;j++){
    //             ls.add(matrix[i][j]);
    //         }
    //     }
    //     Collections.sort(ls);
    //     return ls.get((R*C)/2);
    // }
    

    int median(int matrix[][], int R, int C) {
        // code here 
        // BruteForce Approach Tc:O(n*m + (n*m)log(n*m))
        // int ans = mediann(matrix,R,C);
        // return ans;
        
        // optimalApproach TC:(log(10^9)*n*log(m)) SC:O(1)
        
        int low = Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int i=0;i<R;i++){
            low=Math.min(low,matrix[i][0]);
            high=Math.max(high,matrix[i][C-1]);
        }
        int req = (R*C)/2;
        while(low<=high){
            int mid=(low+high)/2;
            int smallEqual=blackBox(matrix,R,C,mid);
            if(smallEqual<=req) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
     int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] > x) {
                ans = mid;
                // look for a smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    int blackBox(int[][] matrix, int m, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            cnt += upperBound(matrix[i], x, n);
        }
        return cnt;
    }
    
}
