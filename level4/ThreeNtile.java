package level4;

public class ThreeNtile {
    static final int mod = 1000000007;
    static int[] dp = new int[5001];

    public static void main(String[] args){
        int n = 4;

        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer = 0;

        return answer;
    }

    public static int dfs(int n){
        if(n%2==1){
            return 0;
        }

        if(n==0){
            return 2;
        }
        
        if(dp[n]!=0){
            return dp[n];
        }
        else{
            dp[n] = dp[n-2]*3;
            dp[n] += dfs(n-2);
        }
    }
}