package level1;

public class Collatz {
    public static void main(String[] args){
        int num =626331;
        System.out.println(solution(num));
    }

    public static int solution(int num){
        int answer= 0;
        long numm= num;
        while(answer<500){
            if(numm==1){
                return answer;
            }
            else if(numm%2==0){
                numm/=2;
                answer++;
            }
            else{
                numm=numm*3+1;
                answer++;
            }
        }
        return answer = -1;
    }
}