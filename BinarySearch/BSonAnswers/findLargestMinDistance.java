import java.util.ArrayList;

public class findLargestMInDistance 
{
     public static int function(ArrayList<Integer> arr,int pages){
        int std=1,pagesStudent=0;
        for(int i=0;i<arr.size();i++){
            if(pagesStudent+arr.get(i)>pages){
                std++;
                pagesStudent=arr.get(i);
            }
            else pagesStudent+=arr.get(i);
        }
        return std;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        // BruteForce Approach TimeComplexity:O(max-sum+1)*O(n)
        if(m>n) return -1;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr.get(i));
            sum+=arr.get(i);
        }
        // int low=max,high=sum;
        
        // for(int pages=low;pages<=high;pages++){
        //     int cntStud=function(arr,pages);
        //     if(cntStud==m) return pages;
        // }
        // return low;

        // optimized Approach TC:O(logn(max-sum+1)*O(n))
         int low=max,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int noofStd = function(arr,mid);
            if(noofStd>m) low=mid+1;
            else high=mid-1;
        }
        return low;
        
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int ans=findPages(boards,boards.size(), k);
        return ans;

    }
}