package CodingTest.LeetCode.Tree.Easy;

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
    //recursive
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

    /*iterative
    public List<Integer> preorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        
        if(root == null) return answer;
        
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        
        while(!stk.isEmpty()){
            Node node = stk.pop();
            
            answer.add(node.val);
            
            for(int i=node.children.size()-1; i>=0; i--) stk.push(node.children.get(i));
        }
        
        return answer;
    }
    */
}
