package Hackers.Easy.Implementation;
import java.io.*;
import java.util.*;

public class MinimumDistance {
    static int minimumDistances(int[] a) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<a.length-1; i++){
            for(int j= i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    min = Math.min(min,Math.abs(i-j));
                }
            }
        }
        
        return (min==Integer.MAX_VALUE)?-1:min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}