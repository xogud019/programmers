package CodingTest.LeetCode.Array.Medium;
/*
Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000.
Example
Example 1:
	Input:  nums = [1,0,1,1,0]
	Output:  4
	
	Explanation:
	Flip the first zero will get the the maximum number of consecutive 1s.
	After flipping, the maximum number of consecutive 1s is 4.

Example 2:
	Input: nums = [1,0,1,0,1]
	Output:  3
	
	Explanation:
	Flip each zero will get the the maximum number of consecutive 1s.
	After flipping, the maximum number of consecutive 1s is 3.
	
*/
public class MaxConsecutiveOnesII {
    //sliding window
    public int findMaxConsecutiveOnes(int[] nums) {
        // write your code here
        int answer = 0, count = 0, len = nums.length;

        for(int i=0; i<len; i++){
            if(nums[i] == 1){
                count = 1;
                int zero = 0, j = i+1;

                while(j<len && zero < 2){
                    if(nums[j] == 0) zero++;
                    if(zero == 2) break;

                    count++;
                    j++;
                }

                answer = Math.max(count, answer);
            }
        }

        answer = Math.max(count, answer);

        return answer;
    }

}
