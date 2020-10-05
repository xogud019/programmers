package LeetCode.Tree.Easy;

import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        
        preOrder(root, answer);

        return answer;
    }
    
    public void preOrder(Node root, List<Integer> answer){
        if(root != null){
            answer.add(root.val);
            
            for(Node node:root.children){
                preOrder(node, answer);
            }
        }
    }
}
