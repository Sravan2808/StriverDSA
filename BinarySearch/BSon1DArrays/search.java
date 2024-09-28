public class search {
    public int search(int[] nums, int target) {
        // Bruteforce Approach TimeComplexity:O(n)
        // int ans =-1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] == target)
        //         ans=i;
        // }
        // return ans;
        // optimal Approach:O(logn)
        int n = nums.length;
        int low = 0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            // left Sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid])
                high=mid-1;
                else
                low=mid+1;
            }

            // right Sorted
            else{
            if(nums[mid]<=target && target<=nums[high])
            low=mid+1;
            else
            high=mid-1;
            }
        }
        return -1;
    }
    
}
