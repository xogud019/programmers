package Codility;

import java.util.*;

public class Triangle {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        if(n<3) return 0;
        
        Arrays.sort(A);
        
        for(int i=0; i<A.length-2; i++) if((long)A[i]+(long)A[i+1]>(long)A[i+2]) return 1;
        
        
        return 0;
    }
    /*failed case = correct 0, efficient 0;
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        
        for(int i=0; i<A.length-2; i++){
            if(A[i]>=0&&A[i+2]<A.length) return 1;
        }
        
        return 0;
    }
    */
    /*failed case = correct 90, efficient 100;
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        if(n<3) return 0;
        
        Arrays.sort(A);
        
        for(int i=0; i<A.length-2; i++) if(A[i]+A[i+1]>A[i+2]) return 1;
        
        
        return 0;
    }
    */
}
