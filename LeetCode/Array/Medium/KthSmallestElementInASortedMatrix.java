package LeetCode.Array.Medium;

import java.util.PriorityQueue;

/*
Given an n x n matrix where each of the rows and columns are sorted in ascending order, return the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.

 

Example 1:

Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
Output: 13
Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
Example 2:

Input: matrix = [[-5]], k = 1
Output: -5
 

Constraints:

n == matrix.length
n == matrix[i].length
1 <= n <= 300
-109 <= matrix[i][j] <= 109
All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
1 <= k <= n2
*/
public class KthSmallestElementInASortedMatrix {
    // using heap 22ms
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int num = Integer.MIN_VALUE, idx = 0;

        for (int[] i : matrix)
            for (int j : i)
                pq.add(j);

        while (!pq.isEmpty()) {
            int n = pq.poll();

            idx++;
            num = n;

            if (k == idx)
                return num;
        }

        return num;
    }
    /*0ms
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int lo = matrix[0][0], hi = matrix[n-1][n-1];
        
        while(lo < hi){
            int mid = lo + (hi - lo)/2;
            
            if(countLessThanM(matrix, mid, n) < k) lo = mid + 1;
            else hi = mid;
        }
        
        return lo;
    }
    
    public int countLessThanM(int[][] matrix, int mid, int n){
        int r = 0, c = n-1, count = 0;
        
        while(r < n && c >= 0){
            if(matrix[r][c] <= mid){
                r++;
                count += (c + 1);
            }
            else c--;
        }
        
        return count;
    }
    */
}
