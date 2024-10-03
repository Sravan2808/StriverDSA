class maxDistance{
boolean canWeReplace(int arr[],int dis,int cows){
    int cntcows=1,last=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]-last>=dis){
            cntcows++;
            last=arr[i];
        }
        if(cntcows>=cows) return true;
    }
     return false;
}
public int maxDistance(int[] position, int m) {
     int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<position.length;i++){
        max=Math.max(max,position[i]);
        min=Math.min(min,position[i]);
    }
    // Arrays.sort(position);
    // for(int i=0;i<=max-min;i++){
    //     if(canweReplace(position,i,m)==true) continue;
    //     else return i-1;       
    // }
    // return max-min;
    // OptimalApproach BS on Answer TC:O(NlogN)+O(log(max-min))*O(N)
    Arrays.sort(position);
    int low=0,high=max-min;
    while(low<=high){
       int  mid=(low+high)/2;
        if(canWeReplace(position,mid,m)==true) low=mid+1;
        else high=mid-1;
    }
    return high;
    
}
}