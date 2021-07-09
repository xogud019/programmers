package CodingTest.LeetCode.Stack.Medium;

import java.util.Stack;
/*
Given a string s, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them causing the left and the right side of the deleted substring to concatenate together.

We repeatedly make k duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made.

It is guaranteed that the answer is unique.

 

Example 1:

Input: s = "abcd", k = 2
Output: "abcd"
Explanation: There's nothing to delete.
Example 2:

Input: s = "deeedbbcccbdaa", k = 3
Output: "aa"
Explanation: 
First delete "eee" and "ccc", get "ddbbbdaa"
Then delete "bbb", get "dddaa"
Finally delete "ddd", get "aa"
Example 3:

Input: s = "pbbcggttciiippooaais", k = 2
Output: "ps"
 

Constraints:

1 <= s.length <= 10^5
2 <= k <= 10^4
s only contains lower case English letters.
*/
public class RemoveAllAdjacentDuplicatesInStringII {
    class Pair{
        char ch = ' ';
        int cnt = 0;
        
        public Pair(char ch, int cnt){
            this.ch = ch;
            this.cnt = cnt;
        }
    }
    
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stk = new Stack<>();
        
        for(char c:s.toCharArray()){
            if(stk.isEmpty()){
                stk.push(new Pair(c, 1));
                continue;
            }    
            
            Pair prev = stk.peek();
            
            if(prev.ch == c){
                stk.push(new Pair(c, prev.cnt+1));
                
                if(stk.peek().cnt == k){
                    for(int i=0; i<k; i++) stk.pop();
                }
            }
            else{
                stk.push(new Pair(c, 1));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stk.isEmpty()) sb.append(""+stk.pop().ch);
        
        return sb.reverse().toString();
    }
}
