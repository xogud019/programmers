package CodingTest.LeetCode.Stack.Medium;

public class ScoreOfParentheses {
    //stack counting
    public int scoreOfParentheses(String S) {
        int stk = 0, answer = 0;
        
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            
            if(c == '(') stk++;
            else{
                stk--;
                if(S.charAt(i-1)=='('){ 
                    answer += 1 << stk;
                }
            }
        }
        
        return answer;
    }
    
    /*using stack
    public int scoreOfParentheses(String S) {
        Stack<Integer> stk = new Stack<>();
        
        stk.push(0);
        
        for(char c:S.toCharArray()){
            if(c=='(') stk.push(0);
            else{
                int prev = stk.pop();
                int pprev = stk.pop();
                
                stk.push(pprev+Math.max(2*prev,1));
            }
        }
        
        return stk.pop();
    }
    */

    /*dq
    public int scoreOfParentheses(String S) {
        return dq(S, 0, S.length());
    }
    
    public int dq(String s, int start, int end){
        int answer = 0, stk = 0;
        
        for(int i=start; i<end; i++){
            stk += s.charAt(i) == '(' ? 1 : -1;
            
            if(stk == 0){
                if(i-start == 1) answer++;
                else answer += 2*dq(s, start+1, i);
                start = i+1;
            }
        }
        
        return answer; 
    }
    */
}
