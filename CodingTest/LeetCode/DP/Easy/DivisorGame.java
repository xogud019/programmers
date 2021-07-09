package CodingTest.LeetCode.DP.Easy;

/*
Alice and Bob take turns playing a game, with Alice starting first.

Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:

Choosing any x with 0 < x < n and n % x == 0.
Replacing the number n on the chalkboard with n - x.
Also, if a player cannot make a move, they lose the game.

Return true if and only if Alice wins the game, assuming both players play optimally.

 

Example 1:

Input: n = 2
Output: true
Explanation: Alice chooses 1, and Bob has no more moves.
Example 2:

Input: n = 3
Output: false
Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.
 

Constraints:

1 <= n <= 1000
*/
public class DivisorGame {
    public boolean divisorGame(int N) {
        int count = 0;
        
        while(N>1){
            for(int i=1; i<N; i++){
                if(N%i==0){
                    count++;
                    N -= i;
                    break;
                }
            }
        }
        
        return count % 2 == 0? false : true;
    }
    /*
    public boolean divisorGame(int N) {
        return N%2==0;
    }
    */

    /*using dp
    public boolean divisorGame(int N) {
        if(N == 1)
            return false;
        int[] dp = new int[N];
        dp[0] = 0;
        for(int i = 1; i < dp.length; i++){
            dp[i] = N == 1 ? 1 : --N;
        }
        return dp.length % 2 == 0 ? dp[dp.length-1] == 1 : dp[dp.length-1] != 1;
    }
    */
}
