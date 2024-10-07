// note : It is copy of the allocated books(same as the allocated books)

public class splitArray {
    int fn(int arr[],int mid){
        int noOfPages=0,std=1;
        for(int i=0;i<arr.length;i++)
        {
         if(noOfPages+arr[i]>mid){
             std++;
             noOfPages=arr[i];
         }
         else noOfPages+=arr[i];
        }
        return std;
         
     }
     public int splitArray(int[] nums, int k) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
         sum+=nums[i];
         max=Math.max(max,nums[i]);
        }
        int low=max,high=sum;
        while(low<=high){
         int mid=(low+high)/2;
         if(fn(nums,mid)>k) low=mid+1;
         else high=mid-1;
        }
        return low;
     }
 
    
}
