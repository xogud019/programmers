package CodingTest.BJ.DS;

import java.util.*;
import java.io.*;

public class ReverseWord2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        Stack<Character> stk = new Stack<>();
        boolean isTag = false;

        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)=='<'){
                while(!stk.isEmpty()){
                    System.out.print(stk.pop());
                }
                isTag = true;
                System.out.print(sb.charAt(i));
            }
            else if(sb.charAt(i)=='>'){
                isTag = false;
                System.out.print(sb.charAt(i));
            }
            else if(isTag){
                System.out.print(sb.charAt(i));
            }
            else{
                if(sb.charAt(i)==' '){
                    while(!stk.isEmpty()){
                        System.out.print(stk.pop());
                    }
                    System.out.print(sb.charAt(i));
                }
                else{
                    stk.push(sb.charAt(i));
                }
            }
        }

        while(!stk.isEmpty()){
            System.out.print(stk.pop());
        }

    }
}
