package LeetCode.Array.Easy;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int answer = 0;
        
        for(int i:nums){
            if((int)(Math.log10(i)+1)%2==0) answer++;
        }
        
        return answer;
    }
}
