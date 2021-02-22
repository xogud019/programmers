package LeetCode.TwoPointer.Medium;

public class LongestWordInDictionaryThroughDeleting {
    public String findLongestWord(String s, List<String> d) {
        String answer = "";
        
        for(String dic : d){
            int len1 = answer.length(), len2 = dic.length();
            
            if(len1 > len2 || len1 == len2 && answer.compareTo(dic) < 0) continue;
            
            if(isSub(s, dic)) answer = dic;
        }
        
        return answer;
    }
    
    public boolean isSub(String s, String t){
        int i = 0 , j = 0;
        
        while(i<s.length() && j<t.length()){
            if(t.charAt(j) == s.charAt(i)){
                j++;
            }
            
            i++;
        }
        
        return j==t.length();
    }
}
