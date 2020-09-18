package Programmers.level3;


class Change{
    public static void main(String[] args){
        int n = 5;
        int[] money = {1,2,5};

        System.out.println(solution(n, money));
    }

    public static int solution(int n, int[] money) {
        int mod = 1000000007;
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i=0; i<money.length; i++){
            for(int j=1; j<dp.length; j++){
                if(j>=money[i]){
                    dp[j] +=dp[j-money[i]]%mod;
                }
            }
        }
        return dp[dp.length-1];
    }
}