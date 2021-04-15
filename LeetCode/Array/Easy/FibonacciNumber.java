package LeetCode.Array.Easy;
/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

 

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 

Constraints:

0 <= n <= 30
*/
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
    /*dp
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        
        for(int i=2; i<n+1; i++) fibo[i] = fibo[i-1]+fibo[i-2];
        
        return fibo[n];
    }
    */

    /*dp && recursion
    int[] arr = new int[31];
    
    public int fib(int n) {
        if(n < 2) return n;
        
        arr[0] = 0;
        arr[1] = 1;
        
        return fibo(n);
    }
    
    public int fibo(int n){
        if(n == 0) return 0;
        if(arr[n] != 0) return arr[n];
        
        arr[n] =fibo(n-1) + fibo(n-2);
        
        return fibo(n);
    }
    */
}
