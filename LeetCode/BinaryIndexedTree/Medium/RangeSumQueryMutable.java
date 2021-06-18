package LeetCode.BinaryIndexedTree.Medium;
//Binary Indexed Tree || Segment Tree
/*
Given an integer array nums, handle multiple queries of the following types:

Update the value of an element in nums.
Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
void update(int index, int val) Updates the value of nums[index] to be val.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 

Example 1:

Input
["NumArray", "sumRange", "update", "sumRange"]
[[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
Output
[null, 9, null, 8]

Explanation
NumArray numArray = new NumArray([1, 3, 5]);
numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9
numArray.update(1, 2);   // nums = [1, 2, 5]
numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8
 

Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
0 <= index < nums.length
-100 <= val <= 100
0 <= left <= right < nums.length
At most 3 * 104 calls will be made to update and sumRange.
*/
public class RangeSumQueryMutable {
    /*failed case - time limited 
    //brute force
    class NumArray {
        int[] arr = new int[30000];
        
        public NumArray(int[] nums) {
            for(int i=0; i<nums.length; i++) arr[i] = nums[i];
        }
        
        public void update(int index, int val) {
            arr[index] = val;
        }
        
        public int sumRange(int left, int right) {
            int sum = 0;
            
            for(int i=left; i<right+1; i++) sum += arr[i];
            
            return sum;
        }
    }

    */
    class NumArray {
        int[] bit, nums;
        int n;
        
        public NumArray(int[] nums) {
            n = nums.length;
            bit = new int[n+1];
            this.nums = nums;
            
            for(int i=0; i<n; i++) bUpdate(i, nums[i]);
        }
        
        public void bUpdate(int index, int val) {
            int idx = index+1;
            
            while(idx < n+1){
                bit[idx] += val;
                idx += (idx & -idx);
            }
        }
        
        public void update(int index, int val) {
            int diff = val - nums[index];
            
            nums[index] = val;
            
            int idx = index + 1;
            
            while(idx < n+1){
                bit[idx] += diff;
                idx += (idx & -idx);
            }
        }
        
        public int sumRange(int left, int right) {
            return getSum(right) - getSum(left-1);
        }
        
        public int getSum(int index){
            int sum = 0, idx = index + 1;
            
            while(idx > 0){
                sum += bit[idx];
                idx -= (idx&-idx);
            }
            
            return sum;
        }
    }
    
}
