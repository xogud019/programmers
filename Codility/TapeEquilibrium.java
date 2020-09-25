package Codility;

public class TapeEquilibrium {
    /*
    //correct = 100 , efficient 0;
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int answer = Integer.MAX_VALUE;
        
        for(int i=1; i<A.length; i++){
            int sumA = 0;
            int sumB = 0;
            
            for(int j=0; j<i; j++){
                sumA += A[j];
            }
            
            for(int j=i; j<A.length; j++){
                sumB += A[j];
            }
            
            answer= Math.min(answer,Math.abs(sumA-sumB));
        }
        return answer;
    }
    */
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        int answer = Integer.MAX_VALUE;
        int dif = 0;
        
        for(int i:A){
            sum +=i;
        }
        
        for(int i=A.length-1; i>=1; i--){
            dif += A[i];
            sum -= A[i];
            
            answer = Math.min(answer, Math.abs(sum-dif));
        }
        
        return answer;
    }
}
