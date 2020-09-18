//stack
package Programmers.level1;

import java.util.*;

public class IronStick {
    public static void main(String[] args){
        String arrangement = "()(((()())(())()))(())";
        System.out.println(solution(arrangement));
    }

    public static int solution(String arrangement){
        String s = arrangement;
        int answer = 0;
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                if(i+1<s.length()&&s.charAt(i+1)=='('){
                    stk.push('(');
                }
                else{
                    answer+=stk.size();
                    i++;
                }
            }
            else{
                stk.pop();
                answer++;
            }
        }
        return answer;
    }
}