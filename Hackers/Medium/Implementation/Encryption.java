package Hackers.Medium.Implementation;
import java.io.*;
import java.util.*;

public class Encryption {
    static String encryption(String s) {
        s = s.replaceAll(" ","");
        double sqrtLen = Math.sqrt(s.length());
        int row = (int)sqrtLen;
        int col = row+1;
        String answer = "";

        if(row*col<s.length()){
            row++;
        }
        if(row*row==s.length()){
            col--;
        }
        int index = 0;
        char[][] arr = new char[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(index==s.length()){
                    arr[i][j] = '_';
                }
                else{
                    arr[i][j] = s.charAt(index);
                    index++;
                }
            }

        }

        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                if(arr[i][j]!='_') answer+=arr[i][j];
            }
            answer+=" ";
        }
        //isieae fdtonf fotrga anoyec cttctt tfhhhs
        return answer.trim();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}