package CodingTest.LeetCode.Tree.Easy;

import java.util.*;

public class IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode answer = new TreeNode(), node = answer;
        List<Integer> list = new ArrayList<>();
        
        inOrder(root,list);
        
        for(int i:list){
            node.right = new TreeNode(i);
            node = node.right;
        }
        
        return answer.right;
    }
    
    public static void inOrder(TreeNode root, List<Integer> list){
        if(root != null){
            inOrder(root.left,list);
            list.add(root.val);
            inOrder(root.right, list);
        }
    }
}
