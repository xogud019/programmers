package LeetCode.Array.Medium;
//not yet
public class SortTheMatrixDiagonally {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] arr = new int[m][n];
        int k = 0;
        for(int d=0; d<m+n-1; d++){
            for(int i=0; i<m; i++){
                int j = d-i;
                System.out.print(i+","+j+" ");
                if(j>=0 && j<n){
                    //System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
        
        return arr;
    }
}
