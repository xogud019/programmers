package CodingTest.LeetCode.String.Easy;

public class MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        int answer = 0;
        
        if(s.length() == 2){
            answer = zero(s.substring(0,1))+one(s.substring(1,2));
        }
        
        if(s.length() == 3){
            answer = Math.max(zero(s.substring(0,1))+one(s.substring(1,3)),zero(s.substring(0,2))+one(s.substring(2,3)));
        }
        
        for(int i=1; i<s.length(); i++) answer = Math.max(answer, zero(s.substring(0,i))+one(s.substring(i,s.length())));
        
        return answer;
    }
    
    public int zero(String s){
        int n = 0;
        
        for(char c : s.toCharArray()){
            if(c == '0') n++;
        }
        
        return n;
    }
    
    public int one(String s){
        int n = 0;
        
        for(char c : s.toCharArray()){
            if(c == '1') n++;
        }
        
        return n;
    }
}
