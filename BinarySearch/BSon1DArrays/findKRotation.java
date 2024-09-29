public class findKRotation {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int n=arr.size();
        int ans=Integer.MAX_VALUE;
        int low =0;
        int high=n-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            // leftSorted
            if(arr.get(low)<=arr.get(mid))
            {
                if(arr.get(low)<ans){
                    ans=arr.get(low);
                    index=low;
                }
                low=mid+1;
            }
            // right Sorted
            else{
                if(arr.get(mid)<ans){
                    ans=arr.get(mid);
                    index=mid;
                }
                high=mid-1;
            }
        }
        return index;
    }
    
}
