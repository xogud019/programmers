package LeetCode.Tree.Easy;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        return Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right); 
    }
    
    public int dfs(TreeNode root){
        if(root == null) return 0;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        return Math.max(left, right)+1;
    }
}
