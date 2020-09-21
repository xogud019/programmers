package BJ.DivAndCon;
import java.util.*;

public class PaperNum {
    static int[] paper = {0,0,0};

    public static void main(String[] args){
        int n = 9;
        int[][] arr = {
            {0, 0, 0, 1, 1, 1, -1, -1, -1},
            {0, 0, 0, 1, 1, 1, -1, -1, -1},
            {0, 0, 0, 1, 1, 1, -1, -1, -1},
            {1, 1, 1, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, -1, 0, 1, -1, 0, 1, -1},
            {0, -1, 1, 0, 1, -1, 0, 1, -1},
            {0, 1, -1, 1, 0, -1, 0, 1, -1}};


        dfs(0,0,n, arr);

        for(int i:paper) System.out.println(i);
    }
    /*
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        scan.close();
        dfs(0,0,n, arr);

        for(int i:paper) System.out.print(i);
    }
    */
    public static void dfs(int x, int y, int n, int[][] arr){
        if(isSame(x, y, n, arr)){
            paper[arr[x][y]+1]++;
            return;
        }

        n /= 3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                dfs(x+i*n, y+j*n, n, arr);
            }
        }
    }
    

    public static boolean isSame(int x, int y, int n, int[][] arr){
        for(int i=x; i<x+n; i++){
            for(int j=y; j<y+n; j++){
                if(arr[x][y]!=arr[i][j]) return false;
            }
        }

        return true;
    }
}
