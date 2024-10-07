public class smallestDivisor {
    int findMax(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }

    boolean possible(int nums[],int mid,int threshold){
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=Math.ceil((double)(nums[i])/(double)(mid));
            }
             if(sum<=threshold) return true;
             else return false;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        // BruteForce Approach TC:O(max*n) SC:O(1)
        // for(int d=1;d<=findMax(nums);d++){
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        // sum+=Math.ceil((double)(nums[i])/(double)(d));
        // }
        // if(sum<=threshold) return d;
        // }
        // return -1;
        // optimal Solution
        int low = 0, high = findMax(nums);
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(nums, mid, threshold) == true)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
    
}
