package LeetCode.Array.Easy;

import java.util.*;

public class LuckyNumbersInAMatrix{
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i=0; i<row; i++){
            int min = Integer.MAX_VALUE;
            
            for(int j=0; j<col; j++){
                min = Math.min(min,matrix[i][j]);    
            }
            
            set.add(min);
        }
        
        for(int i=0; i<col; i++){
            int max = 0;
            
            for(int j=0; j<row; j++){
                max = Math.max(max,matrix[j][i]);
            }
            
            if(set.contains(max)){
                answer.add(max);
            }
            else set.add(max);
        }
        
        
        return answer;
    }
}