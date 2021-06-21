package LeetCode.Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        /*
        answer.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows==1) return answer;
        answer.add(new ArrayList<>(Arrays.asList(1,1)));
        if(numRows==2) return answer;
        */
        if(numRows == 0 ) return answer;
        
        for(int i=0; i<numRows; i++){
            answer.add(new ArrayList<>());
            
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) answer.get(i).add(1);
                else answer.get(i).add(answer.get(i-1).get(j-1)+answer.get(i-1).get(j));
            }
        }
        return answer;
    }
    /*
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int i=0; i<numRows; i++){
            answer.add(new ArrayList<>());
            for(int j=0; j<i+1; j++){
                if(j == 0 || i == j) answer.get(i).add(1);
                else answer.get(i).add(answer.get(i-1).get(j-1)+answer.get(i-1).get(j));
            }
        }
        
        return answer;
    }
    */
}
