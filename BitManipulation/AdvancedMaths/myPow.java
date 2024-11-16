package BitManipulation.AdvancedMaths;

public class myPow {
    public double myPow(double x, int n) {
        // TC:O(N)
        // int absN = Math.abs(n);
        // double ans = 1;
        // for(int i=1;i<=absN;i++) ans=ans*x;
        // if(n<0) return 1.0/ans;
        // else return ans;

        // TC:O(LogN)
       
    double ans = 1.0;
    long absN = Math.abs((long)n); // Handle negative exponent

    while (absN > 0) {
        if (absN % 2 == 1) {
            ans = ans* x; // Multiply ans by x if the current bit is set
            absN--;   // Reduce absN by 1 (odd case)
        } else {
            x *= x;   // Square x
            absN /= 2; // Divide absN by 2 (even case)
        }
    }

    if (n < 0) {
        return 1.0 / ans; // Return reciprocal for negative exponents
    }
    return ans; // Return the calculated power
}

    
}
