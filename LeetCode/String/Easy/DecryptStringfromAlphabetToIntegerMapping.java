package LeetCode.String.Easy;

public class DecryptStringfromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#'){
                int temp = Integer.parseInt(s.charAt(i-2)+""+s.charAt(i-1));
                s = s.substring(0,i-2)+(char)(temp-1+'a')+s.substring(i+1,s.length());
            }
        }
        
        for(int i=0; i<s.length(); i++){
            int temp = s.charAt(i)-'0';
            
            if(temp>=1 && temp<= 9){
                s = s.substring(0,i)+(char)(temp-1+'a')+s.substring(i+1,s.length());
            }
        }
        
        return s;
    }
}
