package LeetCode.DP.Hard;
/*
Given an integer n, your task is to count how many strings of length n can be formed under the following rules:

Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
Each vowel 'a' may only be followed by an 'e'.
Each vowel 'e' may only be followed by an 'a' or an 'i'.
Each vowel 'i' may not be followed by another 'i'.
Each vowel 'o' may only be followed by an 'i' or a 'u'.
Each vowel 'u' may only be followed by an 'a'.
Since the answer may be too large, return it modulo 10^9 + 7.

Example 1:

Input: n = 1
Output: 5
Explanation: All possible strings are: "a", "e", "i" , "o" and "u".
Example 2:

Input: n = 2
Output: 10
Explanation: All possible strings are: "ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".
Example 3: 

Input: n = 5
Output: 68
 

Constraints:

1 <= n <= 2 * 10^4
*/
public class CountVowelsPermutation {
    final static int mod = 1000000007;
    //using dp 11ms
    public int countVowelPermutation(int n) {                
        long a = 1, e = 1, i = 1, o = 1, u = 1;
        
        for(int j=1; j<n; j++){
            long tempA = (e + i + u)%mod;
            long tempE = (a + i)%mod;
            long tempI = (e + o)%mod;
            long tempO = i%mod;
            long tempU = (i + o)%mod;
            
            a = tempA;
            e = tempE; 
            i = tempI;
            o = tempO;
            u = tempU;
        }
        
        return (int)((a+e+i+o+u)%mod);
    }

    /*using array 19ms
    public int countVowelPermutation(int n) {        
        long[][] dp = new long[n+1][5];
        
        for(int i=0; i<5; i++) dp[1][i] = 1;
        
        for(int i=2; i<n+1; i++){
            dp[i][0] = (dp[i-1][1] + dp[i-1][2] + dp[i-1][4])%mod;  //a
            dp[i][1] = (dp[i-1][0] + dp[i-1][2])%mod;  //e
            dp[i][2] = (dp[i-1][1] + dp[i-1][3])%mod;  //i
            dp[i][3] = (dp[i-1][2])%mod;  //o
            dp[i][4] = (dp[i-1][2] + dp[i-1][3])%mod;  //u
        }
        
        return (int)((dp[n][0] + dp[n][1] + dp[n][2] + dp[n][3] + dp[n][4])%mod);
    }
    */
}
