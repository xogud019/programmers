package LeetCode.Contest;

public class MaximumProfitofOperatingaCentennialWheel {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int cus = 0;
        int ride = 0;
        int idx = 0;
        int profit = 0;
        int run = 0;
        int answer = 0;
        
        while(cus>0||idx<customers.length){
            if(idx<customers.length) cus += customers[idx++];
            
            run++;
            if(cus>3){
                ride += 4;
                cus -= 4;
                
                if(profit<ride*boardingCost-run*runningCost){
                    answer = run;
                    profit = ride*boardingCost-run*runningCost;
                }
            }
            else{
                ride += cus;
                cus = 0;
                
                if(profit<ride*boardingCost-run*runningCost){
                    answer = run;
                    profit = ride*boardingCost-run*runningCost;
                }
            }
            
            
            //System.out.println(profit);
        }
        
       //System.out.println();
        
        return answer==0? -1: answer;
    }
}
