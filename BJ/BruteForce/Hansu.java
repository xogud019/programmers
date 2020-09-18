package BJ.BruteForce;

import java.util.Scanner;

public class Hansu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        
        if(N<100){
            System.out.println(N);
            return;
        }
        
        if(N==1000){
            System.out.println(144);
            return;
        }
        
        int answer = 99;
        
        for(int i=100; i<=N; i++){
            int num1 = i%10;
            int num2 = i/10%10;
            int num3 = i/100%10;
            
            if(num2*2==num1+num3) answer++;
        }
        
        System.out.println(answer);
        return;
    }
}
