package level2;
import java.util.*;

public class MaxExpression {

    public static void main(String[] args){
        String expression = "100-200*300-500+20";
        //60420
        System.out.println(solution(expression));
    }
//100-60000-500+20
    public static long solution(String expression){
        long answer = 0;
        String[][] rotate = {{"*","+","-"},{"*","-","+"},{"+","*","-"},{"+","-","*"},{"-","+","*"},{"-","*","+"}};
        String[] num = expression.split("[*||+||-]");
        expression =  expression.replaceAll("[0-9]", "").trim();
        String[] oper = expression.split("");
        Stack<String> operand;
        Stack<String> operator;

        for(int i=0; i<rotate.length; i++){
            String[] nums = new String[num.length];
            nums = num;

            for(int j=0; j<rotate[i].length; j++){
                operand = new Stack<>();
                operator = new Stack<>();

                operand.push(nums[0]);

                for(int k=0; k<oper.length; k++){
                    operand.push(num[k+1]);
                    operator.push(oper[k]);

                    if(operator.peek().equals(rotate[i][j])){
                        int num2 = Integer.parseInt(operand.pop());
                        int num1 = Integer.parseInt(operand.pop());
                        String op = operator.pop();
                        operand.push(calc(num1, num2, op));
                    }
                }

                nums[0] = operand.pop();
                
                
            }
        }
            
            
            /*
            if(answer<Math.abs(Integer.parseInt(operand.peek()))){
                answer = Math.abs(Integer.parseInt(operand.pop()));
            }
            */
        

        // System.out.println(operand.size());
        /*
        for(String k : tempNum){
            System.out.println(k);
        }
        */
        //System.out.println(expression.trim());
        /*
        for(String k : oper){
            System.out.println(k);
        }
        */
        return answer;
    }   

    public static String calc(int n1, int n2, String oper){
        if(oper.equals("*")){
            return Integer.toString(n1*n2);
        }
        else if(oper.equals("+")){
            return Integer.toString(n1+n2);
        }
        else{
            return Integer.toString(n1-n2);
        }
    }
}