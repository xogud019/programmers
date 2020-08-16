package Hackers.Medium.Search;
import java.io.*;
import java.util.*;

public class Pairs {
    static int pairs(int k, int[] arr) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        for(int i:arr){
            set.add(i);
        }

        for(int i:arr){
            if(set.contains(i+k)) answer++;
        }
        return answer;
    }
    /*failed case2 -> time out
    static int pairs(int k, int[] arr) {
        int answer = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i:arr){
            list1.add(i+k);
            list2.add(i);
        }

        for(int i:list1){
            if(list2.contains(i)) answer++;
        }
        
        return answer;
    }
    */
    /*failed case1 -> time out
    static int pairs(int k, int[] arr) {
        int answer = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(Math.abs(arr[i]-arr[j])==k) answer++;
            }
        }

        return answer;
    }
    */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}