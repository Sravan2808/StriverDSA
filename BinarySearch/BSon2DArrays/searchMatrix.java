package BinarySearch.BSon2DArrays;

public class searchMatrix {
    // public boolean binarySearch(int nums[],int target){
    //     int low = 0, high=nums.length-1;
    //     while(low<=high){
    //         int mid=(low+high)/2;
    //         if(nums[mid]==target) return true;
    //         else if(target>nums[mid]) low=mid+1;
    //         else high = mid-1;
    //     }
    //     return false;
    // }
    public boolean searchMatrix(int[][] matrix, int target) {
        // Brute Force Approach
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==target){
        //         return true;
        //         }
        //     }
        // }
        // return false;

        // //Better Approach
        // int n=matrix[0].length;
        // for(int i =0;i<matrix.length;i++){
        //     if(matrix[i][0] <= target && target<=matrix[i][n-1]){
        //         return binarySearch(matrix[i],target);
        //     }
        // }
        // return false;

        // Optimize Approach TC:O(log(m*n)) SC:O(1)
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0,high = n*m-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/m , col=mid%m;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    
}
