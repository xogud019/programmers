package Programmers.level1;


public class OddEven {
    public static void main(String[] args){
        int n =3;
        System.out.println(solution(n));
    }

    public static String solution(int n){
        if(n==0){
            return "Even";
        }
        else if(n%2==0){
            return "Even";
        }   
        else return "Odd";
    }
}