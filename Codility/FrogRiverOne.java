package Codility;

import java.util.*;

public class FrogRiverOne{
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        if(A.length<0) return -1;
        int answer = 0;
        set.add(A[0]);
        int idx = 1;
        
        while(set.size()<X){
            if(idx==A.length) return -1;
            
            set.add(A[idx++]);
            answer++;
        }
        
        return answer;
    }
}