package CodingTest.LeetCode.Contest;

import java.util.*;

public class MeanOfArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double answer = 0;
        int len = arr.length;
        int per = (int)(len*0.05);
        
        len -= 2*per;
        
        for(int i=0; i<per; i++){
            arr[i] = 0;
        }
        
        for(int i=arr.length-1; i>=arr.length-per; i--){
            arr[i] = 0;
        }
        
        for(int i:arr){
            answer += i;
        }
        return answer/len;
    }
}
