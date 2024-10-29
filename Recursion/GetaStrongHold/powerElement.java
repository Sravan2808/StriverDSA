package Recursion.GetaStrongHold;

// time Complexity :O(logn)
// Space Complexity:O(logn)

import java.util.*;
import java.util.function.Function;
public class powerElement {
    // Function definition
    public static long powerFind(long a,long b) {
        long mid = 0 , result =0 ,finalresult=0;
        // BaseCase  Condition
        if(b==1){
            return  a;
        }
        else{
            mid=b/2;
            // recursive function call
            result = powerFind(a,mid);
            finalresult = result*result;
        }
        if(b%2==0) return  finalresult;
        else return  (a*finalresult);
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        long a = sc.nextInt();
        long b = sc.nextInt();

        // FunctionCalling
        long result = powerFind(a,b);
        System.out.println("Power of a^b is" + result);

    }
    
}
