package Note;

public class QuardTree {
    static int base = 0;
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        
        divide(0,0,arr.length,arr,answer);
        
        return answer;
    }
    
    public boolean isSame(int row, int col, int n, int[][] arr){
        int num = arr[row][col];
        
        for(int i=row; i<row+n; i++){
            for(int j=col; j<col+n; j++){
                if(num !=arr[i][j]) return false;
            }
        }
        
        base = num;
        return true;
    }
    
    public void divide(int row, int col, int n, int[][] arr, int[] answer){
        if (isSame(row, col, n, arr)) {
            answer[base]++;
        } else {
            int s = n / 2;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    divide(row + s * i, col + s * j, s, arr, answer);
                }
            }
        }
    }
    /*
    static int base = 0;
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        
        divide(0,0,arr.length, arr, answer);
        
        return answer;
    }
    
    public void divide(int row, int col, int n, int[][] arr, int[] answer){
        if(isSame(row, col, n, arr)){
            answer[base]++;
        }
        else{
            int size = n/2;
            
            for(int i= 0 ; i<2; i++){
                for(int j=0; j<2; j++){
                    divide(row+i*size,col+j*size, size, arr, answer);
                }
            }
        }
    }
    
    public boolean isSame(int row, int col, int n, int[][] arr){
        int num = arr[row][col];
        
        for(int i=row; i<n+row; i++){
            for(int j=col; j<n+col; j++){
                if(num!=arr[i][j]) return false;
            }
        }
        
        base = num;
        return true;
    }
    */
}
