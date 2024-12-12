package StackandQueues.MonotonicStackQueue;

import java.util.Deque;

public class maximumSlidingWindow  {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int r[] = new int[n-k+1];

        int ri = 0;

        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            // remove indexes out of range
            if(!q.isEmpty() && q.peek()<=i-k){
                q.poll();
            }
            // remove smaller value indexes in the range as they are useless
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.offer(i);

            // keep storing maximum starting from i=k-1;
            if(i>=k-1)
            {
                r[ri++] = nums[q.peek()];
            }
        }
        return r;

        
    }
}
