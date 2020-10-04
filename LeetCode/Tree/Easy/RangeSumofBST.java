package LeetCode.Tree.Easy;

public class RangeSumofBST {
    static int sum = 0;
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return 0;
        
        return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R) + ((root.val>=L&&root.val<=R) ? root.val:0);
    }
}
