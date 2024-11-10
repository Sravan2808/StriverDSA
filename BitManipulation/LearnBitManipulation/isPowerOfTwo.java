package BitManipulation.LearnBitManipulation;

public class isPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==0 || n==Integer.MIN_VALUE) return false;
        return (n&(n-1)) == 0;    
        }
    
}
