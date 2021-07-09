package CodingTest.Programmers.level2;

import java.util.*;

public class CorParen {
    public static void main(String[] args){
        String s = "()))((()";
        System.out.println(solution(s));
    }   

    public static boolean solution(String s){
        boolean answer = true;
        Stack<Character> stk = new Stack<>();

        if(s.length()%2==1){
            return false;
        }
        int LCount = 0, RCount = 0;

        for(int i=0; i<s.length(); i++){
            if(stk.isEmpty()&&s.charAt(i)==')'){
                return false;
            }
            if(s.charAt(i)=='('){
                stk.push('(');
                LCount++;
            }
            else{
                stk.pop();
                RCount++;
            }
        }

        if(RCount!=LCount){
            return false;
        }
        return answer;
    }
}