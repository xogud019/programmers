package CodingTest.LeetCode.BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    static List<List<Integer>> answer;
    
    public List<List<Integer>> combine(int n, int k) {
        answer = new ArrayList<>();
        
        combi(new ArrayList<>(), n, k, 0);
        
        return answer;
    }
    
    public void combi(List<Integer> list, int n, int k, int start){
        if(list.size()==k){
            answer.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=start+1; i<=n; i++){
            list.add(i);
            combi(list, n, k, i);
            list.remove(list.size()-1);
        }
        
    }
}
