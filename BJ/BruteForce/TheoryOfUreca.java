package BJ.BruteForce;

import java.util.Scanner;

public class TheoryOfUreca {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();


        for(int i=0; i<t; i++){
            int n = scan.nextInt();

            if(isT(n)) System.out.println(1);
            else System.out.println(0);
        }

        scan.close();
    }

    public static boolean isT(int n){
        for(int i=1; i<100; i++){
            for(int j=1; j<100; j++){
                for(int k=1; k<100; k++){
                    if(n==(i*(i+1))/2+(j*(j+1))/2+(k*(k+1))/2) return true;
                }
            }
        }

        return false;
    }
}
