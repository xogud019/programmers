package CodingTest.LeetCode.Array.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        int[] answer = new int[len];
        int[] temp = new int[len];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<len; i++) temp[i] = arr[i];
        
        Arrays.sort(temp);
        
        for(int i:temp){
            if(!map.containsKey(i)) map.put(i, map.size()+1);
        }
        
       
        for(int i=0; i<len; i++) answer[i] = map.get(arr[i]);
        
        
        return answer;
    }
}
