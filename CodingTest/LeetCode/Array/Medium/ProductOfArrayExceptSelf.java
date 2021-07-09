package CodingTest.LeetCode.Array.Medium;
/*
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
*/
public class ProductOfArrayExceptSelf {
    /*brute force
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        
        for(int i=0; i<len; i++){
            int sum = 1;
            
            for(int j=0; j<len; j++){
                if(j==i) continue;
                sum*=nums[j];
            }
            
            answer[i] = sum;
        }
        
        return answer;
    }
    */
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        int num = 1;
        answer[0] = 1;
        
        for(int i=1; i<len; i++) answer[i] = answer[i-1] * nums[i-1];
        
        for(int i=len-1; i>=0; i--){
            answer[i] *= num;
            num *= nums[i];
        }
        
        //for(int i:answer) System.out.print(i+" ");
        
        return answer;
    }
}
