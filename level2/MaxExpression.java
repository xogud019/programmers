package level2;
import java.util.*;

public class MaxExpression {
    static List<String> operator = new ArrayList<>();

    public static void main(String[] args){
        String expression = "100-200*300-500+20";

        System.out.println(solution(expression));
    }

    public static long solution(String expression){
        long answer = 0;
        Stack<Integer> operand = new Stack<>();
        Set<Character> oper = new HashSet<>();

        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i)=='*'||expression.charAt(i)=='+'||expression.charAt(i)=='-'){
                oper.add(expression.charAt(i));
            }
        }

        /*
        expression = expression.replaceAll("[*||+||-]", "_");
        String[] temp = expression.split("_");
        int[] num =new int[temp.length];
        for(int i=0; i<temp.length; i++){
            num[i]= Integer.parseInt(temp[i]);
        }
        */
        //System.out.println(expression);
        char[] s = new char[oper.size()];
        int index = 0;
        for(char c:oper){
            s[index] =c;
            index++;
        }

        perm(s, 0, s.length);

        for(int i=0; i<)
        /*
        for(String k:operator){
            System.out.println(k);
        }
        */
        /*
        for(int i=0; i<operator.size(); i++){

        }
        */        
        return answer;
    }

    public static void perm(char[] s, int depth, int max){
        if(depth==max){
            String temp = "";
            for(int i=0; i<s.length; i++){
                temp+=s[i];
            }

            operator.add(temp);
            return;
        }
        for(int i=depth; i<s.length; i++){
            swap(s, i, depth);
            perm(s, depth+1, max);
            swap(s, i, depth);
        }
    }

    public static void print(char[] s){
        for(int i=0; i<s.length; i++){
            System.out.print(s[i]);
        }
        System.out.println();
    }

    public static void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}