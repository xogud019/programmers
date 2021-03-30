package LeetCode.DP.Hard;

import java.util.Arrays;
/*
You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope.

One envelope can fit into another if and only if both the width and height of one envelope is greater than the width and height of the other envelope.

Return the maximum number of envelopes can you Russian doll (i.e., put one inside the other).

Note: You cannot rotate an envelope.

 

Example 1:

Input: envelopes = [[5,4],[6,4],[6,7],[2,3]]
Output: 3
Explanation: The maximum number of envelopes you can Russian doll is 3 ([2,3] => [5,4] => [6,7]).
Example 2:

Input: envelopes = [[1,1],[1,1],[1,1]]
Output: 1
 

Constraints:

1 <= envelopes.length <= 5000
envelopes[i].length == 2
1 <= wi, hi <= 104
*/
public class RussianDollEnvelopes {
    //using dp
    public int maxEnvelopes(int[][] envelopes) {
        int len = envelopes.length;
        
        if(len == 1) return 1;
        
        Arrays.sort(envelopes, (a, b) ->{
            if(a[0] != b[0]){
                    return a[0] - b[0];
                }
            
            return a[1] - b[1];
        });
        /*
        Arrays.sort(envelopes, new Comparator<int[]> (){
            @Override
            public int compare(int[] a, int[] b){
                if(a[0] != b[0]){
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            }
        });
        */
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        
        for(int i=0; i<len; i++){
            for(int j=0; j<i; j++){
                if(envelopes[j][0] < envelopes[i][0] && envelopes[j][1] < envelopes[i][1]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        
        int answer = 0;
        
        for(int i:dp) answer = Math.max(answer, i);
        
        return answer;
    }
}
