package CodingTest.Programmers.level2;

import java.util.Stack;

public class RotateParen {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        
        for(int i=0; i<s.length(); i++){
            rotate(arr);
            
            if(vaild(arr)) answer++;
        }
        
        return answer;
    }
    
    public void rotate(char[] arr){
        char temp = arr[0];
        int i=1;
        
        while(i<arr.length){
            arr[i-1] = arr[i];
            i++;
        }
        
        arr[i-1] = temp;
    }
    
    public boolean vaild(char[] arr){
        Stack<Character> stk = new Stack<>();
        
        for(char c:arr){
            if(stk.isEmpty() && (c == ')' || c == '}' || c == ']')) return false;
            else{
                if(c == '(' || c == '{' || c == '['){
                    stk.push(c);
                } 
                else{
                    if(c == ')' && stk.peek() == '(') stk.pop();
                    else if(c == '}' && stk.peek() == '{') stk.pop();
                    else if(c == ']' && stk.peek() == '[') stk.pop();
                    else stk.push(c);
                 }
            }
        }
        
        return stk.isEmpty();
    }
}
