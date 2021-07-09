package CodingTest.LeetCode.Array.Easy;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int len = prices.length;
        
        for(int i=1; i<len; i++){
            if(prices[i] > prices[i-1]) answer += prices[i] - prices[i-1];
        }
        
        return answer;
    }
}
