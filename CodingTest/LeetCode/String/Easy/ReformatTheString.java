package CodingTest.LeetCode.String.Easy;

public class ReformatTheString {
    public String reformat(String s) {
        String answer = "";
        String letter = "";
        String digit = "";
        
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)) digit += c;
            else letter += c;
        }
        
        if(Math.abs(digit.length()-letter.length())>1) return "";
        if(letter.length()==1 && digit.length() ==0) return letter;
        if(letter.length()==0 && digit.length() ==1) return digit;
        // 33  0a1b2c
        // 32  0a1b2
        // 23  a0b1c
        if(digit.length() >= letter.length()){
            int idx = 0;
            
            for(int i=0; i<letter.length(); i++){
                answer += digit.charAt(i)+""+letter.charAt(i);
                idx = i;
            }
            
            if(idx == digit.length()-2){
                answer += digit.charAt(idx+1);
            }
        }
        else{
            int idx = 0;
            
            for(int i=0; i<digit.length(); i++){
                answer += letter.charAt(i)+""+digit.charAt(i);
                idx = i;
            }
            
            if(idx == letter.length()-2){
                answer += letter.charAt(idx+1);
            }
        }
        return answer;
    }
}
