package LeetCode.Design.Medium;

public class SubrectangleQueries {
    int[][] arr;
    
    public SubrectangleQueries(int[][] rectangle) {
        int r = rectangle.length, c = rectangle[0].length;
        arr = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++) arr[i][j] = rectangle[i][j];
        }
        
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i=row1; i<=row2; i++){
            for(int j=col1; j<=col2; j++) arr[i][j] = newValue; 
        }
    }
    
    public int getValue(int row, int col) {
        return arr[row][col];
    }
}
