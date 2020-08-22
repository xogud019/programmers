package Hackers.Easy.Sort;
import java.io.*;
import java.util.*;

public class QuickSortP1 {
    static int[] quickSort(int[] arr) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int[] answer = new int[arr.length];
        int pivot = arr[0];

        for(int i=0; i<arr.length; ++i){
            if(arr[i]==pivot) continue;

            if(arr[i]<pivot){
                left.add(arr[i]);
            }
            else if(arr[i]>pivot){
                right.add(arr[i]);
            }
        }

        merge(left, right, answer, pivot);

        return answer;
    }

    static void merge(List<Integer> left, List<Integer> right, int[] answer, int pivot){
        for(int i=0; i<left.size(); i++){
            answer[i] = left.get(i);
        }

        answer[left.size()]= pivot;

        for(int i=0; i<right.size(); i++){
            answer[left.size()+i+1]= right.get(i);
        }
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

        int[] result = quickSort(arr);

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