package LeetCode.DP.Medium;

import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of unique integers, arr, where each integer arr[i] is strictly greater than 1.

We make a binary tree using these integers, and each number may be used for any number of times. Each non-leaf node's value should be equal to the product of the values of its children.

Return the number of binary trees we can make. The answer may be too large so return the answer modulo 109 + 7.

 

Example 1:

Input: arr = [2,4]
Output: 3
Explanation: We can make these trees: [2], [4], [4, 2, 2]
Example 2:

Input: arr = [2,4,5,10]
Output: 7
Explanation: We can make these trees: [2], [4], [5], [10], [4, 2, 2], [10, 2, 5], [10, 5, 2].
 

Constraints:

1 <= arr.length <= 1000
2 <= arr[i] <= 109
*/
public class BinaryTreesWithFactors {
    static final int MOD = 1000000007;
    
    public int numFactoredBinaryTrees(int[] arr) {
        int len = arr.length; 
        long answer = 0;
        long[] dp = new long[len];
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(arr);
        Arrays.fill(dp,1);
        
        for(int i=0; i<len; i++) map.put(arr[i],i);
        
        for(int i=0; i<len; i++){
            for(int j=0; j<i; j++){
                if(arr[i]%arr[j] == 0){
                    int right = arr[i]/arr[j];
                    //arr[i] = arr[j] * (arr[i]/arr[j])
                    if(map.containsKey(right)){
                        dp[i] = (dp[i]+ dp[j]*dp[map.get(right)])%MOD;
                    }
                }
            }
        }
        
        for(long i:dp) answer += i;
        
        return (int)(answer%MOD);
    }
    /*
    public int numFactoredBinaryTrees(int[] arr) {
        long answer = 0;
        Map<Integer, Long> map = new HashMap<>();
        int len = arr.length;
        Arrays.sort(arr);
        
        for(int i=0; i<len; i++){
            long count = 1;
            
            for(int j=0; j<i; j++){
                if(arr[i]%arr[j] == 0){
                    int rightNode = arr[i]/arr[j];
                    
                    if(map.containsKey(rightNode)){
                        count += (map.get(arr[j])*map.get(rightNode));
                    }
                }
            }
            
            map.put(arr[i],count);
        }
        
        for(int i:map.keySet()) answer += map.get(i);
        
        return (int)(answer%mod);
    }
    */
}
