package LeetCode.BinarySearch.Medium;

import java.util.Arrays;

/*
You are given two positive integer arrays nums1 and nums2, both of length n.

The absolute sum difference of arrays nums1 and nums2 is defined as the sum of |nums1[i] - nums2[i]| for each 0 <= i < n (0-indexed).

You can replace at most one element of nums1 with any other element in nums1 to minimize the absolute sum difference.

Return the minimum absolute sum difference after replacing at most one element in the array nums1. Since the answer may be large, return it modulo 109 + 7.

|x| is defined as:

x if x >= 0, or
-x if x < 0.
 

Example 1:

Input: nums1 = [1,7,5], nums2 = [2,3,5]
Output: 3
Explanation: There are two possible optimal solutions:
- Replace the second element with the first: [1,7,5] => [1,1,5], or
- Replace the second element with the third: [1,7,5] => [1,5,5].
Both will yield an absolute sum difference of |1-2| + (|1-3| or |5-3|) + |5-5| = 3.
Example 2:

Input: nums1 = [2,4,6,8,10], nums2 = [2,4,6,8,10]
Output: 0
Explanation: nums1 is equal to nums2 so no replacement is needed. This will result in an 
absolute sum difference of 0.
Example 3:

Input: nums1 = [1,10,4,4,2,7], nums2 = [9,3,5,1,7,4]
Output: 20
Explanation: Replace the first element with the second: [1,10,4,4,2,7] => [10,10,4,4,2,7].
This yields an absolute sum difference of |10-9| + |10-3| + |4-5| + |4-1| + |2-7| + |7-4| = 20
 

Constraints:

n == nums1.length
n == nums2.length
1 <= n <= 105
1 <= nums1[i], nums2[i] <= 105
*/
public class MinimumAbsoluteSumDifference {
    final static int mod = 1000000007;
    
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        if(Arrays.equals(nums1, nums2)) return 0;
        int len = nums1.length;
        long sum = 0;
        
        for(int i=0; i<len; i++) sum += Math.abs(nums1[i]-nums2[i]);
            
        int[] sortArr = nums1.clone();
        Arrays.sort(sortArr);
        
        int max = 0;
        
        for(int i=0; i<len; i++){
            if(nums1[i] == nums2[i]) continue;
            
            int diff = Math.abs(nums1[i] - nums2[i]);
            int idx = Arrays.binarySearch(sortArr, nums2[i]);
            
            if(idx >= 0) max = Math.max(max, diff);
            else{
                int newIdx = (idx+1)*(-1);
                
                if(newIdx > 0) max = Math.max(max, diff - Math.abs(sortArr[newIdx-1]-nums2[i]));
                if(newIdx < len) max = Math.max(max, diff - Math.abs(sortArr[newIdx]-nums2[i]));
            }
        }
        //System.out.println(sum+" "+max);
        
        return (int)((sum-max)%mod);
    }
    /*failed case
    final static int mod = 1000000007;
    
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        if(Arrays.equals(nums1, nums2)) return 0;
        int len = nums1.length;
        long sum = 0;
        long min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int lIdx = 0 , hIdx = 0;
        
        for(int i=0; i<len; i++){
            sum += Math.abs(nums1[i]-nums2[i]);
            
            if(nums1[i] < min){
                lIdx = i;
                min = nums1[i];
            }
            
            if(nums1[i] > max){
                hIdx = i;
                max = nums1[i];
            }
        }
        
        min = sum - (Math.abs(nums1[lIdx]-nums2[lIdx]));
        max = sum - (Math.abs(nums1[hIdx]-nums2[hIdx]));
        
        for(int i=0; i<len; i++){
            if(i == lIdx) continue;
            sum = Math.min(sum, (min+ Math.abs(nums1[i]-nums2[lIdx])));
        }
        
        for(int i=0; i<len; i++){
            if(i == hIdx) continue;
            sum = Math.min(sum, (max+ Math.abs(nums1[i]-nums2[hIdx])));
        }
        System.out.println(sum);
        int answer = (int)(sum%mod);
        
        return answer;
    }
    */

    /*time limit
    final static int mod = 1000000007;
    
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        if(Arrays.equals(nums1, nums2)) return 0;
        int len = nums1.length;
        long sum = 0;
        long min = Integer.MAX_VALUE;
        int answer = 0;
        
        for(int i=0; i<len; i++) sum += Math.abs(nums1[i]-nums2[i]);        
        
        for(int i=0; i<len; i++){
            long n = sum - Math.abs(nums1[i]-nums2[i]);
            
            for(int j=0; j<len; j++){
                if(j==i) continue;
        
                min = Math.min(min, n + Math.abs(nums1[j]-nums2[i]));
            }
            
            answer = Math.min((int)(sum%mod), (int)(min%mod));
        }
                
        return answer;
    }
    */
}
