package CodingTest.LeetCode.String.Easy;
/*
You are given a string s, return the number of segments in the string. 
A segment is defined to be a contiguous sequence of non-space characters.

Example 1:

Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
Example 2:

Input: s = "Hello"
Output: 1
Example 3:

Input: s = "love live! mu'sic forever"
Output: 4
Example 4:

Input: s = ""
Output: 0
 

Constraints:
1.0 <= s.length <= 300
2.s consists of lower-case and upper-case English letters, digits or one of the following characters "!@#$%^&*()_+-=',.:".
3.The only space character in s is ' '.
*/
public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        String ss = s.trim();
        
        if(ss.equals("")) return 0;
        
        return ss.split("\\s+").length;
    }
}
