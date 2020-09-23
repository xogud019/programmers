package BJ.DS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//try again
public class StackSquen {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int idx = 0;

        for(int i=0; i<n; i++){
            if(i+1<=arr[idx]){
                stk.push(i+1);
                sb.append("+ \n");

                while(idx<n&&!stk.isEmpty()&&stk.peek()==arr[idx]){
                    stk.pop();
                    sb.append("- \n");
                    idx++;
                }
            }
        }

        if(stk.isEmpty()) System.out.println(sb.toString());
        else System.out.println("NO");
    }    
}
