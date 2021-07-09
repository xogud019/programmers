package CodingTest.LeetCode.Array.Easy;

public class CellsWithOddValuesInAMatrix {
    public int oddCells(int n, int m, int[][] indices) {
        int answer = 0;
        int[][] arr = new int[n][m];
        
        for(int i=0; i<indices.length; i++){
            for(int j=0; j<m; j++){
                arr[indices[i][0]][j]++;
            }
            
            for(int j=0; j<n; j++){
                arr[j][indices[i][1]]++;
            }
        }
        
        for(int i[]: arr){
            for(int j:i){
                if(j%2==1) answer++;
            }
        }
        
        return answer;
    }
}
