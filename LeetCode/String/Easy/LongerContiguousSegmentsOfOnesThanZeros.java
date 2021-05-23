package LeetCode.String.Easy;
/*
Given a binary string s, return true if the longest contiguous segment of 1s is strictly longer than the longest contiguous segment of 0s in s. Return false otherwise.

For example, in s = "110100010" the longest contiguous segment of 1s has length 2, and the longest contiguous segment of 0s has length 3.
Note that if there are no 0s, then the longest contiguous segment of 0s is considered to have length 0. The same applies if there are no 1s.

 

Example 1:

Input: s = "1101"
Output: true
Explanation:
The longest contiguous segment of 1s has length 2: "1101"
The longest contiguous segment of 0s has length 1: "1101"
The segment of 1s is longer, so return true.
Example 2:

Input: s = "111000"
Output: false
Explanation:
The longest contiguous segment of 1s has length 3: "111000"
The longest contiguous segment of 0s has length 3: "111000"
The segment of 1s is not longer, so return false.
Example 3:

Input: s = "110100010"
Output: false
Explanation:
The longest contiguous segment of 1s has length 2: "110100010"
The longest contiguous segment of 0s has length 3: "110100010"
The segment of 1s is not longer, so return false.
 

Constraints:

1 <= s.length <= 100
s[i] is either '0' or '1'.

*/
public class LongerContiguousSegmentsOfOnesThanZeros {
    public boolean checkZeroOnes(String s) {
        String[] str = s.split("0"), str1 = s.split("1");
        int len1 = 0, len2 = 0;
        
        for(int i=0; i<str.length; i++) len1 = Math.max(len1, str[i].length());
        for(int i=0; i<str1.length; i++) len2 = Math.max(len2, str1[i].length());
        
        return len1 > len2;
    }
}