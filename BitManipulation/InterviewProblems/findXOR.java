public class findXOR {
    static int f(int n){
        if(n%4==1) return 1;
        else if(n%4==2) return n+1;
        else if(n%4==3) return 0;
        else return n;
    }
    public static int findXOR(int l, int r) {
        // BruteForce Approach TC:O(R-L+1) SC:O(1)
        // int ans = 0;
        // for(int i = l;i<=r;i++){
        //     ans = ans^i;
        // }
        // return ans;
        
        // Optimization Approach TC:O(1) SC:O(1)
        return f(l-1)^f(r);
    }
    
}
