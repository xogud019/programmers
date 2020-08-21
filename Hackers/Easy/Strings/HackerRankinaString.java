package Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class HackerRankinaString {
    static String hackerrankInString(String s) {
        String ss = "hackerrank";
        char[] arr = ss.toCharArray();
        int idx = 0;
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(idx==arr.length){
                break;
            }

            if(arr[idx]==s.charAt(i)){
                idx++;
                count++;
            }
        }

        return count==arr.length?"YES":"NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}