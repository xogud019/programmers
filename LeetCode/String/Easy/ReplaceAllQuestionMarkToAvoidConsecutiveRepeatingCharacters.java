package LeetCode.String.Easy;

public class ReplaceAllQuestionMarkToAvoidConsecutiveRepeatingCharacters {
    public String modifyString(String s) {
        if(s.length()==1 && s.equals("?")) return "a";
        if(s.length()==1 && !s.equals("?")) return s;
        
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0; i<sb.length(); i++){
            int base = 97;
            
            if(sb.charAt(i)=='?'){
                if(i==0){
                    while((char)base == sb.charAt(i+1)) base++;
                    
                    sb = sb.replace(i,i+1,Character.toString((char)base));
                }
                else if(i==s.length()-1){
                    while((char)base == sb.charAt(i-1)) base++;
                    
                    sb = sb.replace(i,i+1,Character.toString((char)base));
                }
                else{
                    while((char)base == sb.charAt(i-1) || (char)base == sb.charAt(i+1)) base++;
                    
                    sb = sb.replace(i,i+1,Character.toString((char)base));
                }
            }
        }
        
        return sb.toString();
    }
}
