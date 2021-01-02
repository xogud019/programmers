package LeetCode.String.Easy;

import java.util.Arrays;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:
1.0 <= strs.length <= 200
2.0 <= strs[i].length <= 200
3.strs[i] consists of only lower-case English letters.
*/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder answer = new StringBuilder();
        Arrays.sort(strs);
        
        
        i_loop:for(int i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);
            
            for(int j=1; j<strs.length; j++){
                if(strs[j].charAt(i)!=c) break i_loop;
            }
            
            answer.append(c);
        }
        
        return answer.toString();
    }
}
