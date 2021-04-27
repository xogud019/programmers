package LeetCode.BitManifulation.Easy;
/*
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

 

Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true
 

Constraints:

-231 <= n <= 231 - 1
 

Follow up: Could you solve it without loops/recursion?
*/
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n<1) return false;
        
        while(n>1){
            if(n%4 != 0) return false;
            
            n/=4;
        }
        
        return true;
    }   

    /*math
    public boolean isPowerOfFour(int n) {
        return (Math.log10(n)/Math.log10(4)%1 ==0);
    }
    */

    /*bit
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if((n&(n-1))!=0) return false;
        
        return (n-1)%3==0;
    }
    */
}
