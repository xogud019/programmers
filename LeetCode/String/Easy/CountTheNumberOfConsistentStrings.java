package LeetCode.String.Easy;

public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int answer = 0;
        
        for(String s:words){
            boolean isC = true;
            for(int i=0; i<s.length(); i++){
                if(!allowed.contains(Character.toString(s.charAt(i)))){
                    isC = false;
                    break;
                }
            }    
            
            if(isC) answer++;
        }
        
        return answer;
    }
}
