package BitManipulation.AdvancedMaths;

public class countPrimes {
    public int countPrimes(int n) {
        // TC:O(N)+O(NloglogN)+O(N) SC:O(N)
        if(n<=2) return 0;
        boolean isPrime[] = new boolean[n+1];
        for(int i=2;i<n;i++) isPrime[i] = true;
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int cnt = 0;
        for(int i=2;i<n;i++){
            if(isPrime[i]) cnt++;
        }
        return cnt;
    }
    
}
