package LeetCode.Stack.Easy;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        String answer = "";
        int open = 0 ;
        
        for(int i=0; i<S.length(); i++){
            char temp = S.charAt(i);
            
            if(temp == '('){
                if(open != 0) answer += temp;
                
                open++;
            }
            else{
                open--;

                if(open != 0) answer += temp;                
            }
        }
        
        return answer;
    }
}
