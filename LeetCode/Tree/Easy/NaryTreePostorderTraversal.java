package LeetCode.Tree.Easy;

import java.util.*;

public class NaryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        
        postOrder(root, answer);
        
        return answer;
    }
    
    public void postOrder(Node root, List<Integer> answer){
        if(root != null){
            for(Node node : root.children){
                postOrder(node, answer);
            }
            
            answer.add(root.val);
        }
    }
}
