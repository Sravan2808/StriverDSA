class floorSqrt {
    long floorSqrt(long n) {
        // Your code here
    //     // // TC:O(n),SC:O(1)
    // int ans = -1;
    // for(int i=1;i<=n;i++){
    //     if(i*i<=n) ans=i;
    //     else break;
    // }
    // return ans;
    
    // TC:O(logn),SC:O(1)
    long ans =-1;
    long low = 1;
    long high=n;
    while(low<=high){
        long mid=(low+high)/2;
        if(mid*mid<=n){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return ans;
    
    }
}