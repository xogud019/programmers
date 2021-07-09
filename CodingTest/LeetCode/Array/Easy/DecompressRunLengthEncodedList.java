package CodingTest.LeetCode.Array.Easy;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        
        for(int i=0; i<nums.length; i+=2){
            len += nums[i];
        }
        
        int[] answer = new int[len];
        int idx = 0;
        
        for(int i=0; i<nums.length; i+=2){
            for(int j=0; j<nums[i]; j++){
                answer[idx++] = nums[i+1];
            }
        }
        
        return answer;
    }
}
