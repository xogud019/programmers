package CodingTest.LeetCode.BitManifulation.Medium;

import java.util.ArrayList;
import java.util.List;

/*
An n-bit gray code sequence is a sequence of 2n integers where:

Every integer is in the inclusive range [0, 2n - 1],
The first integer is 0,
An integer appears no more than once in the sequence,
The binary representation of every pair of adjacent integers differs by exactly one bit, and
The binary representation of the first and last integers differs by exactly one bit.
Given an integer n, return any valid n-bit gray code sequence.

 

Example 1:

Input: n = 2
Output: [0,1,3,2]
Explanation:
The binary representation of [0,1,3,2] is [00,01,11,10].
- 00 and 01 differ by one bit
- 01 and 11 differ by one bit
- 11 and 10 differ by one bit
- 10 and 00 differ by one bit
[0,2,3,1] is also a valid gray code sequence, whose binary representation is [00,10,11,01].
- 00 and 10 differ by one bit
- 10 and 11 differ by one bit
- 11 and 01 differ by one bit
- 01 and 00 differ by one bit
Example 2:

Input: n = 1
Output: [0,1]
 

Constraints:

1 <= n <= 16
*/
public class GrayCode {
    //brute force 94ms
    public List<Integer> grayCode(int n) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<Math.pow(2,n); i++){
            String s = Integer.toBinaryString(i);
            StringBuilder sb = new StringBuilder();
            
            sb.append(""+s.charAt(0));
            
            for(int j=1; j<s.length(); j++){
                int n1 = s.charAt(j-1) - '0', n2 = s.charAt(j) - '0';
                
                sb.append(""+(n1^n2));
            }
            
            answer.add(Integer.parseInt(sb.toString(), 2));
        }
        
        return answer;
    }
    /* 3ms
    public List<Integer> grayCode(int n) {
        int len = (int)Math.pow(2, n);
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<len; i++) answer.add(i^(i>>1));
        
        return answer;
    }
    */

    /*single loop
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        // there are 2 ^ n numbers in the Gray code sequence.
        int sequenceLength = 1 << n;
        for (int i = 0; i < sequenceLength; i++) {
            int num = i ^ i >> 1;
            result.add(num);
        }
        return result;
    }
    */
}
