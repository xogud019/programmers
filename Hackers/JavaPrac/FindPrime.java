package Hackers.JavaPrac;
import java.io.*;
import java.util.*;
//time complexity root(n)
public class FindPrime {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i=0; i<t; i++){
            
            Solution(scan.nextInt());
        }

        scan.close();
    }

    public static void Solution(int n){
        if(n==1){
            System.out.println("Not prime");
            return;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                System.out.println("Not prime");
                return;
            }
        }

        System.out.println("Prime");
    }
}