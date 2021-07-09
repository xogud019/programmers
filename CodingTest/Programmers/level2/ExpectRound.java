package CodingTest.Programmers.level2;


public class ExpectRound {
    public static void main(String[] args){
        int n = 8;
        int a = 2;
        int b = 3;
        System.out.println(solution(n, a, b));
    }

    public static int solution(int n, int a, int b){
        int answer = 1;
        while(true){
            if(((a%2==1)&&b==a+1)||((b%2==1)&&a==b+1)){
                return answer;
            }
            answer++;
            a= a/2+a%2;
            b= b/2+b%2;
        }
    }
}