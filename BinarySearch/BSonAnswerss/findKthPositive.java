public class findKthPositive {
    public int findKthPositive(int[] arr, int k) {
        // Brute Force Approach TC:O(n) Sc:O(1)
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<=k) k++;
        //     else break;
        // }
        // return k;

        // OptimalApproach TC:O(logN) SC:O(1)
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k) low=mid+1;
            else high=mid-1;
        } 
        // We know that after ending coming out of the array high will point (high,low) from this low=high+1;
        return low+k; //(or) high+1+k; 
    }
    
}
