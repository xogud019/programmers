package LeetCode.Array.Easy;

public class FibonacciNumber {
    public int fib(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        int[] fi = new int[N+1];
        fi[0] = 0;
        fi[1] = 1;
        
        for(int i=2; i<=N; i++){
            fi[i] = fi[i-1]+fi[i-2];
        }
        
        return fi[N];
    }
}
