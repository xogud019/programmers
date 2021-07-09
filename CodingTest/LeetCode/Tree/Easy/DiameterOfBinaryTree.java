package CodingTest.LeetCode.Tree.Easy;

public class DiameterOfBinaryTree {
    static int answer;
    public int diameterOfBinaryTree(TreeNode root) {
        answer = 0;
        
        dfs(root);
        
        return answer;
    }
    
    public int dfs(TreeNode root){
        if(root == null) return 0;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        answer = Math.max(answer, left+right);
        
        return Math.max(left,right)+1;
    }
}
