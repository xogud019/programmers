package Hackers.Easy.Search;
import java.io.*;
import java.util.*;

public class MissingNumbers {
    static int[] missingNumbers(int[] arr, int[] brr) {
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else map.put(i,map.get(i)+1);
        }

        for(int i:brr){
            if(!map.containsKey(i)){
                map.put(i,-1);
            }
            else map.put(i,map.get(i)-1);
        }

        for(int i:map.keySet()){
            if(map.get(i)<0){
                list.add(i);
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

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

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