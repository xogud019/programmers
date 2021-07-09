package CodingTest.Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class PalindromeIndex {
    static int palindromeIndex(String s) {
        int answer = -1;
        int start = 0;
        int end = s.length()-1;

        if(palin(s)) return answer;

        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
                continue;
            }

            if (palin(s.substring(0, start) + s.substring(start + 1))) {
                return start;
            } 
            else if (palin(s.substring(0, end) + s.substring(end + 1))) {
                return end;
            }
        }
        return answer;
    }

    static boolean palin(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}