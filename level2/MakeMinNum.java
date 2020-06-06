package level2;
import java.util.*;

public class MakeMinNum {
    public static void main(String[] args){
        int[] A = {1,4,2};
        int[] B = {5,4,4};
        System.out.println(soluion(A, B));
    }

    public static int soluion(int[] A, int[] B){
        int answer =0;
        Integer[] arr = new Integer[B.length];
        for(int i=0; i<B.length; i++){
            arr[i] = B[i];
        }
        Arrays.sort(A);
        Arrays.sort(arr,Collections.reverseOrder());
        
        /*
        for(int i=0; i<A.length; i++){
            System.out.println(A[i]+","+arr[i]);
        }
        */

        for(int i=0; i<A.length; i++){
            answer+= A[i]*arr[i];
        }
        return answer;
    }
}