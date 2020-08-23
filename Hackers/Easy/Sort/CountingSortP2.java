package Hackers.Easy.Sort;
import java.io.*;
import java.util.*;

public class CountingSortP2 {
    static int[] countingSort(int[] arr) {
        int[] count = new int[100];
        int[] answer = new int[arr.length];
        int idx = 0;

        count = makeCount(arr);

        for(int i=0; i<count.length; i++){
            if(count[i]==0) continue;

            while(count[i]>0){
                answer[idx++] = i;
                count[i]--;
            }
        }
        return answer;
    }

    static int[] makeCount(int[] arr){
        int[] temp = new int[100];

        for(int i:arr){
            temp[i]++;
        }

        return temp;
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

        int[] result = countingSort(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}