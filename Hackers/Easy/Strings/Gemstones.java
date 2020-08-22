package Hackers.Easy.Strings;
import java.io.*;
import java.util.*;

public class Gemstones {
    static int gemstones(String[] arr) {
        int answer= 0;

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<26; i++){
            map.put((Character.toString((char)((int)'a'+i))),0);
        }

        for(int i=0; i<arr.length; i++){
            for(String k:map.keySet()){
                if(arr[i].contains(k)){
                    map.put(k,map.get(k)+1);
                }
            }
        }

        for(String k:map.keySet()){
            if(map.get(k)==arr.length) answer++;
        }
        
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}