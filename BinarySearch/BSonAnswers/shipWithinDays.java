class shipWithinDays{
int findDays(int wt[],int max){
    int day=1,load=0;
    for(int i=0;i<wt.length;i++){
        if(load+wt[i]>max){
            day=day+1;
            load=wt[i];
        }
        else{
            load+=wt[i];
        }
    }
    return day;
}
public int shipWithinDays(int[] weights, int days) {
    
    int max=Integer.MIN_VALUE;
    int sum=0;
    for(int i=0;i<weights.length;i++){
        sum+=weights[i];
        max=Math.max(max,weights[i]);
    }
    // bruteforce approach TC:O((sum-max)+1) SC:O(1)
    // for(int i=max;i<=sum;i++){
    //     if(findDays(weights,i)<=days) return i;;
    // }
    // return -1;

    // OptimalApproach TC:O(log2(sum-max+1))*O(n)
    int low =max, high=sum;
    while(low<=high){
        int mid=(low+high)/2;
        if(findDays(weights,mid)<=days) high=mid-1;
        else low=mid+1;
    }
    return low;
    
}
}