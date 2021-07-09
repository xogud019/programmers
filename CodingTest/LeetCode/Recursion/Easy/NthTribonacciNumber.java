package CodingTest.LeetCode.Recursion.Easy;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 ||n==1) return 1;
        
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        
        dfs(dp, n, 3);
        /*
        int index = 0;
        for(int i:dp){
            System.out.println(index++ +" "+i);
        }
        */
        return dp[n];
    }
    
    public void dfs(int[] dp, int n, int len){
        if(len>n) return;
        else{
            dp[len] = dp[len-3]+dp[len-2]+dp[len-1];
        }
        
        dfs(dp, n, len+1);
    }
}
