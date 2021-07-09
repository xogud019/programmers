package CodingTest.LeetCode.DP.Hard;
/*
For an integer array nums, an inverse pair is a pair of integers [i, j] where 0 <= i < j < nums.length and nums[i] > nums[j].

Given two integers n and k, return the number of different arrays consist of numbers from 1 to n such that there are exactly k inverse pairs. Since the answer can be huge, return it modulo 109 + 7.

 

Example 1:

Input: n = 3, k = 0
Output: 1
Explanation: Only the array [1,2,3] which consists of numbers from 1 to 3 has exactly 0 inverse pairs.
Example 2:

Input: n = 3, k = 1
Output: 2
Explanation: The array [1,3,2] and [2,1,3] have exactly 1 inverse pair.
 

Constraints:

1 <= n <= 1000
0 <= k <= 1000
*/
public class KInversePairsArray {
    /*failed case - memory exceed
    //brute force
    static final int mod = 1000000007;
    List<int[]> list;
    public int kInversePairs(int n, int k) {
        if(n == 1 && k == 1) return 0;
        if(n == 1 || k == 0) return 1;
        long answer = 0;
        list = new ArrayList<>();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = i+1;
        
        perm(arr, 0);
        
        for(int[] nums:list){
            int count = 0;
            
            for(int i=0; i<nums.length-1; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(i < j && nums[i] > nums[j]) count++;        
                }
            }
            
            if(count == k) answer++;
        }
        
        return (int)(answer%mod);
    }
    
    public void perm(int[] arr, int idx){
        if(idx == arr.length){
            int[] temp = arr.clone();
            list.add(temp);
        }
        
        for(int i=idx; i<arr.length; i++){
            swap(arr, i, idx);
            perm(arr, idx+1);
            swap(arr, i , idx);
        }
    }
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    */    
}
