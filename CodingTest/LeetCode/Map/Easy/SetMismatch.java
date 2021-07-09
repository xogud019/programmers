package CodingTest.LeetCode.Map.Easy;
/*
The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.

Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Note:
1.The given array size will in the range [2, 10000].
2.The given array's numbers won't have any order.
*/
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length+1];
        int[] answer = new int[2];
        //Arrays.fill(arr,0);
        
        for(int i:nums){
            if(arr[i] != 0) answer[0] = i;
            else arr[i] = i;
        }
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] == 0){
                answer[1] = i;
                break;
            }
        }
        
        return answer;
    }
    /*
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        int[] arr = new int[nums.length+1];
        
        for(int i:nums) arr[i]++;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] == 0) answer[1] = i;
            
            if(arr[i] == 2) answer[0] = i;
        }
        return answer;
    }
    */
}
