package LeetCode.Math.Easy;

public class Base7 {
    public String convertToBase7(int num) {
        if(num ==0 ) return "0";
        
        String answer = "";
        int n = Math.abs(num);
        
        while(n>0){
            answer = n%7+answer;
            n /= 7;
        }
        
        if(num < 0 ) answer = "-"+answer;
        
        return answer;
    }
}
