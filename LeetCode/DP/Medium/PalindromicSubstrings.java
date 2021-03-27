package LeetCode.DP.Medium;
/*
Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:

Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
 

Example 2:

Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 

Note:

The input string length won't exceed 1000.
*/
public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++){
            answer += isPal(s, i, i);
            answer += isPal(s, i, i+1);
        }
        
        return answer;
    }
    
    public int isPal(String s, int lo, int hi){
        int count = 0;
        
        while(lo >= 0 && hi < s.length()){
            if(s.charAt(lo) != s.charAt(hi)) break;
            
            lo--;
            hi++;
            count++;
        }
        
        return count;
    }
    /*failed case dfs
    static int answer;
    
    public int countSubstrings(String s) {
        boolean[] visited = new boolean[s.length()];
        answer = 0;
        
        dfs(s.toCharArray(), visited, 0, new StringBuilder());
        
        return answer;
    }
    
    public void dfs(char[] arr, boolean[] visited, int idx, StringBuilder sb){
        if(idx == arr.length) return;

        for(int i=idx; i<arr.length; i++){
            if(!visited[i]){
                sb.append(""+arr[i]);
                visited[i] = true;
                System.out.print(i+" "+sb.toString()+" ");
                dfs(arr, visited, i+1, sb);
                visited[i] = false;
                //System.out.println(sb.toString());
                //System.out.println(i+" "+sb.toString());
            }
            sb.delete(0,sb.length());
        }
        
        return;
    }
    
    public boolean isPal(String s){
        int lo = 0 , hi = s.length()-1;
        
        while(lo<=hi){
            if(s.charAt(lo++) != s.charAt(hi--)) return false;
        }
        
        return true;
    }
    */
    /*brute force
    public int countSubstrings(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<=s.length(); j++){
                //System.out.println(s.substring(i,j));
                answer += isPal(s.substring(i,j))? 1:0;        
            }
        }
        
        return answer;
    }
    
    public boolean isPal(String s){
        if(s.length() == 0) return false;
        int i=0, j = s.length()-1;
        
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            
            i++;
            j--;
        }
        
        return true;
    }
    */
}
