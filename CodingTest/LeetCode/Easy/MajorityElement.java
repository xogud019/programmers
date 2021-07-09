package CodingTest.LeetCode.Easy;
import java.util.*;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int base = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        for(int i:nums){
            if(!map.containsKey(i)) map.put(i,1);
            else map.put(i, map.get(i)+1);    
        }
        
        for(int i:map.keySet()){
            if(map.get(i)>base){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
