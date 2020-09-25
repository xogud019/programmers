package Codility;

public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        int answer = 0;
        boolean isO = false;
        int count = 0;
        
        while(N>0){
            if(N%2==1){
                isO = !isO;

                if(!isO){
                    answer = Math.max(count, answer);
                    count = 0;
                    isO = !isO;
                }
            }
            else{
                if(isO){
                    count++;
                }
            }
            
            N /=2;
        }
        
        return answer;
    }
}
