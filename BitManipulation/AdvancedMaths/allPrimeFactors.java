package BitManipulation.AdvancedMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class allPrimeFactors{
      public int[] AllPrimeFactors(int N)
    {
        // code here TC:O(sqrt(N) * log(N))
        List<Integer> list = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i == 0){
                list.add(i);
                while(N%i==0)
                N=N/i;
            }
            
        }
        if(N!=1) list.add(N);
        Collections.sort(list);
        int arr[] = new int[list.size()];
        int c=0;
        for(int i=0;i<list.size();i++){
            arr[c++] = list.get(i);
        }
        return arr;
        
        
    }
}