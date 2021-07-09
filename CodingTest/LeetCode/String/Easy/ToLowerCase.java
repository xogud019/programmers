package CodingTest.LeetCode.String.Easy;
/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
 

Constraints:

1 <= s.length <= 100
s consists of printable ASCII characters.
*/
public class ToLowerCase {
    //using method
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    /*using ascii
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(char c:s.toCharArray()){
            if(c >= 'A' && c <= 'Z') sb.append(""+(char)(c+32));
            else sb.append(""+c);
            
        }
        
        return sb.toString();
    }
    */
}
