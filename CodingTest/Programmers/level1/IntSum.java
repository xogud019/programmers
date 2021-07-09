package CodingTest.Programmers.level1;

public class IntSum {
    public static void main(String[] args){
        int a = 3;
        int b =5;
        System.out.println(solution(a, b));
    }

    public static long solution(int a, int b){
        long answer= 0;
        int f = 0, e =0;
        if(a>b){
            e=a;
            f=b;
        }
        else{
            f=a;
            e=b;
        }
        for(int i=f; i<e+1; i++){
            answer+=i;
        }
        return answer;
    }
}