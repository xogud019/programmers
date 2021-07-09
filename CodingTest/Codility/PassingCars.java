package CodingTest.Codility;

public class PassingCars {
    /* failed case = correct 100, efficient 0
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        
        for(int i=0; i<A.length; i++){
            if(A[i]==1) continue;
            
            for(int j=i+1; j<A.length; j++){
                if(A[j]==0) continue;
                answer++;
            }
        }
        
        return answer;
    }
    */

    /* failed case = correct 100, efficient 40
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        int sum = 0;
        
        for(int i:A){
            if(i==0) sum++;
            else answer += sum;
        }
        
        return answer;
    }
    */
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        int sum = 0;
        
        for(int i:A){
            if(i==0) sum++;
            else answer += sum;
        }
        
        return answer>1000000000||answer<0? -1 : answer;
    }
}
