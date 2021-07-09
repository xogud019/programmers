package CodingTest.LeetCode.Greedy.Medium;

import java.util.Arrays;
/*
Given two strings: s1 and s2 with the same size, check if some permutation of string s1 can break some permutation of string s2 or vice-versa. In other words s2 can break s1 or vice-versa.

A string x can break string y (both of size n) if x[i] >= y[i] (in alphabetical order) for all i between 0 and n-1.

 

Example 1:

Input: s1 = "abc", s2 = "xya"
Output: true
Explanation: "ayx" is a permutation of s2="xya" which can break to string "abc" which is a permutation of s1="abc".
Example 2:

Input: s1 = "abe", s2 = "acd"
Output: false 
Explanation: All permutations for s1="abe" are: "abe", "aeb", "bae", "bea", "eab" and "eba" and all permutation for s2="acd" are: "acd", "adc", "cad", "cda", "dac" and "dca". However, there is not any permutation from s1 which can break some permutation from s2 and vice-versa.
Example 3:

Input: s1 = "leetcodee", s2 = "interview"
Output: true
 

Constraints:
1.s1.length == n
2.s2.length == n
3.1 <= n <= 10^5
4.All strings consist of lowercase English letters.
*/
public class CheckIfAStringCanBreakAnotherString {
    //brute force
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int cnt1 = 0, cnt2 = 0;
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        for(int i=0; i<c1.length; i++){
            if(c1[i]>c2[i]) cnt1++;
            else if(c2[i]>c1[i]) cnt2++;
            else{
                cnt1++;
                cnt2++;
            }
        }
        
        return cnt1==s1.length() || cnt2 == s1.length() ? true : false;
    }
    /*greedy
        public boolean checkIfCanBreak(String s1, String s2) {
        int[] s1Count = charCount(s1);
        int[] s2Count = charCount(s2);
        return canBreak(s1Count, s2Count) || canBreak(s2Count, s1Count);
    }
    
    public int[] charCount(String s) {
        int[] count = new int['z' - 'a' + 1];
        for(char ch: s.toCharArray()) {
            count[ch - 'a']++;
        }
        return count;
    }
    
    public boolean canBreak(int[] source, int[] dest) {
        int spareChars = 0;
        for(int i = 'z' - 'a'; i >= 0 ; i--) {
		    // if there are any remaining characters, we can use that to match other characters which is less than the current character
            if(source[i] >= dest[i]) {
               spareChars += source[i] - dest[i];
            } else {
               spareChars -= dest[i] - source[i]; 
               if(spareChars < 0) {
                   return false;
               }
            }
        }
        return spareChars == 0;
    }
    */
}
