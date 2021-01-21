package LeetCode.BackTracking.Medium;

import java.util.ArrayList;
import java.util.Collections;
/*
A happy string is a string that:

consists only of letters of the set ['a', 'b', 'c'].
s[i] != s[i + 1] for all values of i from 1 to s.length - 1 (string is 1-indexed).
For example, strings "abc", "ac", "b" and "abcbabcbcb" are all happy strings and strings "aa", "baa" and "ababbc" are not happy strings.

Given two integers n and k, consider a list of all happy strings of length n sorted in lexicographical order.

Return the kth string of this list or return an empty string if there are less than k happy strings of length n.

 

Example 1:

Input: n = 1, k = 3
Output: "c"
Explanation: The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".

Example 2:

Input: n = 1, k = 4
Output: ""
Explanation: There are only 3 happy strings of length 1.

Example 3:

Input: n = 3, k = 9
Output: "cab"
Explanation: There are 12 different happy string of length 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You will find the 9th string = "cab"

Example 4:

Input: n = 2, k = 7
Output: ""

Example 5:

Input: n = 10, k = 100
Output: "abacbabacb"
 

Constraints:
1.1 <= n <= 10
2.1 <= k <= 100
*/
public class ThekthLexicographicalStringOfAllHappyStringsOfLengthN {
    /*failed case
    ArrayList<String> list;
    boolean[] visited;
    String str = "abc";
    
    public String getHappyString(int n, int k) {
        list = new ArrayList<>();
        visited = new boolean[3];
        
        backtracking(n, new StringBuilder());
        
        Collections.sort(list);
        
        for(String s:list){
            System.out.println(s);
        }
        if(k> list.size()) return "";
        else return list.get(k-1);
    }
    
    public void backtracking(int n, StringBuilder sb){
        if(sb.length() == n){
            if(happyWord(sb)) list.add(sb.toString());
            return;
        }
        
        for(int i=0; i<str.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                sb.append(""+str.charAt(i));
                backtracking(n, sb);
                sb.delete(sb.length()-1, sb.length());
                visited[i] = false;
            }
        }
    }
    
    public boolean happyWord(StringBuilder sb){
        if(sb.length()==1) return true;
        
        for(int i=0; i<sb.length()-1; i++){
            if(sb.charAt(i)==sb.charAt(i+1)) return false;
        }
        
        return true;
    }
    */
    ArrayList<String> list;
    String str = "abc";
    
    public String getHappyString(int n, int k) {
        list = new ArrayList<>();
        
        backtracking(n, new StringBuilder());
        
        Collections.sort(list); //dictionary order
        
        if(k> list.size()) return "";
        else return list.get(k-1);
    }
    
    public void backtracking(int n, StringBuilder sb){
        if(sb.length() == n){
            list.add(sb.toString());
            return;
        }
        
        for(int i=0; i<str.length(); i++){
            //first word
            if(sb.length()==0){
                sb.append(""+str.charAt(i));
                backtracking(n, sb);
                sb.delete(sb.length()-1, sb.length());
                continue;
            }
            //check happy word && make word
            if(sb.charAt(sb.length()-1) != str.charAt(i)){
                sb.append(""+str.charAt(i));
                backtracking(n, sb);
                sb.delete(sb.length()-1, sb.length());
            }
        }
    }
}
