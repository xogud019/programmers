package LeetCode.Map.Easy;

import java.util.HashSet;

public class LongestWordInDictionary {
    public String longestWord(String[] words) {
        String answer = "";
        HashSet<String> set = new HashSet<>();
        
        for(String word:words) set.add(word);
        
        for(String word:words){
            if(word.length()>answer.length()|| (word.length()==answer.length() && word.compareTo(answer) < 0)){
                boolean isCotain = true;
                
                for(int i=1; i<word.length(); i++){
                    if(!set.contains(word.substring(0,i))){
                        isCotain = false;
                        break;
                    }
                }
                
                if(isCotain) answer = word;
            }
        }
        
        return answer;
    }
}

/*trie
    public String longestWord(String[] words) {
        Trie trie = new Trie();
        int index = 0;
        for (String word: words) {
            trie.insert(word, ++index); //indexed by 1
        }
        trie.words = words;
        return trie.dfs();
    }
    class Node {
    char c;
    HashMap<Character, Node> children = new HashMap();
    int end;
    public Node(char c){
        this.c = c;
    }
}

class Trie {
    Node root;
    String[] words;
    public Trie() {
        root = new Node('0');
    }

    public void insert(String word, int index) {
        Node cur = root;
        for (char c: word.toCharArray()) {
            cur.children.putIfAbsent(c, new Node(c));
            cur = cur.children.get(c);
        }
        cur.end = index;
    }

    public String dfs() {
        String ans = "";
        Stack<Node> stack = new Stack();
        stack.push(root);
        while (!stack.empty()) {
            Node node = stack.pop();
            if (node.end > 0 || node == root) {
                if (node != root) {
                    String word = words[node.end - 1];
                    if (word.length() > ans.length() ||
                            word.length() == ans.length() && word.compareTo(ans) < 0) {
                        ans = word;
                    }
                }
                for (Node nei: node.children.values()) {
                    stack.push(nei);
                }
            }
        }
        return ans;
    }
}
*/
