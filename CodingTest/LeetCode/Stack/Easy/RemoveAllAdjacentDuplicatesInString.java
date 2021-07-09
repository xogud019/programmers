package CodingTest.LeetCode.Stack.Easy;

import java.util.Stack;
/*
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

 

Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:

Input: s = "azxxzy"
Output: "ay"
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
*/
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String S) {
        String answer = "";
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<S.length(); i++){
            char temp = S.charAt(i);
            
            if(stk.isEmpty()){
                stk.push(temp);
                continue;
            }    
            
            if(stk.peek()==temp) stk.pop();
            else stk.push(temp);
        }
        
        while(!stk.isEmpty()) answer = stk.pop()+answer;
        
        return answer;
    }
    /*
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c:s.toCharArray()){
            if(stk.isEmpty()){
                stk.push(c);
                continue;
            }
            
            if(stk.peek() == c) stk.pop();
            else stk.push(c);
        }
        
        while(!stk.isEmpty()) sb.append(""+stk.pop());
        
        return sb.reverse().toString();
    }
    */
}
