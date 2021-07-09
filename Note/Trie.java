package Note;

import java.util.HashMap;
import java.util.Map;
public class Trie {
    TrieNode root;

    Trie(){
        root = new TrieNode();
    }

    void insert(String word){
        TrieNode node = this.root;

        for(int i=0; i<word.length(); i++){
            node = node.childNode.computeIfAbsent(word.charAt(i),c->new TrieNode());
        }
        node.setIsL(true);
    }

    boolean contains(String word){
        TrieNode node = this.root;

        for(int i=0; i<word.length(); i++){
            char cc= word.charAt(i);
            TrieNode newNode = node.childNode.get(cc);

            if(newNode ==null){
                return false;
            }

            node = newNode;
        }

        return node.isL;
    }

    void delete(TrieNode node, String word, int index){
        char cc= word.charAt(index);

        if(!node.childNode.containsKey(cc)){
            throw new Error("no");
        }

        TrieNode child = node.childNode.get(cc);
        index++;

        if(index == word.length()){
            if(!child.isL){
                throw new Error("ch no");
            }
            child.setIsL(false);

            if(child.childNode.isEmpty()){
                node.childNode.remove(cc);
            }
            else{
                delete(child, word, index);
            }

            if(!child.isL&&child.childNode.isEmpty()){
                node.childNode.remove(cc);
            }
        }
    }
}

class TrieNode{
    boolean isL;
    Map<Character,TrieNode> childNode = new HashMap<>();

    void setIsL(boolean isL){
        this.isL = isL;
    }
}