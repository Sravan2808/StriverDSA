package BitManipulation.AdvancedMaths;

import java.util.ArrayList;
import java.util.List;

public class findPrimeFactors {
        // You must implement this function
    static void sieve() {}

    static List<Integer> findPrimeFactors(int N) {
        // code here
        // TC:O(sqrt(N))
        List<Integer> ans = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){
                while(N%i==0){
                    ans.add(i);
                    N=N/i;
                }
            }
        }
        if(N>1)
        ans.add(N);
        return ans;
    }
    
}
