package LeetCode.String.Easy;

import java.util.ArrayList;
import java.util.Collections;

/*
Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.

 

Example 1:

Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
Example 2:

Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit. 
 

Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters and/or digits.
*/
public class SecondLargestDigitInAString {
    public int secondHighest(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                if(!list.contains(c-'0')) list.add(c-'0');
            }
        }
        
        if(list.size()<2) return -1;
        
        Collections.sort(list, Collections.reverseOrder());
        
        return list.get(1);
    }
}
