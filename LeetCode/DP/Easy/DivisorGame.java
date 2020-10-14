package LeetCode.DP.Easy;

public class DivisorGame {
    public boolean divisorGame(int N) {
        int count = 0;
        
        while(N>1){
            for(int i=1; i<N; i++){
                if(N%i==0){
                    count++;
                    N -= i;
                    break;
                }
            }
        }
        
        return count % 2 == 0? false : true;
    }
}
