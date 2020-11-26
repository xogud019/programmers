package LeetCode.Array.Easy;

public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] answer = new int[2];
            boolean isT = false;
            for(int i=0; i<nums.length-1; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i]+nums[j]==target){
                        answer[0] = i;
                        answer[1] = j;
                        isT = true;
                        break;
                    }        
                }
                if(isT){
                    break;
                }
            }
            
            return answer;
        }
    }
    /*
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    */

    /*
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
     */
}