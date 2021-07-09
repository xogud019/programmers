package Note;

public class tet {
    public static void main(String[] args){
        int[] customers = {0,43,37,9,23,35,18,7,45,3,8,24,1,6,37,2,38,15,1,14,39,27,4,25,27,33,43,8,44,30,38,40,20,5,17,27,43,11,6,2,30,49,30,25,32,3,18,23,45,43,30,14,41,17,42,42,44,38,18,26,32,48,37,5,37,21,2,9,48,48,40,45,25,30,49,41,4,48,40,29,23,17,7,5,44,23,43,9,35,26,44,3,26,16,31,11,9,4,28,49,43,39,9,39,37,7,6,7,16,1,30,2,4,43,23,16,39,5,30,23,39,29,31,26,35,15,5,11,45,44,45,43,4,24,40,7,36,10,10,18,6,20,13,11,20,3,32,49,34,41,13,11,3,13,0,13,44,48,43,23,12,23,2};
        int boardingCost = 43;
        int runningCost = 54;

        System.out.println(minOperationsMaxProfit(customers,boardingCost,runningCost));
    }

    public static int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
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
                else{
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
                else{
                    profit = ride*boardingCost-run*runningCost;
                }
            }
            
            
            System.out.println(ride+" "+run+" "+profit);
        }
        
       //System.out.println();
        
        return answer==0? -1: answer;
    }
}
