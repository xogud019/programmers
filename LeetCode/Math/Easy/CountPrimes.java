package LeetCode.Math.Easy;
/*
Count the number of prime numbers less than a non-negative number, n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
 

Constraints:
1.0 <= n <= 5 * 106
*/
public class CountPrimes {
    public int countPrimes(int n) {
        if(n==1 || n==0) return 0;
        
        int answer = 0;
        boolean[] prime = new boolean[n+1];
        prime[0] = false;
        prime[1] = false;
        
        for(int i=2; i<n; i++) prime[i] = true;
        
        for(int i=2; i*i<n; i++){
            if(prime[i]){
                for(int j=i*i; j<n; j+=i) prime[j] = false;
            }
        }
        
        for(int i=2; i<n; i++){
            if(prime[i]) answer++;
        }
        
        return answer;
    }
}
