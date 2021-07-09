package CodingTest.Codility;

import java.util.*;

public class Brackets {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stk = new Stack<>();
        boolean isT = true;
        
        for(int i=0; i<S.length(); i++){
            char temp = S.charAt(i);
            
            if(temp=='('||temp=='{'||temp=='[') stk.push(temp);
            else{
                if(stk.size()==0) return 0;
                
                if(temp==')'&&stk.peek()=='('){
                    stk.pop();
                }
                else if(temp==']'&&stk.peek()=='['){
                    stk.pop();
                }
                else if(temp=='}'&&stk.peek()=='{'){
                    stk.pop();
                }
                else{
                    isT = false;
                    break;
                }
            }
        }
        
        if(!isT) return 0;
        else{
            if(stk.size()==0) return 1;
            else return 0;
        }
    }
    /*failed case = correct = 33, efficient 40
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stk = new Stack<>();
        boolean isT = true;
        
        for(int i=0; i<S.length(); i++){
            char temp = S.charAt(i);
            
            if(temp=='('||temp=='{'||temp=='[') stk.push(temp);
            else{
                if(temp==')'&&stk.peek()=='('){
                    stk.pop();
                }
                else if(temp==']'&&stk.peek()=='['){
                    stk.pop();
                }
                else if(temp=='}'&&stk.peek()=='{'){
                    stk.pop();
                }
                else{
                    isT = false;
                    break;
                }
            }
        }
        
        if(!isT) return 0;
        else{
            if(stk.size()==0) return 1;
            else return 0;
        }
    }
    */
}
