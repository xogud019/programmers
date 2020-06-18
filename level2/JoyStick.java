package level2;
public class JoyStick {
    public static void main(String[] args){
        String[] s= {"JEROEN","JAN","BBAABAA","BBAABBB","BBAABAAAA","BBAABAAAAB"};
        for(int i=0; i<s.length; i++){
            System.out.println(solution(s[i]));
        }
    }

    public static int solution(String name){
        int answer = 0;
        int len = name.length();
        int min_move = len-1;
        for(int i=0; i<len; i++){
            int up = name.charAt(i) -'A';
            int down = 'Z'+1 - name.charAt(i);
            answer += (up>down)?down:up;
        }

        for(int i=0; i<len; i++){
            if(name.charAt(i)!='A'){
                int next = i+1;
                while(next<len&& name.charAt(next)=='A'){
                    next++;
                }

                int move = 2*i+len-next;
                min_move = Math.min(move,min_move);
            }
        }

        return answer+min_move;
    }
}
/*abstract[테스트 케이스]
BBABA → 6
BBBAAB → 8
BBAABAA → 7
BBAABBB → 10
BBAABAAAA → 7
BBAABAAAAB → 10
*/