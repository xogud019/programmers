package LeetCode.DP.Easy;

public class RangeSumQuery {
    class NumArray {
        int[] nums;
        
        public NumArray(int[] nums) {
            this.nums = nums;    
        }
        
        public int sumRange(int i, int j) {
            int answer = 0;
            
            for(int start = i; start <= j; start++){
                answer +=this.nums[start];    
            }
            
            return answer;
        }
    }
}
