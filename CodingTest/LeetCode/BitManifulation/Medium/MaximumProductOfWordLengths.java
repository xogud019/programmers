package CodingTest.LeetCode.BitManifulation.Medium;
/*
Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. If no such two words exist, return 0.

 

Example 1:

Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
Output: 16
Explanation: The two words can be "abcw", "xtfn".
Example 2:

Input: words = ["a","ab","abc","d","cd","bcd","abcd"]
Output: 4
Explanation: The two words can be "ab", "cd".
Example 3:

Input: words = ["a","aa","aaa","aaaa"]
Output: 0
Explanation: No such pair of words.
 
//if a = 1 b =2 c = 4 ... z = 2^25
Constraints:

2 <= words.length <= 1000
1 <= words[i].length <= 1000
words[i] consists only of lowercase English letters.
*/
public class MaximumProductOfWordLengths {
    /*brute force 532ms
    public int maxProduct(String[] words) {
        HashSet<Character> set;
        int answer = 0;
        
        for(String word : words){
            set = new HashSet<>();
            int len = word.length();
            
            for(char c : word.toCharArray()) set.add(c);
            
            for(String w : words){
                if(word.equals(w)) continue;
                
                boolean b = true;
                
                for(char c : w.toCharArray()){
                    if(set.contains(c)){
                        b = false;
                        break;
                    }
                }
                
                if(b) answer = Math.max(answer , len * w.length());
            }
        }
        
        return answer;
    }
    */

    //bit 6ms
    public int maxProduct(String[] words) {
        int[] bit = new int[words.length];
        
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                bit[i] = bit[i] | 1<< (words[i].charAt(j) - 'a');
            }
        }
        
        int answer = 0;
        
        for(int i=0; i<bit.length-1; i++){
            for(int j=i+1; j<bit.length; j++){
                if((bit[i]&bit[j]) == 0) answer = Math.max(answer, words[i].length() * words[j].length());
            }
        }
        
        return answer;
    }
}
