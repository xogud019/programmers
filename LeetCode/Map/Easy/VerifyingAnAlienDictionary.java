package LeetCode.Map.Easy;
/*
In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.

 

Example 1:

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
Example 2:

Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
Example 3:

Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 20
order.length == 26
All characters in words[i] and order are English lowercase letters.
*/
public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int len = words.length;
        
        for(int i=1; i<len; i++){
            String s1 = words[i-1];
            String s2 = words[i];
            boolean isE = false;
            
            for(int j=0; j<Math.min(s1.length(),s2.length()); j++){
                char c1 = s1.charAt(j);
                char c2 = s2.charAt(j);
                
                if(order.indexOf(c1)>order.indexOf(c2)) return false;
                else if(order.indexOf(c1) == order.indexOf(c2)) continue;
                else{
                    isE = true;
                    break;
                }
            }
            
            if(!isE){
                if(s1.length()>s2.length()) return false;
            }
            
        }
        
        return true;
    }

    /*
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> dic = new HashMap<>();
        
        for(int i=0; i<26; i++) dic.put(order.charAt(i), i);
        
        for(int i=0; i<words.length-1; i++){
            String s1 = words[i];
            String s2 = words[i+1];
            boolean isSame = true;
            
            for(int j=0; j<Math.min(s1.length(), s2.length()); j++){
                char c1 = s1.charAt(j), c2 = s2.charAt(j);
                
                if(dic.get(c1) > dic.get(c2)) return false;
                else if(dic.get(c1) == dic.get(c2)) continue;
                else{
                    isSame = false;
                    break;
                }
            }
            
            if(isSame && s1.length() > s2.length()) return false;
        }
        
        return true;
    }
    */
}
