package CodingTest.LeetCode.String.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Given a list of unique words, return all the pairs of the distinct indices (i, j) in the given list, so that the concatenation of the two words words[i] + words[j] is a palindrome.

 

Example 1:

Input: words = ["abcd","dcba","lls","s","sssll"]
Output: [[0,1],[1,0],[3,2],[2,4]]
Explanation: The palindromes are ["dcbaabcd","abcddcba","slls","llssssll"]
Example 2:

Input: words = ["bat","tab","cat"]
Output: [[0,1],[1,0]]
Explanation: The palindromes are ["battab","tabbat"]
Example 3:

Input: words = ["a",""]
Output: [[0,1],[1,0]]
 

Constraints:

1 <= words.length <= 5000
0 <= words[i].length <= 300
words[i] consists of lower-case English letters.
*/
public class PalindromePairs {
    /*failed case - time limited -> brute force
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int i=0; i<words.length; i++){
            List<Integer> list;
            
            for(int j=0; j<words.length; j++){
                if(i == j) continue;
                
                list = new ArrayList<>();
                
                if(isPal(words[i]+words[j])){
                    list.add(i);
                    list.add(j);
                    
                    answer.add(list);
                }
                
            }
        }
        
        return answer;
    }
    
    public boolean isPal(String s){
        int i = 0, j = s.length()-1;
        
        while(i <= j){
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        
        return true;
    }
    */
    //using hash
    /*
    1. one = "", the other = pal  ==> true
    2. one`rev = the other == > true
    3 one + the other == pal ==> true
    */
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int len = words.length;
        
        for(int i=0; i<len; i++) map.put(words[i], i);
        //case1
        for(int i=0; i<len; i++){
            if(words[i].equals("")){
                for(int j=0; j<len; j++){
                    if(i == j) continue;
                    
                    if(isPal(words[j])){
                        answer.add(Arrays.asList(i, j));
                        answer.add(Arrays.asList(j, i));
                    }
                }
            }
        }
        
        //case2
        for(int i=0; i<len; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            
            sb.reverse();
            
            String rev = sb.toString();
            
            if(map.containsKey(rev) && map.get(rev) != i) answer.add(Arrays.asList(i, map.get(rev)));
            
            //case33
            for(int j=1; j<rev.length(); j++){
                if(isPal(rev.substring(0, j))){
                    String w = rev.substring(j);
                    
                    if(map.containsKey(w)) answer.add(Arrays.asList(i, map.get(w)));
                }
                
                if(isPal(rev.substring(j, rev.length()))){
                    String w = rev.substring(0, j);
                    
                    if(map.containsKey(w)) answer.add(Arrays.asList(map.get(w), i));
                }
            }
        }
      //3234  rev 4323  
        //case3
        
        
        return answer;
    }
    
    public boolean isPal(String s){
        int i = 0, j = s.length()-1;
        
        while(i <= j){
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        
        return true;
    }
}
