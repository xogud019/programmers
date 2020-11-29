package LeetCode.String.Easy;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int upper = 0, lower = 0;
        
        for(char c:word.toCharArray()){
            if(Character.isLowerCase(c)) lower++;
            else upper++;
        }
        
        if(lower == 0) return true;
        
        if(upper == 0) return true;
        
        if(upper == 1){
            if(Character.isUpperCase(word.charAt(0))) return true;
            else return false;
        }
        
        return false;
    }
}
