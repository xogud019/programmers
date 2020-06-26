package level3;

public class NQueen {
    static int answer;
    public static void main(String[] args){
        int n = 4;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        answer = 0;
        int[] col = new int[n];
        backTracking(col, n, 0);
        return answer;
    }

    public static void backTracking(int[] col, int n, int index){
        if(index==n){
            answer++;
            return;
        }

        for(int i=0; i<n; i++){
            col[index] = i;
            if(promising(index, col)){
                backTracking(col, n, index+1);
            }
        }
    }

    public static boolean promising(int index, int[] col){
        for(int i=0; i<index; i++){
            if(col[i]==col[index]||Math.abs(i-index)==Math.abs(col[i]-col[index])){
                return false;
            }
        }
        return true;
    }
}