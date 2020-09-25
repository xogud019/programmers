package Codility;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if(A.length<1){
            return A;
        }
        
        while(K-- > 0){
            int temp = A[A.length-1];
            
            for(int i=A.length-1; i>=1; i--){
                A[i] = A[i-1];
            }
            
            A[0] = temp;
        }
        
        return A;
    }
}
