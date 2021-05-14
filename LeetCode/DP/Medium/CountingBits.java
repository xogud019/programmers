package LeetCode.DP.Medium;
/*
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example 1:

Input: 2
Output: [0,1,1]

Example 2:

Input: 5
Output: [0,1,1,2,1,2]

Follow up:
1.It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
2.Space complexity should be O(n).
3.Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
*/
public class CountingBits {
    /*brute force 
    public int[] countBits(int num) {
        if(num == 0) return new int[]{0};
        if(num == 1) return new int[]{0,1};
        
        int[] answer = new int[num+1];
        answer[0] = 0;
        answer[1] = 1;
        
        for(int i=2; i<=num; i++){
            int val = i;
            int count = 0;
            
            while(val>0){
                if(val%2 != 0) count++;
                
                val /= 2;
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
    */
    //DP+Math
    public int[] countBits(int num) {
        int[] dp = new int[num+1];
        
        for(int i=1; i<=num; i++){
            int k = (int)(Math.log(i)/Math.log(2));
            dp[i] = 1 + dp[i - (int)Math.pow(2, k)];
        }
        
        return dp;
    }
    //DP+even,odd
    /*
    public int[] countBits(int num) {
        if (num == 0)
            return new int []{0};
        if (num == 1)
            return new int [] {0, 1};
        int [] result = new int [num+1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        for (int i=3; i<=num; i++) {
            if (i % 2 == 0) {
                 result[i] = result[i/2];
            }
            else
                result[i] = 1 + result[i/2];
        }
        return result;
    }
    15ms
    public int[] countBits(int num) {
        int[] dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i=2; i< num+1; i++){
            if(i%2 == 0){
                dp[i] = dp[i/2];
            }
            else dp[i] = dp[i-1]+1;
        }
        
        return dp;
    }
    */

    /*bit manifulation 1ms
    public int[] countBits(int num) {
        int[] dp = new int[num+1];
        dp[0] = 0;
        
        for(int i=1; i<num+1; i++) dp[i] = dp[i&(i-1)]+1;
        
        return dp;
    }
    */
}
