package BitManipulation.InterviewProblems;

public class singleNumber2 {
    public int singleNumber(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> mp : map.entrySet()){
        //     if(mp.getValue() == 1) return mp.getKey();
        // }
        // return -1;

        // Bitwise Approach TC:O(N*31) SC:O(1)

        // int ans = 0;
        // for(int i=0;i<31;i++){
        //     int cnt = 0;
        //     for(int j=0;j<nums.length;j++){
        //         if((nums[j] & (1<<i))!=0) cnt++;
        //     }
        //     if(cnt%3==1) ans=ans|(1<<i);
        // }
        // return ans;

        // 3 Approach TC:(N*logN + N/3); SC:O(1)

        // Arrays.sort(nums);
        // for(int i = 1;i<nums.length;i=i+3){
        //     if(nums[i] != nums[i-1]) return nums[i-1];
        // }
        // return nums[nums.length-1];

        
        // 4.Buckets Approach TC:O(N) SC:O(1)
        int ones = 0,twos=0;
        for(int i=0;i<nums.length;i++){
            ones = (ones^nums[i])&(~twos);
            twos = (twos^nums[i])&(~ones);
        }
        return ones;
        
    }
    
}
