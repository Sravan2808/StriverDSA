package BitManipulation.LearnBitManipulation;

class divide{
    public int divide(int dividend, int divisor) {
        // TC:O(logN)^2 SC:O(1);
       if(dividend == divisor) return 1;
        boolean sign = true; 
        if(dividend<0 && divisor>0) sign = false;
        if(dividend>0 && divisor<0) sign = false;
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long ans = 0;
        while(n>=d){
            int count = 0;
            while(n>=(d<<(count+1))) count = count + 1;
            ans = ans + (1<<count);
            n = n - (d<<count);
        }
        if(ans==(1<<31) && sign == true) return Integer.MAX_VALUE;
        if(ans==(1<<31) && sign == false) return Integer.MIN_VALUE;
        return sign?(int)ans:(int)-ans;

        
    }
}