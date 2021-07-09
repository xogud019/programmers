package CodingTest.LeetCode.Array.Easy;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(i==j) continue;
                
                if(nums[i]>nums[j]) count++;
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
}
