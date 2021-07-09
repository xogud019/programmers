package CodingTest.LeetCode.DP.Easy;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104

*/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        //n^2
        int answer = 0;
        
        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++){
                answer = Math.max(answer, prices[j]-prices[i]);
            }
        }
        
        return answer;
        //
        /*n
        int minPrice = Integer.MAX_VALUE;
        int answer = 0;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }   
            else if(prices[i]-minPrice>answer){
                answer = prices[i]-minPrice;        
            }
        }
        
        return answer;
        */
    }
    /*dp
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minStock = 10001;
        
        for(int curStock : prices){
            minStock = Math.min(minStock, curStock);
            maxProfit = Math.max(maxProfit, curStock - minStock);
        }
        
        return maxProfit;
    }
    */
}
