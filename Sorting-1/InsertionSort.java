package Sorting-1;

public class InsertionSort {
    public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=0;i<=arr.length-1;i++){
          int j=i;
          while(j>0 && arr[j-1]>arr[j]){
              int temp = arr[j];
              arr[j] = arr[j-1];
              arr[j-1] = temp;
              j--;
          }
      }
  }
    
}
