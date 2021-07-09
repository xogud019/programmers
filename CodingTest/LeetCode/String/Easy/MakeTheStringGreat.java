package CodingTest.LeetCode.String.Easy;

//import java.util.Stack;

public class MakeTheStringGreat {
    //2ms
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0; i<sb.length()-1; i++){
            if(Math.abs(sb.charAt(i)-sb.charAt(i+1)) == 32){
                sb = sb.delete(i,i+2);
                i = -1;
            }    
            //System.out.println(sb);
        }
               
        return sb.toString();
    }
    /*10ms
    public String makeGood(String s) {
        String answer = "";
        Stack<Character> stk = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(stk.isEmpty()){
                stk.push(c);
                continue;
            }
            
            char temp = stk.peek();
            //up 65-90  down 97-122
            if(Math.abs(temp-c) == 32) stk.pop();
            else stk.push(c);
        }
        
        while(!stk.isEmpty()) answer = stk.pop()+answer;
        
        return answer;
    }
    */
}
