package LeetCode.Math.Easy;

public class RangeAdditionII {
    /*time out & memory out
    public int maxCount(int m, int n, int[][] ops) {
        int[][] board = new int[m][n];
        int answer = 0, max = 0;
        
        for(int i=0; i<ops.length; i++){
            for(int r=0; r<ops[i][0]; r++){
                for(int c=0; c<ops[i][1]; c++){
                    board[r][c]++;
                }
            }
        }
        
        for(int[] i:board){
            for(int j:i) max = Math.max(j,max);
        }
        
        for(int[] i:board){
            for(int j:i){
                if(j == max) answer++;
            }
        }
        
        return answer;
    }
    */
    public int maxCount(int m, int n, int[][] ops) {
        int r = Integer.MAX_VALUE, c = Integer.MAX_VALUE;
        
        for(int i=0; i<ops.length; i++){
            r = Math.min(r,ops[i][0]);
            c = Math.min(c,ops[i][1]);
        }
        
        if(r==Integer.MAX_VALUE && c==Integer.MAX_VALUE) return m*n;
        return r*c;
    }
}
