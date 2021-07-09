package CodingTest.LeetCode.Array.Easy;

public class FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int a = 0, b = 0;
        int[] answer = new int[2];
        
        for(int i:A)
            a += i;
        
        for(int i:B)
            b += i;
        
        i_loop : for(int i:A){
            for(int j:B){
                if(a-i+j == b-j+i){
                    answer[0] = i;
                    answer[1] = j;
                    break i_loop;
                }
            }
        }
        
        return answer;
    }
    /*failed case time out
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] answer = new int[2];
        
        i_loop: for(int i=0; i<A.length; i++){
           int aVal = A[i];
           j_loop: for(int j=0; j<B.length; j++){
                int bVal = B[j];
               
                A[i] = bVal;
                B[j] = aVal;
               
                if(sum(A) == sum(B)){
                   answer[0] = aVal;
                   answer[1] = bVal;
                   break i_loop;
                }
               
                A[i] = aVal;
                B[j] = bVal;
            }
        }
        
        return answer;
    }
    
    public int sum(int[] A){
        int n = 0;
        
        for(int i : A) 
            n += i;
        
        return n;
    }
    */
    
}
