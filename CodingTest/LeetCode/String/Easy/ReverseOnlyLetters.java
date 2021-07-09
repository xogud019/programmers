package CodingTest.LeetCode.String.Easy;

import java.util.Stack;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        
        for(char c : S.toCharArray()){
            if(Character.isLetter(c)) stk.push(c);
        }
        
        for(char c: S.toCharArray()){
            if(Character.isLetter(c)) answer.append(stk.pop());
            else answer.append(c);
        }
        
        return answer.toString();
    }
}
