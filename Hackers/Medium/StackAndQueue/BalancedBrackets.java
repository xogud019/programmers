package Hackers.Medium.StackAndQueue;
import java.io.*;
import java.util.*;

public class BalancedBrackets {
    static String isBalanced(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char brek = s.charAt(i);
            
            if(stk.isEmpty()){
                stk.push(brek);
                continue;
            }

            if(stk.peek()=='['&&brek==']'){
                stk.pop();
                continue;
            }
            else if(stk.peek()=='{'&&brek=='}'){
                stk.pop();
                continue;
            }
            else if(stk.peek()=='('&&brek==')'){
                stk.pop();
                continue;
            }
            else stk.push(brek);
        }
        
        return stk.size()==0? "YES":"NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}