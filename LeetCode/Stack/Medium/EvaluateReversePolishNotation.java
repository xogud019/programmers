package LeetCode.Stack.Medium;

import java.util.Stack;

/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, and /. Each operand may be an integer or another expression.

Note that division between two integers should truncate toward zero.

It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.

 

Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
 

Constraints:

1 <= tokens.length <= 104
tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
*/
public class EvaluateReversePolishNotation {
    //17ms
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        
        for(String s : tokens){
            if(isNum(s)){
                int n = Integer.parseInt(s);
                
                stk.push(n);
            }
            else{
                int n1 = stk.pop(), n2 = stk.pop();
                
                if(s.equals("+")) stk.push(n2+n1);
                else if(s.equals("-")) stk.push(n2-n1);
                else if(s.equals("*")) stk.push(n2*n1);
                else stk.push(n2/n1);
            }
        }
        
        return stk.pop();
    }
    
    public boolean isNum(String s){
        try{
            Integer.parseInt(s);
            
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }

    /*4ms
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        
        for(String s : tokens){
            if("+-/*".contains(s)){
                int n1 = stk.pop(), n2 = stk.pop();
                
                if(s.equals("+")) stk.push(n2+n1);
                else if(s.equals("-")) stk.push(n2-n1);
                else if(s.equals("*")) stk.push(n2*n1);
                else stk.push(n2/n1);
            }
            else{
                int n = Integer.parseInt(s);
                
                stk.push(n);
            }
        }
        
        return stk.pop();
    }
    */
}
