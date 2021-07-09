package CodingTest.LeetCode.Math.Easy;

public class MinimumMovesToEqualArrayElements {
    /*time out
    public int minMoves(int[] nums) {
        int answer = 0;
        if(nums.length==2) return Math.abs(nums[1]-nums[0]);
        
        while(true){
            Arrays.sort(nums);
            
            if(nums[0] == nums[nums.length-1]) return answer;
            
            for(int i=0; i<nums.length-1; i++){
                nums[i]++;
            }
            
            answer++;
        }
    }
    */
    public int minMoves(int[] nums) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i:nums) min = Math.min(min,i);
        
        for(int i:nums) answer += i-min;
        
        return answer;
    }
}
