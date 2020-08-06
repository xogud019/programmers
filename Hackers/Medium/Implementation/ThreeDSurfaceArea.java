package Hackers.Medium.Implementation;
import java.io.*;
import java.util.*;

public class ThreeDSurfaceArea {
    static int surfaceArea(int[][] A) {
        int top = 0, bot = 0, back = 0, front = 0, left = 0, right =0;
        int row = A.length; 
        int col = A[0].length;
        int[] rowSub = new int[row];
        int[] colSub = new int[col];
        int rowSum = 0;
        int colSum = 0;

        top = row*col;
        bot = row*col;

        for(int i=0; i<row; i++){
            front += A[i][0];
            back += A[i][col-1];
        }

        for(int i=0; i<col; i++){
            left += A[0][i];
            right += A[row-1][i];
        }

        if(left==right&&left==bot){
            return bot*6;
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col-1; j++){
                rowSub[i] += Math.abs(A[i][j]-A[i][j+1]);
            }
        }

        for(int i=0; i<col; i++){
            for(int j=0; j<row-1; j++){
                colSub[i] += Math.abs(A[j][i]-A[j+1][i]);
            }
        }

        for(int i:rowSub){
            rowSum+=i;
        }
        for(int i:colSub){
            colSum+=i;
        }

        return top+bot+left+right+rowSum+colSum+back+front;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] HW = scanner.nextLine().split(" ");

        int H = Integer.parseInt(HW[0]);

        int W = Integer.parseInt(HW[1]);

        int[][] A = new int[H][W];

        for (int i = 0; i < H; i++) {
            String[] ARowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < W; j++) {
                int AItem = Integer.parseInt(ARowItems[j]);
                A[i][j] = AItem;
            }
        }

        int result = surfaceArea(A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}