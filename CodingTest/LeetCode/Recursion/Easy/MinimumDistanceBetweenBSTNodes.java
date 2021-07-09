package CodingTest.LeetCode.Recursion.Easy;

public class MinimumDistanceBetweenBSTNodes {
    static int answer;
    static Integer prev;
    
    public int minDiffInBST(TreeNode root) {
        answer = Integer.MAX_VALUE;
        prev = null;
        dfs(root);
        
        return answer;
    }
    
    public void dfs(TreeNode root){
        if(root == null) return;
        
        dfs(root.left);
        
        if(prev != null){
            answer = Math.min(answer, root.val-prev);
        }
        
        prev = root.val;
        
        dfs(root.right);
    }
}
