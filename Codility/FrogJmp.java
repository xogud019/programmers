package Codility;

public class FrogJmp {
    /*correct = 100; efficent = 0;
    static int answer = 0;
    
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        dfs(Y-X, D);
        return answer;
    }
    
    public void dfs(int max, int D){
        if(max <= 0 ){
            return;
        }
        else{
            answer++;
            dfs(max-D,D);
        }
    }
    */

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int div = Y-X;
        int answer = 0;
        
        if(div%D==0){
            answer = div/D;
        }
        else{
            answer = div/D+1;
        }
        
        return answer;
    }
}
