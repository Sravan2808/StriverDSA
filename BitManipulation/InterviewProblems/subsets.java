package BitManipulation.InterviewProblems;

import java.util.ArrayList;
import java.util.List;

class subsets{
     public List<List<Integer>> subsets(int[] nums) {
        // BitManipulation TC:O(n*2^n) SC:O(n*2^n)
        int n = nums.length;
        int subset = 1<<n;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<subset;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++){
            if((i&(1<<j))!=0) list.add(nums[j]);
        }
        ans.add(list);
        }
        
        return ans;
        
    }
}