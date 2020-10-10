package LeetCode.Tree.Easy;

import java.util.*;

public class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        Map<Integer, Integer> level = new HashMap<>();
        Map<Integer, Integer> anc = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        level.put(root.val, 0);
        
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            
            if(node.left != null){
                q.add(node.left);
                level.put(node.left.val, level.get(node.val)+1);
                anc.put(node.left.val, node.val);
            }
            if(node.right != null){
                q.add(node.right);
                level.put(node.right.val, level.get(node.val)+1);
                anc.put(node.right.val, node.val);
            }
        }
        
        
        if(level.get(x)==level.get(y) && anc.get(x)!= anc.get(y)) return true;
        
        return false;
    }
}
