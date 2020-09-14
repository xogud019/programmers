package LeetCode.Easy;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class SymmetricTree {
    /*using dfs
    public boolean isSymmetric(TreeNode root) {
        return dfs(root, root);
    }
    
    public boolean dfs(TreeNode n1, TreeNode n2){
        if(n1==null&&n2==null) return true;
        if(n1==null||n2==null) return false;
        
        return (n1.val==n2.val) && dfs(n1.left,n2.right) && dfs(n1.right,n2.left);
    }
    */
    //using bfs iteratively.
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode n1 = q.poll();
            TreeNode n2 = q.poll();
            
            if(n1==null&&n2==null) continue;
            if(n1==null||n2==null) return false;
            if(n1.val!=n2.val) return false;
            q.add(n1.left);
            q.add(n2.right);
            q.add(n2.left);
            q.add(n1.right);
        }
        
        return true;
    }
}
