package Recursion.SubsequencesPattern;

import java.util.ArrayList;
import java.util.List;

public class permu {
        public void backtrack(List<List<Integer>> result , ArrayList<Integer> perm,int nums[]){
        if(perm.size() == nums.length){
            result.add(new ArrayList<>(perm));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(perm.contains(nums[i])) continue;
            perm.add(nums[i]);
            backtrack(result,perm,nums);
            perm.remove(perm.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums);
        return result;
        
    }
    
}
