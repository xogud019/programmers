package CodingTest.Programmers.level2;

import java.util.*;

public class MatchErase {
    public static void main(String[] args){
        String s = "baabaa";
        System.out.println(solution(s));
    }   

    public static int solution(String s){
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(stk.empty()){
                stk.add(s.charAt(i));
            }
            else{
                if(stk.peek()==s.charAt(i)){
                    stk.pop();
                }
                else{
                    stk.add(s.charAt(i));
                }
            }
        }
        /*
        if(stk.size()==0){
            return 1;
        }
        else return 0;
        */
        return stk.size()==0? 1:0;
    }
}