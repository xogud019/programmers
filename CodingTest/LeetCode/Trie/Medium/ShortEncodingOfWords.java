package CodingTest.LeetCode.Trie.Medium;

import java.util.HashMap;

/*
A valid encoding of an array of words is any reference string s and array of indices indices such that:

words.length == indices.length
The reference string s ends with the '#' character.
For each index indices[i], the substring of s starting from indices[i] and up to (but not including) the next '#' character is equal to words[i].
Given an array of words, return the length of the shortest reference string s possible of any valid encoding of words.

 

Example 1:

Input: words = ["time", "me", "bell"]
Output: 10
Explanation: A valid encoding would be s = "time#bell#" and indices = [0, 2, 5].
words[0] = "time", the substring of s starting from indices[0] = 0 to the next '#' is underlined in "time#bell#"
words[1] = "me", the substring of s starting from indices[1] = 2 to the next '#' is underlined in "time#bell#"
words[2] = "bell", the substring of s starting from indices[2] = 5 to the next '#' is underlined in "time#bell#"
Example 2:

Input: words = ["t"]
Output: 2
Explanation: A valid encoding would be s = "t#" and indices = [0].

 

Constraints:

1 <= words.length <= 2000
1 <= words[i].length <= 7
words[i] consists of only lowercase letters.
*/
public class ShortEncodingOfWords {
    class TrieNode{
        TrieNode[] children;
        boolean hasChild;
        
        public TrieNode(){
            children = new TrieNode[26];
            hasChild = false;
        }
        
        public TrieNode get(char c){
            if(children[c-'a'] == null){
                children[c-'a'] = new TrieNode();
                hasChild = true;
            }
            
            return children[c-'a'];
        }
    }
    
    public int minimumLengthEncoding(String[] words) {
        TrieNode root = new TrieNode();
        HashMap<TrieNode, Integer> map = new HashMap<>();
        int idx = 0, answer = 0;
        
        for(String word:words){
            TrieNode cur = root;
            
            for(int i = word.length()-1; i>=0; --i){
                cur = cur.get(word.charAt(i));    
            }
            
            map.put(cur, idx++);
        }
        
        for(TrieNode node:map.keySet()){
            if(!node.hasChild) answer += words[map.get(node)].length()+1;
        }
        
        return answer;
    }
    /*using set and prefix
    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet<>();
        int answer = 0;
        
        for(String word:words) set.add(word);
        
        for(String word:words){
            for(int i=1; i<word.length(); i++){
                set.remove(word.substring(i));
            }
        }
        
        for(String word:set) answer += word.length()+1;
        
        return answer;
    }
    */
    /*
    public int minimumLengthEncoding(String[] words) {
        TrieNode trie = new TrieNode();
        Map<TrieNode, Integer> nodes = new HashMap<>();

        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            TrieNode cur = trie;
            for (int j = word.length() - 1; j >= 0; --j)
                cur = cur.get(word.charAt(j));
            nodes.put(cur, i);
        }

        int ans = 0;
        for (TrieNode node: nodes.keySet()) {
            if (node.count == 0)
                ans += words[nodes.get(node)].length() + 1;
        }
        return ans;

    }
    */
}
/*
class TrieNode {
    TrieNode[] children;
    int count;
    TrieNode() {
        children = new TrieNode[26];
        count = 0;
    }
    public TrieNode get(char c) {
        if (children[c-'a'] == null) {
            children[c-'a'] = new TrieNode();
            count++;
        }
        return children[c - 'a'];
    }
}
*/
/*abstract
public int minimumLengthEncoding(String[] words) {
		Node trie = new Node();
		// add each word to trie tree
		for (String word : words) {
			add(trie, word);
		}
		// collect lengths with recursion
		return collect(trie);
	}

	private void add(Node trie, String word) {
		Node node = trie;
		for (int i = word.length() - 1; i >= 0; i--) {
			node = node.get(word.charAt(i));
		}
		node.word = word;
	}

	private int collect(Node node) {
		if (node == null)
			return 0;
		if (node.count == 0)
			return node.word.length() + 1;
		int count = 0;
		for (Node n : node.next) {
			count += collect(n);
		}
		return count;
	}

	class Node {
		Node[] next = new Node[26];
		int count = 0; // count children nodes, zero means a leave
		String word = null;

		public Node get(char c) {
			int i = c - 'a';
			if (next[i] == null) {
				next[i] = new Node();
				count++;
			}
			return next[i];
		}
	}
*/