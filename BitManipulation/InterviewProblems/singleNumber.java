package BitManipulation.InterviewProblems;

public class singleNumber {
    public int singleNumber(int[] nums) {
        // BruteForce Hashmap TC:O(n) SC:O(n)
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
        //     if (mp.getValue() == 1)
        //         return mp.getKey();
        // }
        // return -1;

        // Optimized Approach Bit Manipulation TC:O(n) SC:O(1)
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor^nums[i];
        }
        return xor;
    }
    
}
