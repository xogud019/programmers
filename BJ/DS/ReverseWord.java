package BJ.DS;
import java.util.*;

public class ReverseWord {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        for(int i=0; i<n; i++){
            String s = scan.nextLine();
            String[] arr = s.split(" ");

            for(int j=0; j<arr.length; j++){
                StringBuffer sb = new StringBuffer(arr[j]);
                System.out.print(sb.reverse()+" ");
            }
            System.out.println();
        }
        scan.close();
    }
    /*time out
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        for(int i=0; i<n; i++){
            String s = scan.nextLine();
            String[] answer = s.split(" ");

            for(String k:answer){
                for(int j=k.length()-1; j>=0; j--) System.out.print(k.charAt(j));
                System.out.print(" ");
            }
            System.out.println();
        }
        scan.close();
    }
    */
    /*time out
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<n; i++){
            String s = scan.nextLine();

            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)==' '){
                    while(!stk.isEmpty()){
                        System.out.print(stk.pop());
                    }
                    System.out.print(" ");
                }
                else stk.push(s.charAt(j));
            }

            while(!stk.isEmpty()){
                System.out.print(stk.pop());
            }
            System.out.println();
        }
        scan.close();
    }
    */
}
