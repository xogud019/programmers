package LeetCode.DP.Medium;
/*
Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.

An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:

s = s1 + s2 + ... + sn
t = t1 + t2 + ... + tm
|n - m| <= 1
The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
Note: a + b is the concatenation of strings a and b.

 

Example 1:


Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
Output: true
Example 2:

Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
Output: false
Example 3:

Input: s1 = "", s2 = "", s3 = ""
Output: true
 

Constraints:

0 <= s1.length, s2.length <= 100
0 <= s3.length <= 200
s1, s2, and s3 consist of lowercase English letters.
 

Follow up: Could you solve it using only O(s2.length) additional memory space?
*/
public class InterleavingString {
    /*brute force - time limited
    public boolean isInterleave(String s1, String s2, String s3) {        
        if(s1.length()+s2.length() != s3.length()) return false;
        
        return makeStr(s1, s2, s3, 0, 0, "");
    }
    
    public boolean makeStr(String s1, String s2, String s3, int i,  int j, String str){
        if(str.equals(s3) && i == s1.length() && j == s2.length()) return true;
        
        boolean answer = false;
        
        if(i < s1.length()) answer |= makeStr(s1, s2, s3, i+1, j, str+s1.charAt(i));
        
        if(j < s2.length()) answer |= makeStr(s1, s2, s3, i, j+1, str+s2.charAt(j));
        
        return answer;
    }
    */
    //2d array dp
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length(), len2 = s2.length();
        
        if(len1+len2 != s3.length()) return false;
        
        boolean[][] dp = new boolean[len1+1][len2+1];
        
        for(int i=0; i<len1+1; i++){
            for(int j=0; j<len2+1; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                    continue;
                }
                
                if(i == 0){
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1);
                    continue;
                }
                
                if(j == 0){
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1);
                    continue;
                }
                
                dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) || (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
            }
        }        
        
        
        return dp[len1][len2];
    }
}
