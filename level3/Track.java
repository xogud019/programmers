package level3;

public class Track {
    public static void main(String[] args){
        int[][] board = {{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1},{0,0,1,0,0,0,1,0},{0,1,0,0,0,1,0,0},{1,0,0,0,0,0,0,0}};
        System.out.println(solution(board));
    }

    public static int solution(int[][] board){
        int answer = 0;
        
        
        //print(board);
        return answer;
    }

    public static void dfS(int[][] board, int x, int y, int row, int col){
        if(x==row&&y==col){
            return;
        }
    }

    public static void print(int[][] triangle){
        for(int i=0; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}

//3800