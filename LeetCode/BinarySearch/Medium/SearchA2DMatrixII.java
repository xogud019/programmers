package LeetCode.BinarySearch.Medium;

public class SearchA2DMatrixII {
    /*brute force 12ms
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == target) return true;
            }
        }
        
        return false;
    }
    */
    /*better brute force 7ms
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        
        for(int i=0; i<row; i++){
            if(matrix[i][0] > target || matrix[i][col-1] < target) continue;
            for(int j=0; j<col; j++){                
                if(matrix[i][j] == target) return true;
            }
        }
        
        return false;
    }
    */
    /*using fuction
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] arr: matrix) {
            if (Arrays.binarySearch(arr, target) >= 0)
                return true;
        }
        return false;
    }
    */

    //using binarysearch
    public boolean searchMatrix(int[][] matrix, int target) {        
        for(int[] arr : matrix){
            int i = 0, j = arr.length-1;
            
            while(i<=j){
                int mid = i+(j-i)/2;
                
                if(arr[mid] == target) return true;
                
                if(arr[mid] > target) j = mid-1;
                else i = mid+1;
            }
            
        }
        return false;
    }
}
