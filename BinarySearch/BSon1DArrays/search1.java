public class search1 {
    public boolean search(int[] nums, int target) {
        // Time Complexity : For Average Case :O(logn) && for the this arr[]=[3,3,1,3,3,3] O(n/2);
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return true;
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            // left Sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid])
                high = mid-1;
                else
                low = mid+1; 
            }
            // right sorted
            else{
                if(nums[mid]<=target && target<=nums[high])
                low=mid+1;
                else
                high=mid-1;
            }
        }
        return false;
        
    }
    
}
