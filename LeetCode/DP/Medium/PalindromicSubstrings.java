package LeetCode.DP.Medium;
/*
Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:

Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
 

Example 2:

Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 

Note:

The input string length won't exceed 1000.
*/
public class PalindromicSubstrings {
    /*brute force
    public int countSubstrings(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<=s.length(); j++){
                //System.out.println(s.substring(i,j));
                answer += isPal(s.substring(i,j))? 1:0;        
            }
        }
        
        return answer;
    }
    
    public boolean isPal(String s){
        if(s.length() == 0) return false;
        int i=0, j = s.length()-1;
        
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            
            i++;
            j--;
        }
        
        return true;
    }
    */
}
