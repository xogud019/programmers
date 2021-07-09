package CodingTest.LeetCode.BitManifulation.Medium;
/*
Given the array arr of positive integers and the array queries where queries[i] = [Li, Ri], for each query i compute the XOR of elements from Li to Ri (that is, arr[Li] xor arr[Li+1] xor ... xor arr[Ri] ). Return an array containing the result for the given queries.
 

Example 1:

Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
Output: [2,7,14,8] 
Explanation: 
The binary representation of the elements in the array are:
1 = 0001 
3 = 0011 
4 = 0100 
8 = 1000 
The XOR values for queries are:
[0,1] = 1 xor 3 = 2 
[1,2] = 3 xor 4 = 7 
[0,3] = 1 xor 3 xor 4 xor 8 = 14 
[3,3] = 8
Example 2:

Input: arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]]
Output: [8,0,4,4]
 

Constraints:
1.1 <= arr.length <= 3 * 10^4
2.1 <= arr[i] <= 10^9
3.1 <= queries.length <= 3 * 10^4
4.queries[i].length == 2
5.0 <= queries[i][0] <= queries[i][1] < arr.length
*/
public class XORQueriesOfASubarray {
    /*time 5%
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] answer = new int[n];
        
        for(int i=0; i<n; i++){
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                answer[i] ^= arr[j];
            }
        }
        
        return answer;
    }
    */
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] answer = new int[n];
        int[] preXor = new int[arr.length];
        
        preXor[0] = arr[0];
        
        for(int i=1; i<arr.length; i++) preXor[i] = arr[i]^preXor[i-1];
        
        int idx = 0;
        
        for(int[] i:queries){
            if(i[0] == 0) answer[idx++] = preXor[i[1]];        
            else answer[idx++] = preXor[i[1]] ^ preXor[i[0]-1];
        }
        
        return answer;
    }
}
