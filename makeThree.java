import java.util.*;

public class makeThree {
    public static void main(String[] args){
        long n =4;
        System.out.println(solution(n));
    }

    public static long solution(long n){
        long answer= 1;
        int b = 3;
        int c = 4;
        long[] arr = new long[(int)n];
        arr[0]=1;
        arr[1]=3;
        arr[2]=4;

        long check = 2;
        int count = 1;
        long temp;
        while(true){
            if(n>check){
                check*=2;
                count++;
            }
            else if(n==check){
                break;
            }
            else if(n<check){
                check/=2;
                count--;
                break;
            }
        }
        temp = n-check;
        for(int i=1; i<count; i++){
            b*=3;
        }        
    }
}