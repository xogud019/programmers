package CodingTest.LeetCode.Array.Easy;

public class SumOfEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] answer = new int[A.length];
        int num = 0;
        
        for(int i=0; i<answer.length; i++){
            if(A[i]%2 == 0) num+= A[i];     
        }
        
        for(int i=0; i<queries.length; i++){
            int value = queries[i][0];
            int idx = queries[i][1];
            
            if(A[idx]%2 == 0) num -=A[idx];
            
            A[idx] += value;
            
            if(A[idx]%2 == 0) num += A[idx];
            
            answer[i] = num;
        }
        
        return answer;
    }
    /*failed case -> time out
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] answer = new int[A.length];
        int idx = 0;
        
        for(int i=0; i<queries.length; i++){
            A[queries[i][1]] += queries[i][0];
            
            for(int j:A){
                if(j%2==0) answer[idx%A.length] += j;
            }
            
            idx++;
        }
        
        return answer;
    }
    */
}
