package CodingTest.Programmers.level3;


public class NExpression {
    static int answer = -1;
    public static void main(String[] args){
        int N = 5;
        int number = 12;
        System.out.println(solution(N, number));
    }

    public static int solution(int N, int number){
        dfs(N, number, 0, 0);

        return answer;
    }

    public static void dfs(int N, int number, int sum, int count){
        int temp = N;
        if(count>8){
            answer = -1;
            return;
        }

        if(sum==number){
            if(answer ==-1||answer>count){
                answer = count;
                return;
            }
        }

        for(int i=1; i<9-count; i++){
            dfs(N, number, sum+temp, count+i);
            dfs(N, number, sum-temp, count+i);
            dfs(N, number, sum*temp, count+i);
            dfs(N, number, sum/temp, count+i);

            temp = temp*10 +N;
        }
    }
}