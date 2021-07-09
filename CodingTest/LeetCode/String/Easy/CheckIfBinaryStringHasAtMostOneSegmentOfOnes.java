package CodingTest.LeetCode.String.Easy;
/*
Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.

 

Example 1:

Input: s = "1001"
Output: false
Explanation: The ones do not form a contiguous segment.
Example 2:

Input: s = "110"
Output: true
 

Constraints:

1 <= s.length <= 100
s[i]​​​​ is either '0' or '1'.
s[0] is '1'.
*/
public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public boolean checkOnesSegment(String s) {
        if(s.length()==1) return true;
        boolean isO = true;    
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == '0') isO = false;
            else{
                if(!isO) return false;
            }
        }
        
        return true;
    }
}
