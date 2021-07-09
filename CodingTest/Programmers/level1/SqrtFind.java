package CodingTest.Programmers.level1;


public class SqrtFind {
    public static void main(String[] args){
        long n = 64;
        System.out.println(solution(n));
    }

    public static long solution(long n){
        if(Math.sqrt((double)n)==(long)Math.sqrt((double)n)){
            return ((long)Math.sqrt((double)n)+1)*((long)Math.sqrt((double)n)+1);
        }
        else{
            return -1;
        }
    }
}