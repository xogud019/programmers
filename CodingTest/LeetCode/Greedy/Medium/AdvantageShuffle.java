package CodingTest.LeetCode.Greedy.Medium;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
Given two arrays A and B of equal size, the advantage of A with respect to B is the number of indices i for which A[i] > B[i].

Return any permutation of A that maximizes its advantage with respect to B.

 

Example 1:

Input: A = [2,7,11,15], B = [1,10,4,11]
Output: [2,11,7,15]
Example 2:

Input: A = [12,24,8,32], B = [13,25,32,11]
Output: [24,32,8,12]
 

Note:

1 <= A.length = B.length <= 10000
0 <= A[i] <= 10^9
0 <= B[i] <= 10^9
*/
public class AdvantageShuffle {
    public int[] advantageCount(int[] A, int[] B) {
        int[] answer = new int[A.length];
        Arrays.sort(A);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        
        for(int i=0; i<B.length; i++){
            pq.add(new int[]{i, B[i]});
        }
        
        int start = 0, end = A.length-1;
        
        while(!pq.isEmpty()){
            int[] b = pq.poll();
            
            if(b[1] >= A[end]){
                answer[b[0]] = A[start++];
            }
            else answer[b[0]] = A[end--];
        }
        
        return answer;
    }
}
