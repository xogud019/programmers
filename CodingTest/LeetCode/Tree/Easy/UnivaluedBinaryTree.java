package CodingTest.LeetCode.Tree.Easy;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        int base = root.val;
        
        return dfs(root,base);
    }
    
    public boolean dfs(TreeNode root, int base){
        if(root == null) return true;
        if(root.val != base) return false;
        
        return dfs(root.left, base)&&dfs(root.right, base);
    }
}
