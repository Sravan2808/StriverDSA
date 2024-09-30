public class findPeakElement {
    public int findPeakElement(int[] nums) {
        // BruteForce Approach TC:O(n),SC:O(1)
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     if((i==0 || nums[i-1]<nums[i]) && (i==n-1 || nums[i]>nums[i+1]))
        //     return i;
        // }
        // return -1;
    

        // OPtimal Approach TC:(logn),Sc:O(1)

        int n = nums.length;
        // if Length is 1
        if(n==1) return 0;

        // if Starting Element
        if(nums[0]>nums[1]) return 0;
        // Ending Element
        if(nums[n-1]>nums[n-2]) return n-1;
        int low=1,high=n-2;
        // For middle Element
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]>nums[mid+1]) high=mid-1;
            else
            low=mid+1;
        }
        return -1;
    }
    
}
