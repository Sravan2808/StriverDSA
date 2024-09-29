public class singleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        // // BruteForce Approach TC:O(n)
        // int n=nums.length;
        // // Edge Case if length of nums is 1 then we should return nums[0]
        // if(n==1) return nums[0];
        // for(int i=0;i<n;i++){
        // // Starting element
        // if(i==0){
        //     if(nums[i]!=nums[i+1]) return nums[i];
        // }
        // // Ending Element
        // else if(i==n-1){
        //     if(nums[i]!=nums[i-1]) return nums[i];
        // }
        // // Middle Element
        // else{
        //     if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
        //     return nums[i];
        // }
        // }
        // return -1;
        
        // OptimalApproach TC:O(logn)
        int n = nums.length;
         // If length is 1 then nums[0]
       if(n==1) return nums[0];
       // Start Element
       if(nums[0]!=nums[1]) return nums[0];
           // LastElement
       if(nums[n-1]!=nums[n-2]) return nums[n-1];
       // middle Element from 1 to n-2
       int low =1, high = n-2;
       while(low<=high){
        int mid =(low+high)/2;
        if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
            return nums[mid];
        }
         // left half
        if((mid%2==1 && nums[mid]==nums[mid-1])
        || (mid%2==0 && nums[mid]==nums[mid+1])){
            low=mid+1;
        }
           // right half
        else{
            high=mid-1;
        }
       }
       return -1;
    }
    
}
