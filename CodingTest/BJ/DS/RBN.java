package CodingTest.BJ.DS;

import java.util.*;
import java.io.*;

public class RBN {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
        }
        System.out.print(-1);
    }
}
