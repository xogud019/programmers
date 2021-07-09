package CodingTest.Hackers.Medium.Implementation;
import java.io.*;
import java.util.*;

public class TheBoombermanGame {
    static String[] bomberMan(int n, String[] grid) {
        String[][] arr= new String[grid.length][grid[0].length()];
        String[] answer= new String[grid.length];
        
        for(int i=0; i<grid.length; i++){
            answer[i] = "";
            for(int j=0; j<grid[i].length(); j++){
                arr[i][j] = ""+grid[i].charAt(j);
            }
        }

        if(n==1){
            makeAnswer(arr, answer);
            return answer;
        }

        if(n%2==0){
            fill(arr);
            makeAnswer(arr, answer);
            return answer;
        }        

        if(n%4==1){
            bomb(arr);
            bomb(arr);
            makeAnswer(arr, answer);
            return answer;
        }

        if(n%4==3){
            bomb(arr);
            makeAnswer(arr, answer);
            return answer;
        }
        
        return answer;
    }

    static void fill(String[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = "O";
            }
        }
    }

    static void bomb(String[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j].equals("O")){
                    arr[i][j] = "X";
                    if(i>0&&!arr[i-1][j].equals("O")){
                        arr[i-1][j] = "X";
                    }
                    if(i<arr.length-1&&!arr[i+1][j].equals("O")){
                        arr[i+1][j] = "X";
                    }
                    if(j>0&&!arr[i][j-1].equals("O")){
                        arr[i][j-1] = "X";
                    }
                    if(j<arr[i].length-1&&!arr[i][j+1].equals("O")){
                        arr[i][j+1] = "X";
                    }
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j].equals("X")){
                    arr[i][j] = ".";
                }
                else if(arr[i][j].equals(".")){
                    arr[i][j] = "O";
                }
            }
        }
    }

    static void makeAnswer(String[][] arr, String[] answer){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                answer[i] += arr[i][j];
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] rcn = scanner.nextLine().split(" ");

        int r = Integer.parseInt(rcn[0]);

        int c = Integer.parseInt(rcn[1]);

        int n = Integer.parseInt(rcn[2]);

        String[] grid = new String[r];

        for (int i = 0; i < r; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = bomberMan(n, grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}