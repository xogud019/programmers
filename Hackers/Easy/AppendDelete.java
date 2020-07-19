package Hackers.Easy;
import java.io.*;
import java.util.*;


public class AppendDelete {
    static String appendAndDelete(String s, String t, int k) {
        int sLen = s.length();
        int tLen = t.length();
        int count = 0;

        if(sLen+tLen<=k){
            return "Yes";
        }

        for(int i=0; i<Math.min(sLen,tLen); i++){
            if(s.charAt(i)==t.charAt(i)){
                count++;
            }
            else break;
        }

        int tot= sLen+tLen-count*2;

        if(tot<=k){
            if((tot-k)%2==0){
                return "Yes";
            }
        }

        return "No";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}