public class insertionSort {
    void selectionSort(int arr[], int n)
	{
	    //code here
	     for(int i=0;i<=arr.length-2;i++){
            int mini=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[mini]) mini=j;
            }
            int temp =arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        }
	}
    
}
