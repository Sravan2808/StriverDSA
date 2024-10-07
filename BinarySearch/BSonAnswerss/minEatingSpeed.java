package BinarySearch.BSon2DArrays;

public class minEatingSpeed {
    public int findMax(int piles[]){
        int n = piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]); 
        }
        return max;
    }
    public int func(int piles[],int mid){
        int totalhr=0;
        int n = piles.length;
        for(int i=0;i<n;i++){
             totalhr+=Math.ceil((double)piles[i]/(double)mid);
        }
        return totalhr;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1,high = findMax(piles);
        int ans = Integer.MIN_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            int totalhr=func(piles,mid);
            if(totalhr<=h){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
        
    }
    
}
