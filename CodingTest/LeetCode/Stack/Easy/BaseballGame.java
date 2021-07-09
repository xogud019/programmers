package CodingTest.LeetCode.Stack.Easy;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stk = new Stack<>();
        int answer = 0;
        
        for(String s:ops){
            if(isNum(s)){
                stk.push(Integer.parseInt(s));
            }
            else{
                if(s.equals("C")){
                    stk.pop();
                }
                else if(s.equals("D")){
                    stk.push(stk.peek()*2);
                }
                else{
                    int prev = stk.pop();
                    int pprev = stk.pop();
                    stk.push(pprev);
                    stk.push(prev);
                    stk.push(prev+pprev);
                }
            }
        }
        
        while(!stk.isEmpty()){
            answer += stk.pop();
        }
        
        return answer;
    }
    
    public boolean isNum(String s){
        try {
            Integer.parseInt(s);
            return true;
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }
}
