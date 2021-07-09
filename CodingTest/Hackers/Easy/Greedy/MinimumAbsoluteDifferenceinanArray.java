package CodingTest.Hackers.Easy.Greedy;
import java.io.*;
import java.util.*;

public class MinimumAbsoluteDifferenceinanArray {
    static int minimumAbsoluteDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, Math.abs(arr[i-1]-arr[i]));
        }

        return min;
    }
    /*failed case -> time out
    static int minimumAbsoluteDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                min = Math.min(min, Math.abs(arr[i]-arr[j]));
            }
        }

        return min;
    }
    */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}