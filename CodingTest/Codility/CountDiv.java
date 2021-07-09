package CodingTest.Codility;

public class CountDiv {
    /*failed case = correct 100 efficient 0;
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int answer = 0;
        
        for(int i=A; i<=B; i++){
            if(i%K==0) answer++;    
        }
        
        return answer;
    }
    */
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        
        if(A%K==0) return B/K-A/K+1;
        
        return B/K-A/K;
    }
}
