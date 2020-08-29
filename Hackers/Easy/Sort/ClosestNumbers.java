package Hackers.Easy.Sort;
import java.io.*;
import java.util.*;

public class ClosestNumbers {
    static int[] closestNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++){
            int temp = Math.abs(arr[i]-arr[i-1]);
            
            if(temp<min){
                min = temp;
                list.clear();
                list.add(arr[i-1]);
                list.add(arr[i]);
            }
            else if(temp==min){
                list.add(arr[i-1]);
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
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

        int[] result = closestNumbers(arr);

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