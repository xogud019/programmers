package CodingTest.LeetCode.Easy;
import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for(int i:nums){
            if(!map.containsKey(i)) map.put(i,1);
            else map.put(i,map.get(i)+1);
        }
        
        for(int i:map.keySet()){
            if(map.get(i)==1){
                answer = i;
                break;
            }
        }
        
        return answer;

        /*
        int answer = 0;
        
        for(int i:nums){
            answer ^=i;
        }
        
        return answer;
        */
    }
}
