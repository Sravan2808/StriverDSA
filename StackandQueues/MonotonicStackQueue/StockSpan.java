import java.util.Stack;

class StockSpanner {
    Stack<Integer> prices,days;

    public StockSpanner() {
        prices = new Stack<>();
        days = new Stack<>();
    }
    
    public int next(int price) {
        int ans = 1;
        while(!prices.isEmpty() && prices.peek()<=price){
            prices.pop();
            ans+=days.pop();
        }
        prices.push(price);
        days.push(ans);
        return ans;
        
    }
}
