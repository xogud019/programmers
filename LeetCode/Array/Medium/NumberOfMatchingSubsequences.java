package LeetCode.Array.Medium;

import java.util.HashMap;

/*
Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
 

Example 1:

Input: s = "abcde", words = ["a","bb","acd","ace"]
Output: 3
Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".
Example 2:

Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
Output: 2
 

Constraints:

1 <= s.length <= 5 * 104
1 <= words.length <= 5000
1 <= words[i].length <= 50
s and words[i] consist of only lowercase English letters.
*/
public class NumberOfMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String, Boolean> map = new HashMap<>();
        int answer = 0;
        
        for(String word : words){
            if(!map.containsKey(word)){
                if(isSub(s, word) && s.length() >= word.length()){
                    map.put(word, true);
                    answer++;
                }
                else map.put(word, false);
            }
            else{
                if(map.get(word)) answer++;
            }
        }
        
        return answer;
    }
    
    public boolean isSub(String s1, String s2){
        int i = 0, j = 0;
        //i = sPointer, j = wordPointer
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            else i++;
        }
        
        return j==s2.length();
    }
}
