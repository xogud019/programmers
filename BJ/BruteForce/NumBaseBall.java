package BJ.BruteForce;

import java.util.Scanner;
import java.util.Stack;

public class NumBaseBall {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Stack<String> stk = new Stack<>();
        int answer = 0;
        int n = scan.nextInt();
        String[] arr = new String[n];
        int[] srk = new int[n];
        int[] ball = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.toString(scan.nextInt());
            srk[i] = scan.nextInt();
            ball[i] = scan.nextInt();
        }

        scan.close();
        
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                for(int k=1; k<10; k++){
                    if(i!=j&&j!=k&&i!=k){
                        stk.push(i+""+j+""+k);
                    }
                }
            }
        }

        while(!stk.isEmpty()){
            String anNum = stk.pop();
            if(isStk(anNum, arr, srk)&&isBall(anNum, arr, ball)) answer++;
        }

        System.out.println(answer);
        return;
    }

    public static boolean isStk(String anNum, String[] arr, int[] srk){
        for(int i=0; i<arr.length; i++){
            int count = 0;

            for(int j=0; j<3; j++){
                if(anNum.charAt(j)==arr[i].charAt(j)) count++;
            }

            if(count!=srk[i]) return false;
        }
        
        return true;
    }
    public static boolean isBall(String anNum, String[] arr, int[] ball){
        for(int i=0; i<arr.length; i++){
            int count = 0;

            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    if(j!=k&&anNum.charAt(j)==arr[i].charAt(k)) count++;
                }
            }

            if(count!=ball[i]) return false;
        }

        return true;
    }
}
