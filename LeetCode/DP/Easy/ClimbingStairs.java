package LeetCode.DP.Easy;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    //top-down recursion
    static Map<Integer, Integer> map = new HashMap<>();
    
    public int climbStairs(int n) {
        int answer= dfs(n);
        
        return answer;
    }
    
    public int dfs(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        
        if(!map.containsKey(n)) map.put(n,dfs(n-1)+dfs(n-2));
        
        return map.get(n);
    }
}
