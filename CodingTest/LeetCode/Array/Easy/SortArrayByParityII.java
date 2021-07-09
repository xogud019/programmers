package CodingTest.LeetCode.Array.Easy;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int[] answer = new int[A.length];
        
        int idx = 0;
        
        for(int i=0; i<A.length; i++){
            if(A[i]%2==0){
                answer[idx] = A[i];
                idx+=2;
            }
        }
        
        idx = 1;
        
        for(int i=0; i<A.length; i++){
            if(A[i]%2==1){
                answer[idx] = A[i];
                idx+=2;
            }
        }
        
        return answer;
    }
}
