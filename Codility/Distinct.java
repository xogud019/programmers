package Codility;

import java.util.*;

public class Distinct {
    /* failed case = correct 22, efficient 0;
    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean[] isT = new boolean[A.length];
        int answer = 0;
        
        for(int i:A){
            isT[i-1] = true;
        }
        
        for(int i=0; i<isT.length; i++){
            if(isT[i]) answer++; 
        }
        
        return answer;
    }
    */
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        
        for(int i:A) set.add(i);
        
        
        return set.size();
    }
}
