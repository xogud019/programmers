package CodingTest.LeetCode.BinarySearch.Easy;
/*
Given a non-negative integer x, compute and return the square root of x.
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 
Constraints:
1.0 <= x <= 231 - 1
*/
public class SqrtX {
    /*functions
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
    */
    public int mySqrt(int x) {
        if(x==0) return 0;
        
        int low = 1, high = x;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(mid <= x/mid && mid+1 >x/(mid+1)) return mid;
            
            if(mid > x/mid) high = mid-1;
            else low = mid+1;
        }
        
        return low;
    }
}
