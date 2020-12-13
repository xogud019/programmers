package LeetCode.Stack.Easy;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        
        for(char c:S.toCharArray()){
            if(c != '#') stk1.push(c);
            else if(!stk1.isEmpty()) stk1.pop();
        }
        
        for(char c:T.toCharArray()){
            if(c != '#') stk2.push(c);
            else if(!stk2.isEmpty()) stk2.pop();
        }
       
        String s = String.valueOf(stk1);
        String t = String.valueOf(stk2);
        
        return s.equals(t);
    }
}
