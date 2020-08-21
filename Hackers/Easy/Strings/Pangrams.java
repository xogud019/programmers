package Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class Pangrams {
    static String pangrams(String s) {
        Map<Character, Integer> map = new HashMap<>();
        s = s.toLowerCase();

        for(int i=0; i<26; i++){
            map.put((char)('a'+i),0);
        }

        for(int i=0; i<s.length(); i++){
            char k = s.charAt(i);

            map.put(k,1);
        }

        for(char c:map.keySet()){
            if(map.get(c)<1){
                return "not pangram";
            }
        }
        return "pangram";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}