package CodingTest.BJ.DS;
import java.util.*;

public class Parenthesis {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Stack<Character> stk;

        for(int i=0; i<n; i++){
            String s = scan.nextLine();
            stk = new Stack<>();

            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='(') stk.push('(');
                else{
                    if(!stk.isEmpty()) stk.pop();
                    else{
                        stk.push(')');
                        break;
                    }
                }
            }

            if(stk.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }

        scan.close();
    }
}
