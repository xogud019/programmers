package LeetCode.String.Easy;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String answer = "";
        StringBuilder sb;
        String[] arr = s.split(" ");
        
        for(String i:arr){
            sb = new StringBuilder(i);
            answer += sb.reverse().toString()+" ";
        }
        
        
        return answer.trim();
    }
}
