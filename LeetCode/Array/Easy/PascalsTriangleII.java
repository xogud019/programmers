package LeetCode.Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[][] pascal = new int[rowIndex+1][rowIndex+1];
        
        for(int i=0; i<=rowIndex; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) pascal[i][j] = 1;
                else pascal[i][j] = pascal[i-1][j-1]+pascal[i-1][j];
                    //answer.get(i).add(answer.get(i-1).get(j-1)+answer.get(i-1).get(j));
            }    
        }
        
        for(int i=0; i<=rowIndex; i++){
            answer.add(pascal[rowIndex][i]);    
        }
        
        return answer;
    }
}
