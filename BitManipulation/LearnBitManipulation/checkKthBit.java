package BitManipulation.LearnBitManipulation;

public class checkKthBit {
    static boolean checkKthBit(int n, int k) {
        // Your code here
        // By using left shift
        // if((n&(1<<k))!=0) return true;
        // else return false;
        if(((n>>k)&1) != 0) return true;
        else return false;
    }
    
}
