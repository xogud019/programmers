package LeetCode.String.Easy;

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        char start = s.charAt(0);
        int count = 1;
        int answer = 1;
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!=start){
                start = s.charAt(i);
                answer = Math.max(answer,count);
                count = 1;
            }    
            else count++;
        }
        
        answer = Math.max(answer,count);
        
        return answer;
    }
}
