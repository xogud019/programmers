package Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class Anagram {
    static int anagram(String s) {
        int len = s.length();
        
        if(len%2==1) return -1;
        
        int answer = 0;
        String left = s.substring(0,len/2);
        String right = s.substring(len/2,len);
        boolean[] visited = new boolean[len/2];

        for(int i=0; i<left.length(); i++){
            for(int j=0; j<right.length(); j++){
                if(left.charAt(i)==right.charAt(j)&&!visited[j]){
                    visited[j] = true;
                    break;
                }
            }
        }

        for(int i=0; i<visited.length; i++){
            if(!visited[i]) answer++;
        }

        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}