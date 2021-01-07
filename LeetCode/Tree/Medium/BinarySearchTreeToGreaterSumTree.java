package LeetCode.Tree.Medium;

public class BinarySearchTreeToGreaterSumTree {
    class Solution {
        int sum;
        
        public TreeNode bstToGst(TreeNode root) {
            sum = 0;
            dfs(root);
            
            return root;
        }
        
        public void dfs(TreeNode root){
            if(root == null) return;
                    
            dfs(root.right);
            sum += root.val;
            root.val = sum;
            dfs(root.left);
        }
    }
}
