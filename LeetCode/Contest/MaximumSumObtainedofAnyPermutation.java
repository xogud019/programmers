package LeetCode.Contest;
import java.util.*;
//not
public class MaximumSumObtainedofAnyPermutation {
    static int module = 1000000007;
    
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        Arrays.sort(nums);
        int[] num = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        int answer= 0;
        
        for(int i=0; i<requests.length; i++){
            for(int j=requests[i][0]; j<=requests[i][1]; j++){
                if(!map.containsKey(j)) map.put(j, 1);
                else map.put(j, map.get(j)+1);
            }
        }
        for(int i=0; i<nums.length; i++){
            num[i] = nums[nums.length-1-i];
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list,Collections.reverseOrder());
        
        for(int i=0; i<list.size(); i++){
            long temp = (long)list.get(i)*num[i];
            temp%=module;
            
            answer += temp;
                
        }
        return answer;
    }
    /*
    121821803
Expected:
596658136
    */
}
