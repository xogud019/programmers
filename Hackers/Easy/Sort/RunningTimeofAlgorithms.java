package Hackers.Easy.Sort;
import java.io.*;
import java.util.*;

public class RunningTimeofAlgorithms {
    static int runningTime(int[] arr) {
        int answer = 0;
        for(int i=1; i<arr.length; i++){
            int std = arr[i];
            int idx = i-1;

            while(idx>=0&&std<arr[idx]){
                arr[idx+1] = arr[idx];
                idx--;
                answer++;
            }
            arr[idx+1] = std;
        }

        return answer;
    }

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

        int result = runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}