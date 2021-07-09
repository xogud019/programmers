package CodingTest.LeetCode.DP.Medium;

public class ArithmeticSlices {
    //using dp
    public int numberOfArithmeticSlices(int[] A) {
        int answer = 0, dp = 0;
        
        for(int i=2; i<A.length; i++){
            if(A[i]-A[i-1] == A[i-1] - A[i-2]){
                dp++;
                answer += dp;
            }
            else dp = 0;
        }
        
        return answer;
    }

    /*brute force
    public int numberOfArithmeticSlices(int[] A) {
        int answer = 0, len = A.length;
        
        for(int i=0; i<len-2; i++){
            int d = A[i+1]- A[i];
            
            for(int j=i+2; j<len; j++){
                boolean T = false;
                for(int k= i+1; k<j+1; k++){
                    
                    if(A[k] - A[k-1] != d){
                        T = false;
                        break;
                    }
                    else T = true;
                }
                
                if(T) answer++;
            }
        }
        
        return answer;
    }
    */
    /*better brute force
    public int numberOfArithmeticSlices(int[] A) {
        int answer = 0, len = A.length;
        
        for(int i=0; i<len-2; i++){
            int d = A[i+1]- A[i];
            
            for(int j=i+2; j<len; j++){
                if(A[j]-A[j-1] == d) answer++;
                else break;
            }
        }
        
        return answer;
    }
    */
}
