public class getFloorAndCeil {
    static int floor(int arr[],int n ,int x){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
          int mid= (low+high)/2;
          if(arr[mid]<=x){
            ans=arr[mid];
            low=mid+1;
          }
          else{
            high=mid-1;
          }
        }
        return ans;
      }
      static int ceil(int arr[],int n,int x){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
          int mid= (low+high)/2;
          if(arr[mid]>=x){
            ans=arr[mid];
            high=mid-1;
          }
          else{
            low=mid+1;
          }
        }
        return ans;
      }
  
      public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Write your code here.
        int f = floor(a,n,x);
        int c = ceil(a,n,x);
        return new int[]{f,c};
      }
    
}
