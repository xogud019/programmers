package LeetCode.Easy;

public class ThousandSeparator {
    public String thousandSeparator(int n) {
        String s = Integer.toString(n);
        String answer ="";
        int len = s.length();
        
        if(len<4) return s;
        
        int count = 0;
        
        for(int i= len-1; i>=0; i--){
            if(count!=0 && count%3 ==0){
                answer = "."+answer;
                i++;
                count = -1;
                
            }
            else{
                answer = s.charAt(i)+answer;
            }
            count++;
        }
        
        return answer;
    }
}
