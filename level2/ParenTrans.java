package level2;
import java.util.*;

class ParenTrans{
    public static void main(String[] args){
        String s = "()()(())";
        System.out.println(solution(s));
        //System.out.println(s.substring(1, s.length()-1));
    }

    public static String solution(String s){
        String answer = "";
        answer= div(s);
        return answer;
    }

    public static String div(String s){
        String result ="";
        if(s.length()<2||s.length()>1000){
            return "";
        }

        String u ="", v = "";
        int LCount = 0, RCount = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                LCount++;
            }
            else{
                RCount++;
            }

            if(LCount==RCount&&LCount!=0){
                u = s.substring(0, i+1);
                v = s.substring(i+1, s.length());
                break;
            }
        }
        //System.out.println(u);
        /*
        System.out.println(u);
        System.out.println();
        */
        if(RightParen(u)){
            String temp = div(v);
            u += temp;
            result = u;
        }
        else{
            String temp = "(";
            String tempU = "";
            u = u.substring(1, u.length()-1);

            for(int i=0; i<u.length(); i++){
                if(u.charAt(i)==')'){
                    tempU +="(";
                }
                else{
                    tempU +=")";
                }
            }

            temp +=div(v)+")" +tempU;
            result = temp;
        }
        //System.out.println(u);
        return result;
    }

    public static boolean RightParen(String u){
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<u.length(); i++){
            if(u.charAt(i)=='('){
                stk.push('(');
            }
            else{
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
        }

        if(stk.isEmpty()){
            return true;
        }
        else return false;
    }
}