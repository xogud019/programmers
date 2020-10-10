package LeetCode.Tree.Easy;

import java.util.*;

public class BinaryTreePaths {
    static List<String> list;
    public List<String> binaryTreePaths(TreeNode root) {
        list = new ArrayList<>();
        String route = "";
        
        dfs(root, route);
        
        return list;
    }
    
    public void dfs(TreeNode root, String s){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(s+root.val);
            return;
        }
        s += root.val + "->";
        
        dfs(root.left, s);
        dfs(root.right, s);
    }
}
