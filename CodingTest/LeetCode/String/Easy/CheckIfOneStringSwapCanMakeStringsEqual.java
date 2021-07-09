package CodingTest.LeetCode.String.Easy;

import java.util.Arrays;

/*
You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.

 

Example 1:

Input: s1 = "bank", s2 = "kanb"
Output: true
Explanation: For example, swap the first character with the last character of s2 to make "bank".
Example 2:

Input: s1 = "attack", s2 = "defend"
Output: false
Explanation: It is impossible to make them equal with one string swap.
Example 3:

Input: s1 = "kelb", s2 = "kelb"
Output: true
Explanation: The two strings are already equal, so no string swap operation is required.
Example 4:

Input: s1 = "abcd", s2 = "dcba"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 100
s1.length == s2.length
s1 and s2 consist of only lowercase English letters.
*/
public class CheckIfOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) count++;
        }
        
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        s1 = new String(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        s2 = new String(c2);
                
        return count<=2 && s1.equals(s2);
    }
}
