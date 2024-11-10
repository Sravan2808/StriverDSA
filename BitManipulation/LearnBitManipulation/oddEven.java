package BitManipulation.LearnBitManipulation;

public class oddEven {
    static String oddEven(int n) {
        // code here
        int num = n&1;
        if(num == 0) return "even";
        else return "odd";
    }
    
}
