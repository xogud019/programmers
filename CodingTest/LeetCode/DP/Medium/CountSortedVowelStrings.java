package CodingTest.LeetCode.DP.Medium;

//import java.util.HashSet;
/*
Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.

A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.

 

Example 1:

Input: n = 1
Output: 5
Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"].

Example 2:

Input: n = 2
Output: 15
Explanation: The 15 sorted strings that consist of vowels only are
["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.

Example 3:

Input: n = 33
Output: 66045
 

Constraints:
1.1 <= n <= 50 
*/
public class CountSortedVowelStrings {
    /*time out
    HashSet<String> set;
    
    public int countVowelStrings(int n) {
        set = new HashSet<>();    
        String[] arr = {"a","e","i","o","u"};
        boolean[] visited = new boolean[arr.length];
        
        backtracking(arr, visited, new StringBuilder(), n);
        return set.size();
    }
    
    public void backtracking(String[] arr, boolean[] visited, StringBuilder sb, int n){
        if(sb.length() == n){
            String[] temp = sb.toString().split("");
            Arrays.sort(temp);
            set.add(Arrays.toString(temp));
            return;
        }
        
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
            backtracking(arr, visited, sb, n);
            sb.delete(sb.length()-1,sb.length());
        }
    }
    */

    /*
    Mathematical Explanation:
The process we count valid results can be considered as to count combinations when sampling n elements with replacement from the set S = { a, e, i, o, u }. Note, we only consider the combinations of the selected elements.

For example, if n = 3, { a, a, e } and { e, a, a } are considered as the same case, because once the elements are determined, their order is determined by the rule of lexicographically sorting. That's why we only need to consider the combination results rather than the permutation.

To count the combination results of sampling n elements with replacement from a set S, where |S| = m, we have the formula: Result = C(m + n - 1, n)

For this question, we have:
result = C( |S| + n - 1, n) = C(5 + n - 1, n) = C(n + 4, n) = C(n + 4, 4)

Since the max value of n is 50, the maximum cumulative product is 54 * 53 * 52 * 51 = 7,590,024, which is within the valid range of int, so we can directly write our code as follows:

public int countVowelStrings(int n) {
  return (n + 4) * (n + 3) * (n + 2) * (n + 1) / 24;
}
     */

     /*using dp
    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        
        Arrays.fill(dp,1);
        
        for(int i=2; i<n+1; i++){
            dp[0] += dp[4]+dp[3]+dp[2]+dp[1];
            dp[1] += dp[4]+dp[3]+dp[2];
            dp[2] += dp[4]+dp[3];
            dp[3] += dp[4];
        }
        
        return dp[0]+dp[1]+dp[2]+dp[3]+dp[4];
    }
     */
    String vowel = "aeiou";
    int count;
    
    public int countVowelStrings(int n) {
        count = 0;
        
        backtracking(n, 0);
        
        return count;
    }
    
    public void backtracking(int n, int idx){
        if(n == 0){
            count++;
            return;
        }
        
        for(int i=idx; i<vowel.length(); i++) backtracking(n-1, i);
    }

    /*dp
    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        //dp[0] = u, dp[1] = o, dp[2] = i, dp[3] = e, dp[4] = a
        
        Arrays.fill(dp, 1);
        
        for(int i=2; i<=n; i++){
            dp[4] += dp[3]+dp[2]+dp[1]+dp[0];
            dp[3] += dp[2]+dp[1]+dp[0];
            dp[2] += dp[1]+dp[0];
            dp[1] += dp[0];
        }
        
        return dp[4]+dp[3]+dp[2]+dp[1]+dp[0];
    }
    */
}
