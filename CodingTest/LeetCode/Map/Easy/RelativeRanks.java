package CodingTest.LeetCode.Map.Easy;

import java.util.Arrays;
import java.util.TreeMap;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        String[] answer = new String[nums.length];
        int[] arr = nums.clone();
        TreeMap<Integer, String> map = new TreeMap<>();
        int idx = 1;

        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0; i--){
            if(idx == 3) map.put(arr[i], "Bronze Medal");
            else if(idx == 2) map.put(arr[i], "Silver Medal");
            else if(idx == 1) map.put(arr[i], "Gold Medal");
            else map.put(arr[i],Integer.toString(idx));
            idx++;
        }
       
        for(int i=0; i<nums.length; i++) answer[i] = map.get(nums[i]);
        
        return answer;
    }
}
