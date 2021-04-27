package LeetCode.Array.Easy;
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 

Constraints:

1.-10^9 <= nums1[i], nums2[i] <= 10^9
2.nums1.length == m + n
3.nums2.length == n
*/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int i = 0, j = 0, idx = 0;
        
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[idx++] = nums1[i++];
            }
            else{
                arr[idx++] = nums2[j++];
            }
        }
        
        if(i==m){
            for(int x = j; x<n; x++){
                arr[idx++] = nums2[x];
            }
        }
        else if(j==n){
            for(int x = i; x<m; x++){
                arr[idx++] = nums1[x];
            }
        }
        
        for(int x=0; x<nums1.length; x++){
            nums1[x] = arr[x];
        }
    }
    /*no another space
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = 0, jdx = 0;
        
        while(idx < m && jdx < n && m < nums1.length){
            if(nums2[jdx] >= nums1[idx]){
                idx++;
            }
            else{
                for(int i=m; i>idx; i--) nums1[i] = nums1[i-1];
                
                nums1[idx++] = nums2[jdx++];
                m++;
            }
        }
        
        if(jdx < n){
            for(int i=jdx; i<n; i++) nums1[idx++] = nums2[i];
        }
    }
    */
}
