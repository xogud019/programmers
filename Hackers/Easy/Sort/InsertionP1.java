package Hackers.Easy.Sort;
import java.util.*;

public class InsertionP1 {
    static void insertionSort1(int n, int[] arr) {
        /*first
        int start = arr[arr.length-1];

        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>start){
                arr[i+1]=arr[i];
                print(arr);
            }
            else{
                arr[i+1] = start;
                print(arr);
                return;
            }
        }

        arr[0] = start;
        print(arr);
        */

        /*second
        int start = arr[arr.length-1];

        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>start){
                arr[i+1]=arr[i];
                print(arr);
            }
            else{
                arr[i+1] = start;
                print(arr);
                break;
            }

            if(i==0){
                arr[i]= start;
                print(arr);
            }
        }
        */

        //third
        int start = arr[arr.length-1];
        int idx = arr.length-2;

        while(idx>=0&&start<arr[idx]){
            arr[idx+1] = arr[idx];
            idx--;
            print(arr);
        }
        arr[idx+1] = start;
        print(arr);
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

        insertionSort1(n, arr);

        scanner.close();
    }
}