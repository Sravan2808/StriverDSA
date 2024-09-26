package Arrays.Easy;

public class LargestElement {
    private static final String Arrays = null;

    public static int largest(int n, int[] arr) {
        // code here
       Arrays.sort(arr);
       return arr[n-1];
    }


    
}
