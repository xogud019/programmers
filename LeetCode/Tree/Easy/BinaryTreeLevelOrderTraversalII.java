package LeetCode.Tree.Easy;

import java.util.*;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();
        List<List<Integer>> temp = new ArrayList<>();
        List<Integer> list;
        
        if(root == null) return answer;
        
        q.add(root);
        list = new ArrayList<>();
        list.add(root.val);
        temp.add(list);
        
        while(!q.isEmpty()){
            int size = q.size();
            list = new ArrayList<>();
            
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                
                if(node.left != null){
                    q.add(node.left);    
                    list.add(node.left.val);
                } 
                
                if(node.right != null){
                    q.add(node.right);   
                    list.add(node.right.val);
                }
            }
            
            if(list.size() != 0) temp.add(list);
        }
        
        for(int i=temp.size()-1; i>=0; i--) answer.add(temp.get(i));
        
        return answer;
    }
}
