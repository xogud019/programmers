package LeetCode.Array.Easy;

import java.util.ArrayList;
import java.util.Collections;
/*
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
*/
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(!list.contains(i)) list.add(i);
        }
        
        Collections.sort(list,Collections.reverseOrder());
        
        if(list.size()<3) return list.get(0);
        
        return list.get(2);
    }
}
