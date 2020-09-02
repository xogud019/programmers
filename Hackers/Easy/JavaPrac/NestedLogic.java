package Hackers.Easy.JavaPrac;
import java.io.*;
import java.util.*;

public class NestedLogic {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println(Solution());
    }

    public static int Solution(){
        Scanner scan = new Scanner(System.in);
        int aDay = scan.nextInt();
        int aMonth = scan.nextInt();
        int aYear = scan.nextInt();
        int eDay = scan.nextInt();
        int eMonth = scan.nextInt();
        int eYear = scan.nextInt();

        if(aYear>eYear){
            scan.close();
            return 10000;
        }
        else if(aMonth>eMonth&&aYear>=eYear){
            scan.close();
            return 500*(aMonth-eMonth);
        }
        else if(aDay>eDay&&aMonth>=eMonth&&aYear>=eYear){
            scan.close();
            return 15*(aDay-eDay);
        }
        else{
            scan.close();
            return 0;
        } 

    }
}