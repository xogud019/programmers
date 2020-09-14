package LeetCode.Easy;

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
}
