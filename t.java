//problem solving basic 
public class t {
    public static void main(String[] args){
        String s = "pTo*Ta*O";

        System.out.println(solution(s));
    }
    public static String solution(String s){
        String answer = "";
        int len = 0;
        for(int i=s.length()-1; i>=len; i--){
            char temp = s.charAt(i);
            if((temp>='a'&&temp<='z')||(temp>='A'&&temp<='Z')){
                answer =  temp +answer;
                continue;
            }
            if(temp=='0'){
                answer = s.charAt(len)+ answer;
                len++;
                continue;
            }

            if(temp=='*'){
                answer =  s.charAt(i-2)+answer;
                answer =  s.charAt(i-1)+answer;
                i-=2;
                continue;
            }
            
        }

        return answer;
    }
    /*
    public static String solution(String s){
        String answer = "";
        Stack<Character> stk = new Stack<>();
        int len = 0;
        for(int i=s.length()-1; i>=len; i--){
            char temp = s.charAt(i);
            if((temp>='a'&&temp<='z')||(temp>='A'&&temp<='Z')){
                stk.push(temp);
                continue;
            }
            if(temp=='0'){
                stk.push(s.charAt(len));
                len++;
                continue;
            }

            if(temp=='*'){
                stk.push(s.charAt(i-2));
                stk.push(s.charAt(i-1));
                i-=2;
                continue;
            }
            
        }

        while(!stk.isEmpty()){
            answer+=stk.pop();
        }

        return answer;
    }
    */
}