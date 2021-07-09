package CodingTest.Programmers.level2;


public class Stock {
    public static void main(String[] args){
       int[] prices = {1,2,3,2,3};
       int[] result = solution(prices);
       
       for(int i=0; i<result.length; i++){
           System.out.println(result[i]);
       }
    }  

    public static int[] solution(int[] prices){
        int[] answer= new int[prices.length];

        for(int i=0; i<prices.length-1; i++){
            int time = 0;
            for(int j=i+1; j<prices.length; j++){
                if(prices[i]<=prices[j]){
                    time++;
                }
                else{
                    time++;
                    answer[i]=time;
                    break;
                }
            }
            answer[i]=time;
        }
        return answer;
    }
}