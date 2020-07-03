package level2;
import java.util.*;

public class MaxExpression {

    public static void main(String[] args){
        //String expression = "100-200*300-500+20";
        String expression = "50*6-3*2";
        
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
        List<String> nums = new ArrayList<>();
        List<String> opers = new ArrayList<>();

        for(int i=0; i<rotate.length; i++){
            nums.clear();
            opers.clear();
            for(int ii=0; ii<num.length; ii++){
                nums.add(num[ii]);
            }
            for(int ii=0; ii<oper.length; ii++){
                opers.add(oper[ii]);
            }
            for(int j=0; j<rotate[i].length; j++){
                operand = new Stack<>();
                operator = new Stack<>();

                operand.push(nums.get(0));
                for(int k=0; k<opers.size(); k++){
                    operand.push(nums.get(k+1));
                    operator.push(opers.get(k));

                    if(operator.peek().equals(rotate[i][j])){
                        long num2 = Long.parseLong(operand.pop());
                        long num1 = Long.parseLong(operand.pop());
                        String op = operator.pop();
                        operand.push(calc(num1, num2, op));
                    }
                }

                nums.clear();
                opers.clear();

                while(!operand.isEmpty()){
                    nums.add(operand.pop());
                }

                while(!operator.isEmpty()){
                    opers.add(operator.pop());
                }
                Collections.reverse(nums);
                Collections.reverse(opers);
            }

            if(nums.size()==1){
                answer = Math.max(answer, Math.abs(Long.parseLong(nums.get(0))));
            }
            
        }
        
        return answer;
    }   

    public static String calc(long n1, long n2, String oper){
        if(oper.equals("*")){
            return Long.toString(n1*n2);
        }
        else if(oper.equals("+")){
            return Long.toString(n1+n2);
        }
        else{
            return Long.toString(n1-n2);
        }
    }
}