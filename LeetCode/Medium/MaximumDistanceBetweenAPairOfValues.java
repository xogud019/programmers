package LeetCode.Medium;
/*
You are given two non-increasing 0-indexed integer arrays nums1​​​​​​ and nums2​​​​​​.

A pair of indices (i, j), where 0 <= i < nums1.length and 0 <= j < nums2.length, is valid if both i <= j and nums1[i] <= nums2[j]. The distance of the pair is j - i​​​​.

Return the maximum distance of any valid pair (i, j). If there are no valid pairs, return 0.

An array arr is non-increasing if arr[i-1] >= arr[i] for every 1 <= i < arr.length.

 

Example 1:

Input: nums1 = [55,30,5,4,2], nums2 = [100,20,10,10,5]
Output: 2
Explanation: The valid pairs are (0,0), (2,2), (2,3), (2,4), (3,3), (3,4), and (4,4).
The maximum distance is 2 with pair (2,4).
Example 2:

Input: nums1 = [2,2,2], nums2 = [10,10,1]
Output: 1
Explanation: The valid pairs are (0,0), (0,1), and (1,1).
The maximum distance is 1 with pair (0,1).
Example 3:

Input: nums1 = [30,29,19,5], nums2 = [25,25,25,25,25]
Output: 2
Explanation: The valid pairs are (2,2), (2,3), (2,4), (3,3), and (3,4).
The maximum distance is 2 with pair (2,4).
Example 4:

Input: nums1 = [5,4], nums2 = [3,2]
Output: 0
Explanation: There are no valid pairs, so return 0.
 

Constraints:

1 <= nums1.length <= 105
1 <= nums2.length <= 105
1 <= nums1[i], nums2[j] <= 105
Both nums1 and nums2 are non-increasing.
*/
public class MaximumDistanceBetweenAPairOfValues {
    /*time limited - brute force
    public int maxDistance(int[] nums1, int[] nums2) {
        int answer = 0;
        
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(i <= j && nums1[i] <= nums2[j]){
                    answer = Math.max(answer, j-i);
                }
            }
        }
        
        return answer;
    }

    public int maxDistance(int[] nums1, int[] nums2) {
        int answer = 0;
        
        for(int i=nums2.length-1; i>=0; i--){
            for(int j=0; j<=Math.min(i, nums1.length-1); j++){
                if(nums2[i] >= nums1[j]){
                    answer = Math.max(answer, i-j);
                }
            }
        }
        
        return answer;
    }
    */

    /*wrong
    public int maxDistance(int[] nums1, int[] nums2) {
        int answer = 0;
        int i = 0, j = nums2.length-1;
        
        while(i<=j){
            if(nums1[i] > nums2[j]){
                i++;
                j--;
                continue;
            }
            else{
                answer = Math.max(answer, j-i);
                break;
            }
        }
        
        while(i > 0 && nums1[i-1] <= nums2[j]){
            i--;
        }
        
        while(j < nums2.length-1 && nums1[i] <= nums2[j+1]){
            j++;
        }
        
        answer = Math.max(answer , j-i);
        
        return answer;
    }
    */
}
