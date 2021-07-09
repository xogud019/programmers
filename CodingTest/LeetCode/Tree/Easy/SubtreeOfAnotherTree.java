package CodingTest.LeetCode.Tree.Easy;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return s != null && (equals(s,t)|| isSubtree(s.left,t) || isSubtree(s.right,t));
    }
    
    public boolean equals(TreeNode l, TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r==null) return false;
        
        return l.val==r.val && equals(l.left, r.left) && equals(l.right, r.right);
    }
}
