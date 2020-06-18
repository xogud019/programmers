package level3;

public class Tile {
    public static void main(String[] args){
        int N =6 ;
        System.out.println(solution(N));
    }

    public static long solution(int N){
        long answer =0;
        long f1 = 1;
        long f2 = 1;
        answer = tiling(N, 0, f1, f2);
        return answer;
    }

    public static long tiling(int N, int index, long f1, long f2){
        if(index==N-2){
            return f2*2+(f1+f2)*2;
        }
        else{
            long f3 = f1+f2;
            f1= f2;
            f2= f3;
            return tiling(N, index+1, f1, f2);
        }
    }
}