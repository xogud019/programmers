package LeetCode.Stack.Easy;

import java.util.Stack;

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
}
