package LeetCode.BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8
*/
public class GenerateParentheses {
    List<String> answer;
    
    public List<String> generateParenthesis(int n) {
        answer = new ArrayList<>();
        
        backtracking(new StringBuilder(), n*2);
        
        return answer;
    }
    
    public void backtracking(StringBuilder sb, int len){
        if(sb.length() == len){
            //System.out.println(sb.toString());
            if(vaild(sb.toString())){
                answer.add(sb.toString());
                return;
            }
        }
        else{
            sb.append("(");
            backtracking(sb, len);
            sb.deleteCharAt(sb.length()-1);
            sb.append(")");
            backtracking(sb, len);
            sb.deleteCharAt(sb.length()-1);    
        }
    }
    
    public boolean vaild(String s){
        Stack<Character> stk = new Stack<>();
        
        for(char c:s.toCharArray()){
            if(stk.isEmpty() && c == ')') return false;
            
            if(c == '(') stk.push('(');
            else stk.pop();
        }
        
        return stk.isEmpty();
    }
}
