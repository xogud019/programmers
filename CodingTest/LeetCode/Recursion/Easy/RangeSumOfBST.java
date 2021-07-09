package CodingTest.LeetCode.Recursion.Easy;

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

public class RangeSumOfBST {
    static int sum = 0;
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return 0;
        
        return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R) + ((root.val>=L&&root.val<=R) ? root.val:0);
    }
}
