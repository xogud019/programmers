package Hackers.Medium;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TheBoombermanGame {
    static String[] bomberMan(int n, String[] grid) {
        int count = 0;
        String[][] arr= new String[grid.length][grid[0].length()];
        String[] answer= new String[grid.length];
        for(int i=0; i<grid.length; i++){
            answer[i] = "";
            for(int j=0; j<grid[i].length(); j++){
                arr[i][j] = ""+grid[i].charAt(j);
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        /*
        while(count < n){
            if(count%3==0){
                for(int i=0; i<arr.length; i++){
                    for(int j=0; j<arr[i].length; j++){
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
            }
            }
            else if(count%3==1){
                fill(arr);
            }
            else if(count%3==2){

            }
            count++;
        }
        */
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                answer[i] += arr[i][j];
            }
        }
        return answer;
    }

    static void fill(String[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j].equals(".")){
                    arr[i][j] = "O";
                }
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