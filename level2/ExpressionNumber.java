package level2;

public class ExpressionNumber {
    public static void main(String[] args){
        int n = 15;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer = 0;
        int fNum = 1;
        
        while(fNum<=n){
            int total = 0;
            for(int i=fNum; i<=n; i++){
                total += i;
                if(total == n){
                    answer++;
                    fNum++;
                    break;
                }
                else if(total>n){
                    fNum++;
                    break;
                }
            }
        }
        return answer;
    }
}