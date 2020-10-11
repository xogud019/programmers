package LeetCode.Tree.Easy;

public class BinaryTreeTilt {
    static int answer;
    public int findTilt(TreeNode root) {
        answer = 0;
        
        tilt(root);
        
        return answer;
    }
    
    public int tilt(TreeNode root){
        if(root == null) return 0;
        
        int left = tilt(root.left);
        int right = tilt(root.right);
        
        answer += Math.abs(left-right);
        
        return left+right+root.val;
    }
}
