package CodingTest.LeetCode.BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;
/*
Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.

Return a list of all possible strings we could create. You can return the output in any order.

Example 1:

Input: S = "a1b2"
Output: ["a1b2","a1B2","A1b2","A1B2"]

Example 2:

Input: S = "3z4"
Output: ["3z4","3Z4"]

Example 3:

Input: S = "12345"
Output: ["12345"]

Example 4:

Input: S = "0"
Output: ["0"]
 

Constraints:
1.S will be a string with length between 1 and 12.
2.S will consist only of letters or digits.
*/
public class LetterCasePermutation {
    List<String> answer;
    
    public List<String> letterCasePermutation(String S) {
        answer = new ArrayList<>();
        
        backtracking(S, 0, S.toCharArray());
        
        return answer;
    }
    
    public void backtracking(String s, int idx, char[] c){
        answer.add(new String(c));
        
        for(int i=idx; i<s.length(); i++){
            char temp = s.charAt(i);
            
            if(!Character.isDigit(temp)){
                c[i] = inverse(temp);
                backtracking(s, i+1, c);
                c[i] = temp;
            }
        }
    }
    
    public char inverse(char c){
        if(Character.isLowerCase(c)) return Character.toUpperCase(c);
        
        return Character.toLowerCase(c);
    }

    /*time out
    List<String> answer;
    
    public List<String> letterCasePermutation(String S) {
        answer = new ArrayList<>();    
        
        dfs(S, S.toCharArray(), 0);
        
        return answer;
    }
    
    public void dfs(String s, char[] arr, int idx){
        if(!answer.contains(new String(arr))) answer.add(new String(arr));
        
        for(int i=idx; i<s.length(); i++){
            char temp = arr[i];
            
            if(!Character.isDigit(temp)){
                if(Character.isLowerCase(temp)){
                    arr[i] = Character.toUpperCase(temp);
                    dfs(s, arr, idx+1);
                    arr[i] = temp;
                }
                else{
                    arr[i] = Character.toLowerCase(temp);
                    dfs(s, arr, idx+1);
                    arr[i] = temp;
                }
            }
        }
    }
    */
    /*
    List<String> answer;
    
    public List<String> letterCasePermutation(String S) {
        answer = new ArrayList<>();    
        
        dfs(S, S.toCharArray(), 0);
        
        return answer;
    }
    
    public void dfs(String s, char[] arr, int idx){
        if(!answer.contains(new String(arr))) answer.add(new String(arr));
        
        for(int i=idx; i<s.length(); i++){
            char temp = arr[i];
            
            if(!Character.isDigit(temp)){
                arr[i] = converse(temp);
                dfs(s, arr, i+1);
                arr[i] = temp;
            }
        }
    }
    
    public Character converse(char c){
        if(Character.isLowerCase(c)) return Character.toUpperCase(c);
        
        return Character.toLowerCase(c);
    }
    */
}
