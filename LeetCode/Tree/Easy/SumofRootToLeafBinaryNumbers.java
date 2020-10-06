package LeetCode.Tree.Easy;

public class SumofRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        int answer = 0;
        
        answer = dfs(root, 0);
        
        return answer;
    }
    
    public int dfs(TreeNode root, int sum){
        sum = sum*2 + root.val;
        
        if(root.left == null && root.right == null) return sum;
        
        int l = root.left == null ? 0 : dfs(root.left, sum);
        int r = root.right == null ? 0 : dfs(root.right, sum);

        return l+r;
    }
}
