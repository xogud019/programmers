package LeetCode.TwoPointer.Medium;

import java.util.ArrayList;
import java.util.List;
/*
You are given two lists of closed intervals, firstList and secondList, where firstList[i] = [starti, endi] and secondList[j] = [startj, endj]. Each list of intervals is pairwise disjoint and in sorted order.

Return the intersection of these two interval lists.

A closed interval [a, b] (with a < b) denotes the set of real numbers x with a <= x <= b.

The intersection of two closed intervals is a set of real numbers that are either empty or represented as a closed interval. For example, the intersection of [1, 3] and [2, 4] is [2, 3].

 
Example 1:

Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]

Example 2:

Input: firstList = [[1,3],[5,9]], secondList = []
Output: []

Example 3:

Input: firstList = [], secondList = [[4,8],[10,12]]
Output: []

Example 4:

Input: firstList = [[1,7]], secondList = [[3,10]]
Output: [[3,7]]
 
Constraints:
1.0 <= firstList.length, secondList.length <= 1000
2.firstList.length + secondList.length >= 1
3.0 <= starti < endi <= 10^9
4.endi < starti+1
5.0 <= startj < endj <= 10^9
6.endj < startj+1
*/
public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i=0, j = 0;
        List<int[]> list = new ArrayList<>();
        
        while(i<firstList.length && j<secondList.length){
        
            int min = Math.max(firstList[i][0], secondList[j][0]);
            int max = Math.min(firstList[i][1], secondList[j][1]);
        
            if(min <= max) list.add(new int[]{min,max});
        
            if(firstList[i][1] < secondList[j][1]) i++;
            else j++;
        }
        
        return list.toArray(new int[list.size()][]);
    }
}
