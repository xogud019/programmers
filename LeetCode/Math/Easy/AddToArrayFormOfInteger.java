package LeetCode.Math.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> answer = new ArrayList<>();
        int len = A.length-1;
        int n = K;
        
        while(len>=0 || n>0){
            if(len >= 0) n += A[len];
            len--;
            answer.add(n%10);
            n/=10;
        }
        
        Collections.reverse(answer);
        
        return answer;
    }
}
