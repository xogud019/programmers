package CodingTest.LeetCode.Tree.Easy;

public class SearchinaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val) return root;
        
        return val<root.val? searchBST(root.left, val):searchBST(root.right, val);
    }
}
