package CodingTest.LeetCode.Tree.Easy;

import java.util.*;

public class SecondMinimumNodeInABinaryTree {
    List<Integer> list;
    
    public int findSecondMinimumValue(TreeNode root) {
        list = new ArrayList<>();
        
        inorder(root);
        
        if(list.size() <=1) return -1;
        
        Collections.sort(list);
        
        return list.get(1);
    }
    
    public void inorder(TreeNode root){
        if(root != null){
            if(!list.contains(root.val)) list.add(root.val);
            inorder(root.left);
            inorder(root.right);
        }
    }
}
