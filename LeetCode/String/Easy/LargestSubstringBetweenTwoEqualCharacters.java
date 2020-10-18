package LeetCode.String.Easy;

public class LargestSubstringBetweenTwoEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int answer = -1;
        int len = s.length();
        
        for(int i=0; i<len; i++){
            for(int j=len-1; j>=i; j--){
                if(s.charAt(i)==s.charAt(j)){
                    answer = Math.max(answer,len-((i+1)+(len-j)));
                }
            }
        }
                            
        return answer;
    }
}
