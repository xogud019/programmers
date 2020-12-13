package LeetCode.Array.Easy;

import java.util.Arrays;

public class NumberOfEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] map = new int[100];
        int answer = 0;
        
        for(int i=0; i<dominoes.length; i++){
            int[] pairs = dominoes[i];
            
            Arrays.sort(pairs);
            
            map[pairs[0]*10+pairs[1]]++;
        }
        
        for(int i:map){
            if(i>1) answer += i*(i-1)/2;
        }
        
        return answer;
    }
}
