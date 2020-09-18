package Programmers.level1;

public class SUBACK {
    public static void main(String[] args){
        int n =4;
        System.out.println(solution(n));
    }

    public static String solution(int n){
        char[] arr = {'s','b'};
        String s = "";

        for(int i=0; i<n; i++){
            s+=arr[i%2];
        }
        
        return s;
    }
}