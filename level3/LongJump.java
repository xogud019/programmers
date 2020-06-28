package level3;

public class LongJump {
    public static void main(String[] args){
        int n = 4;

        System.out.println(solution(n));
    }

    public static long solution(int n){
        long dp1 = 1;
        long dp2 = 2;
        
        for(int i=0; i<n-2; i++){
            long dp3 = (dp1+dp2)%1234567;
            dp1 = dp2;
            dp2 = dp3;
        }
        return (n==1)?dp1:dp2;
    }
}