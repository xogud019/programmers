package LeetCode.Tree.Medium;
/*
Return the root node of a binary search tree that matches the given preorder traversal.

(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)

It's guaranteed that for the given test cases there is always possible to find a binary search tree with the given requirements.

Example 1:

Input: [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]

Constraints:
1.1 <= preorder.length <= 100
2.1 <= preorder[i] <= 10^8
3.The values of preorder are distinct.
*/

public class ConstructBinarySearchTreeFromPreorderTraversal {
    class Solution {
        int idx;
        
        public TreeNode bstFromPreorder(int[] preorder) {
            idx = 0;
            
            return dfs(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        
        public TreeNode dfs(int[] preorder,int min, int max){
            if(idx == preorder.length) return null;
            
            int val = preorder[idx];
                    
            if(val < min || val > max) return null;
            
            idx++;
            
            TreeNode left = dfs(preorder, min, val);
            TreeNode right = dfs(preorder, val, max);
            
            TreeNode root = new TreeNode(val);
            
            root.left = left;
            root.right = right;
            
            return root;
        }
    }
}
