package CodingTest.Programmers.level1;

public class DivisorSum {
    public static void main(String[] args){
        int n = 12;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer= n;
        for(int i=1; i<n/2+1; i++){
            if(n%i==0){
                answer+= i;
            }
        }
        return answer;
    }
}