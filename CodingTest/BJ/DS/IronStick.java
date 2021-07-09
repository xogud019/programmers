package CodingTest.BJ.DS;

import java.util.*;
import java.io.*;

public class IronStick {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stk = new Stack<>();
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                if(i+1<s.length()&&s.charAt(i+1)=='('){
                    stk.push('(');
                }
                else{
                    answer += stk.size();
                    i++;
                }
            }
            else{
                stk.pop();
                answer++;
            }
        }

        System.out.println(answer);
    }
}
