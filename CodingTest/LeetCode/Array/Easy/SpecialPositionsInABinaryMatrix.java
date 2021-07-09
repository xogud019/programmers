package CodingTest.LeetCode.Array.Easy;

public class SpecialPositionsInABinaryMatrix {
    public int numSpecial(int[][] mat) {
        int answer = 0;
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1 && isSpecial(mat, i, j)) answer++;
            }
        }
        
        return answer;
    }
    
    public boolean isSpecial(int[][] mat, int x, int y){
        for(int i=0; i<mat[0].length; i++){
            if(i==y) continue;
            
            if(mat[x][i] == 1) return false;
        }
        
        for(int i=0; i<mat.length; i++){
            if(i==x) continue;
            
            if(mat[i][y] == 1) return false;
        }
        
        return true;
    }
}
