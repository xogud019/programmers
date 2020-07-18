package level4;

public class ThreeNtile {
    static final int mod = 1000000007;
    static long[] dp = new long[5001];

    public static void main(String[] args){
        int n = 10;

        System.out.println(solution(n));
    }

    public static int solution(int n){
        long pre = 0;
        dp[0] = 1;
        dp[2] = 3;

        if(n%2==1){
            return 0;
        }

        if(dp[n]!=0){
            return (int)(dp[n]%mod);
        }

        for(int i=4; i<=n; i+=2){
            pre += dp[i-4]*2;
            dp[i] =  dp[i-2]*3+pre;
        }

        for(long i:dp){
            if(i!=0){
                System.out.println(i);
            }
        }
        return (int)dp[n];
    }
}