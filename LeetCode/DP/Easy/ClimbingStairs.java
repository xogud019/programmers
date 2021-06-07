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
    /*bottom up dp
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int[] dp = new int[n+1];
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3; i<n+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
    */
}
