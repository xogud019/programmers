package LeetCode.Tree.Easy;

public class SumOfLeftLeaves {
    static int answer;
    public int sumOfLeftLeaves(TreeNode root) {
        answer = 0;
        
        dfs(root, 0);
        
        return answer;
    }
    
    public void dfs(TreeNode root, int dir){
        if(root == null) return;
        if(dir== -1 && (root.left == null && root.right == null)){
            answer += root.val;
            return;
        }
        
        dfs(root.left, -1);
        dfs(root.right, 1);
    }
}
