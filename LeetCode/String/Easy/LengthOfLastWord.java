package LeetCode.String.Easy;
/*
Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Example 2:

Input: s = " "
Output: 0
 

Constraints:
1.1 <= s.length <= 104
2.s consists of only English letters and spaces ' '.
*/
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split("\\s+");
        
        if(str.length==0) return 0;
        
        return str[str.length-1].length();
    }
}
