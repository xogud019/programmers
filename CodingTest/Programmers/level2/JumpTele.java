package Programmers.level2;


public class JumpTele {
    public static void main(String[] args){
        int N = 5000;
        System.out.println(solution(N));
    }

    public static int solution(int N){
        int answer = 0;
        
        while(N>1){
            if(N%2==1){
                answer++;
                N -=1;
            }
            else{
                N /=2;
            }
        }
        return answer+1;
    }
}