package LeetCode.Trie.Hard;
/*
Design a special dictionary which has some words and allows you to search the words in it by a prefix and a suffix.

Implement the WordFilter class:

WordFilter(string[] words) Initializes the object with the words in the dictionary.
f(string prefix, string suffix) Returns the index of the word in the dictionary which has the prefix prefix and the suffix suffix. If there is more than one valid index, return the largest of them. If there is no such word in the dictionary, return -1.
 

Example 1:

Input
["WordFilter", "f"]
[[["apple"]], ["a", "e"]]
Output
[null, 0]

Explanation
WordFilter wordFilter = new WordFilter(["apple"]);
wordFilter.f("a", "e"); // return 0, because the word at index 0 has prefix = "a" and suffix = 'e".
 

Constraints:

1 <= words.length <= 15000
1 <= words[i].length <= 10
1 <= prefix.length, suffix.length <= 10
words[i], prefix and suffix consist of lower-case English letters only.
At most 15000 calls will be made to the function f.
*/
//try again
public class PrefixAndSuffixSearch {
    class Trie{
        Trie[] children;
        int index;
        
        public Trie(){
            children = new Trie[27];
            index = 0;
        }
    }
    
    class WordFilter {
        Trie trie;
        
        public WordFilter(String[] words) {
            trie = new Trie();
            
            for(int idx = 0; idx < words.length; idx++){
                String str = words[idx]+"{";
                int len = str.length();
                            
                for(int i=0; i<len; i++){
                    Trie temp = trie;
                    temp.index = idx;
                    
                    for(int j=i; j<len*2-1; j++){
                        int k = (str.charAt(j%len)) -'a';
                        
                        if(temp.children[k] == null) temp.children[k] = new Trie();
                        
                        temp = temp.children[k];
                        temp.index =idx;
                    }
                }
            }
        }
        
        public int f(String prefix, String suffix) {
            Trie temp = trie;
            String key = suffix+"{"+prefix;
            
            for(char ch : key.toCharArray()){
                int idx = ch-'a';
                
                if(temp.children[idx] == null) return -1;
                
                temp = temp.children[idx];
            }
            
            return temp.index;
        }
    }
}
