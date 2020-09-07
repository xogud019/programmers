package Hackers.Medium.RecursionAndBacktracking;

import java.io.*;
import java.util.*;

public class DavisStaircase {
    static Map<Integer,Integer> map = new HashMap<>();
    
    // Complete the stepPerms function below.
    static int stepPerms(int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        if(!map.containsKey(n)) map.put(n,stepPerms(n-1)+stepPerms(n-2)+stepPerms(n-3));
        
        return map.get(n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sItr = 0; sItr < s; sItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int res = stepPerms(n);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
