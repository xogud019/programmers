package LeetCode.String.Easy;

public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        if(s.length()==0) return 0;
        
        int left = 0, right = s.length()-1;
        
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;    
            }
            else return 2;
        }
        
        return 1;
    }
}
