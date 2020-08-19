package Hackers.Easy.Sort;
import java.util.*;

public class InsertionP2 {
    static void insertionSort2(int n, int[] arr) {

        for(int i=1; i<arr.length; i++){
            int std = arr[i];
            int idx = i-1; 

            while(idx>=0&&std<arr[idx]){
                arr[idx+1]= arr[idx];
                idx--;
                
            }
            arr[idx+1] = std;
            print(arr);
        }
    }

    static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}