package CodingTest.LeetCode.Math.Easy;

import java.util.Arrays;

public class SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        
        return Math.max(0, A[A.length-1]-A[0]-K*2);
    }
}
