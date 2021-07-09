package Programmers.level3;


public class NTiling {
    static int mod = 1000000007;
    public static void main(String[] args){
        int n = 4;
        System.out.println(solution(n));
    } 

    public static int solution(int n) {
        int answer = 0;
        int f1 = 1;
        int f2 = 2;
        answer=dfs(0, n-2, f1, f2);
        return answer;
    }

    public static int dfs(int index, int max, int f1, int f2){
        if(index==max){
            return f2;
        }
        
        int f3 = (f1+f2)%mod;
        f1 = f2;
        f2 = f3;
        return dfs(index+1, max, f1, f2);
    }
}