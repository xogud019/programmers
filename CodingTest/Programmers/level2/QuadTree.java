package CodingTest.Programmers.level2;

public class QuadTree {
    static int base = 0;
    
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        
        divide(arr, 0, 0, arr.length, answer);
        
        return answer;
    }
    
    public void divide(int[][] arr, int row, int col, int n, int[] answer){
        if(check(arr, row, col, n)) answer[base]++;
        else{
            int len = n/2;
            
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    divide(arr,row+i*len, col+j*len, len, answer);
                }
            }
        }
    }
    
    public boolean check(int[][] arr, int row, int col, int n){
        int num = arr[row][col];
        
        for(int i=row; i<row+n; i++){
            for(int j=col; j<col+n; j++){
                if(num != arr[i][j]) return false;
            }
        }
        
        base = num;
        
        return true;
    }
}
