    // int upperBound(int[] nums,int target){
    // int n=nums.length;
    // int low=0,high=n-1;
    // int ans = n;
    // while(low<=high){
    // int mid = (low+high)/2;
    // if(nums[mid]>target){
    // ans=mid;
    // high=mid-1;
    // }
    // else{
    // low=mid+1;
    // }
    // }
    // return ans;
    // }
    // int lowerBound(int[] nums,int target){
    // int n=nums.length;
    // int low=0,high=n-1;
    // int ans = n;
    // while(low<=high){
    // int mid = (low+high)/2;
    // if(nums[mid]>=target){
    // ans=mid;
    // high=mid-1;
    // }
    // else{
    // low=mid+1;
    // }
    // }
    // return ans;
    // }
    public int[] searchRange(int[] nums, int target) {
        // BruteForce Approach Time Complexity:O(n)
        // int first=-1,last=-1;
        // for(int i=0;i<nums.length;i++){
        // if(nums[i] == target){
        // if(first == -1) first=i;
        // last = i;
        // }
        // }
        // return new int[]{first,last};

        // OptimalApproach
        // int lb = lowerBound(nums,target);
        // if(lb == nums.length || nums[lb] != target) return new int[]{-1,-1};
        // return new int[]{lb,upperBound(nums,target)-1};

        // BinarSearch Approach Tc:2*O(logn) and Sc:O(1)  
        int fs = first(nums, target);
        int ls = last(nums, target);
        return new int[] { fs, ls };
    }

    int first(int nums[], int target) {
        int fs = -1;
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                fs = mid;
                high = mid - 1;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return fs;
    }

    int last(int nums[], int target) {
        int ls = -1;
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ls = mid;
                low = mid + 1;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return ls;
    }
