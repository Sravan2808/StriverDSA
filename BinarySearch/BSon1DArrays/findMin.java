public class findMin {
    class Solution {
        public int findMin(int[] nums) {
            // BruteForce Approach TimeComplexity:O(n)
            // int min = Integer.MAX_VALUE;
            // for(int i=0;i<nums.length;i++){
                
            //     min=Math.min(min,nums[i]);
    
            // }
            // return min;
    
            // Optimial Approach TimeComplexity:O(logn)
            int low =0,high=nums.length-1;
            int ans=Integer.MAX_VALUE;
            while(low<=high){
                int mid =(low+high)/2;
                if(nums[low]<=nums[mid]){
                    ans=Math.min(ans,nums[low]);
                    low=mid+1;
                }
                else{
                    ans=Math.min(ans,nums[mid]);
                    high=mid-1;
                }
            }
            return ans;
        }
    }
    
}
