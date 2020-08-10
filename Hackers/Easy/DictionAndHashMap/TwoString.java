package Hackers.Easy.DictionAndHashMap;
import java.io.*;
import java.util.*;

public class TwoString {
    static String twoStrings(String s1, String s2) {
        Set<String> set = new HashSet<>();
        String[] ss1 = s1.split("");

        for(String s:ss1){
            set.add(s);
        }

        for(String s:set){
            if(s2.contains(s)){
                return "YES";
            }
        }

        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}