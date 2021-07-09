package CodingTest.LeetCode.String.Medium;
/*
Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.

In one step, you can delete exactly one character in either string.

 

Example 1:

Input: word1 = "sea", word2 = "eat"
Output: 2
Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
Example 2:

Input: word1 = "leetcode", word2 = "etco"
Output: 4
 

Constraints:

1 <= word1.length, word2.length <= 500
word1 and word2 consist of only lowercase English letters.
*/
public class DeleteOperationForTwoStrings {
    /*failed case
    public int minDistance(String word1, String word2) {
        if(word1.equals(word2)) return 0;
        
        int count = 0;
        
        int i = 0, j = 0;
        
        while(i < word1.length()){
            
            while(i < word1.length() && j < word2.length() && word1.charAt(i) == word2.charAt(j)){
                i++;
                j++;
            }
            
            i++;
            count++;
        }
        
        return count;
    }
    */
    //using dp
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        int[][] dp = new int[len1+1][len2+1];
        
        for(int i=0; i<len1+1; i++){
            for(int j=0; j<len2+1; j++){
                if(i == 0 || j == 0) continue;
                
                if(word1.charAt(i-1) == word2.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);       
            }
        }
        /*
        for(int i=0; i<len2+1; i++){
            if(i==0) System.out.print("    ");
            else System.out.print(word2.charAt(i-1)+" ");
        }
        
        System.out.println();
        for(int i=0; i<len1+1; i++){
            if(i == 0) System.out.print("  ");
            if(i != 0) System.out.print(word1.charAt(i-1)+":");
            for(int j=0; j<len2+1; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0; i<len1; i++){
            for(int j=0; j<len2; j++){
                if(word1.charAt(i) == word2.charAt(j)) System.out.print(word1.charAt(i)+" ");
            }
            System.out.println("\n===========");
        }
        */
        //System.out.println(len1+" "+len2);
        return len1+len2 - 2*dp[len1][len2];
    }
}
