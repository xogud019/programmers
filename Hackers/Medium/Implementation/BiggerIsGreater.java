package Hackers.Medium;
import java.io.*;
import java.util.*;

public class BiggerIsGreater {
    static String biggerIsGreater(String w) {
        int[] arr = new int[w.length()];
        int min = Integer.MAX_VALUE;
        int idx = -1;
        int cIdx = -1;
        String answer ="";

        for(int i=0; i<arr.length; i++){
            arr[i] = (int)w.charAt(i);
        }
 
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]<arr[i]){
                idx = i-1;
            }
        }

        if(idx<0){
            return "no answer";
        }
        for(int i=idx+1; i<arr.length; i++){
            if(arr[i]>arr[idx]&&arr[i]<min){
                min = arr[i];
                cIdx = i;
            }
        }
        
        swap(arr,idx,cIdx);
        Arrays.sort(arr, idx+1, arr.length);

        for(int i:arr){
            answer+=(char)i;
        }
        return answer;
    }

    static void swap(int[] arr, int idx, int cIdx){
        int temp = arr[idx];
        arr[idx] = arr[cIdx];
        arr[cIdx] = temp;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}