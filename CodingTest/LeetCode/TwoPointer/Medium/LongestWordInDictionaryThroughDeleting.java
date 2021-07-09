package CodingTest.LeetCode.TwoPointer.Medium;
/*
Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

Example 1:
Input:
s = "abpcplea", d = ["ale","apple","monkey","plea"]

Output: 
"apple"
Example 2:
Input:
s = "abpcplea", d = ["a","b","c"]

Output: 
"a"
Note:
All the strings in the input will only contain lower-case letters.
The size of the dictionary won't exceed 1,000.
The length of all the strings in the input won't exceed 1,000.
*/
import java.util.List;

public class LongestWordInDictionaryThroughDeleting {
    public String findLongestWord(String s, List<String> d) {
        String answer = "";
        
        for(String dic : d){
            int len1 = answer.length(), len2 = dic.length();
            
            if(len1 > len2 || len1 == len2 && answer.compareTo(dic) < 0) continue;
            
            if(isSub(s, dic)) answer = dic;
        }
        
        return answer;
    }
    
    public boolean isSub(String s, String t){
        int i = 0 , j = 0;
        
        while(i<s.length() && j<t.length()){
            if(t.charAt(j) == s.charAt(i)){
                j++;
            }
            
            i++;
        }
        
        return j==t.length();
    }
}
