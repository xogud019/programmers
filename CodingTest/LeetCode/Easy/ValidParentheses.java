package CodingTest.LeetCode.Easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            
            if(temp=='('||temp=='{'||temp=='['){
                stk.push(temp);
                continue;
            }
            else{
                if(stk.isEmpty()) return false;
                if(temp==')'&&stk.peek()=='('){
                    stk.pop();
                    continue;
                }
                if(temp=='}'&&stk.peek()=='{'){
                    stk.pop();
                    continue;
                }
                if(temp==']'&&stk.peek()=='['){
                    stk.pop();
                    continue;
                }
                
                return false;
            }
           
        }
        
        return stk.size()==0?true:false;
    }
}
