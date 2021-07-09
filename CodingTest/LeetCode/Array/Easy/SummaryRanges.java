package CodingTest.LeetCode.Array.Easy;

import java.util.ArrayList;
import java.util.List;

/*
You are given a sorted unique integer array nums.
Return the smallest sorted list of ranges that cover all the numbers in the array exactly. 
That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
Each range [a,b] in the list should be output as:

1. "a->b" if a != b
2. "a" if a == b
 

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
Example 3:

Input: nums = []
Output: []
Example 4:

Input: nums = [-1]
Output: ["-1"]
Example 5:

Input: nums = [0]
Output: ["0"]
 

Constraints:

1.0 <= nums.length <= 20
2.-231 <= nums[i] <= 231 - 1
3.All the values of nums are unique.
4.nums is sorted in ascending order.
*/

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        
        if(nums.length==0) return list;
        if(nums.length==1){
            list.add(""+nums[0]);
            return list;
        }
        
        int start = nums[0];
        int temp = nums[0];
        
        for(int i=1; i<nums.length; i++){
            if(nums[i]-temp == 1){
                temp = nums[i];
            }
            else{
                if(temp==start)
                    list.add(""+temp);
                else
                    list.add(start+"->"+temp);
                
                start = nums[i];
                temp = nums[i];
            }
        }
        
        if(temp==start)
            list.add(""+temp);
        else
            list.add(start+"->"+temp);
        
        return list;
    }
}
