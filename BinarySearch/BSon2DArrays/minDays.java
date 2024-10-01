int findMin(int[] bloomDay){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
        }
        return min;
    }
    int findMax(int[] bloomDay){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
        }
        return max;
    }
    boolean possible(int[] bloomDay,int day,int m,int k){
        int cnt=0;
        int noofB=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day) cnt++;
            else{
                noofB+=cnt/k;
                cnt=0;
            }
        }
        noofB+=cnt/k;
        if(noofB>=m) return true;
        else return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
    //   brute Force approach TC:O(n)
    int n = bloomDay.length;
    long val =(long) m*k;
    if(n<val) return -1;
    // for(int i=findMin(bloomDay);i<=findMax(bloomDay);i++){
    //     if (possible(bloomDay,i,m,k))
    //     return i;
    // }
    // return -1;

    // OptimalApproach TimeComplexity:O(n*log(max-min+1)),SpaceComplexity:O(1)
    int low=findMin(bloomDay),high=findMax(bloomDay);
    while(low<=high){
        int mid=(low+high)/2;
        if(possible(bloomDay,mid,m,k)==true) high=mid-1;
        else low=mid+1;
    }
    return low;
    }