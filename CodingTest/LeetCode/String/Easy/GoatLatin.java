package CodingTest.LeetCode.String.Easy;

public class GoatLatin {
    public String toGoatLatin(String S) {
        String str = "aeiouAEIOU";
        String[] s = S.split(" ");
        String adder = "maa";
        String answer = "";
        
        for(int i=0; i<s.length; i++){
            if(str.contains(Character.toString(s[i].charAt(0)))) s[i] += adder;
            else{
                String temp = ""+s[i].charAt(0);
                s[i] = s[i].substring(1,s[i].length())+temp+adder;
                
            }
            
            adder+="a";         
            answer += s[i]+" ";
        }
        
        return answer.trim();
    }
}
