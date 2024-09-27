public class firstAndLastPosition {
    int first(int arr[],int n,int x){
        int fs = -1;
        int low=0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){ 
                fs=mid;
                high=mid-1;
            }
            else if(arr[mid]<x) low=mid+1;
            else high = mid-1;
        }
        return fs;
    }
    int last(int arr[],int n,int x){
        int ls = -1;
        int low=0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){ 
                ls=mid;
                low=mid+1;
            }
            else if(arr[mid]<x) low = mid+1;
            else high=mid-1;
        }
        return ls;
    }
    public  int[] firstAndLastPosition(int arr[],int n ,int k){
        int first=first(arr,n,k);
        if(first==-1) return new int[]{-1,-1};
        int last=last(arr,n,k);
        return new int[]{first,last};
    }
    int count(int[] arr, int n, int x) {
        // code here
        int[] ans = firstAndLastPosition(arr,n,x);
        if(ans[0] == -1) return 0;
        return (ans[1]-ans[0]+1);
    }

    
}
