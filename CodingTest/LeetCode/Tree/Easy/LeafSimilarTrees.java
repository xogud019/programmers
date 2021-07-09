package CodingTest.LeetCode.Tree.Easy;

import java.util.*;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        dfs(root1, list1);
        dfs(root2, list2);
        
        return list1.equals(list2);
    }
    
    public void dfs(TreeNode root, List<Integer> list){
        if(root != null){
            if(root.left == null && root.right == null){
                list.add(root.val);
            }
            
            dfs(root.left, list);
            dfs(root.right, list);
        }
    }
}
