package LeetCode.Tree.Medium;

import java.util.HashMap;

/*
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.

 

Example 1:


Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
Example 2:

Input: preorder = [-1], inorder = [-1]
Output: [-1]
 

Constraints:

1 <= preorder.length <= 3000
inorder.length == preorder.length
-3000 <= preorder[i], inorder[i] <= 3000
preorder and inorder consist of unique values.
Each value of inorder also appears in preorder.
preorder is guaranteed to be the preorder traversal of the tree.
inorder is guaranteed to be the inorder traversal of the tree.
*/
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    HashMap<Integer, Integer> inorderMap;
    int idx;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        idx = 0;
        inorderMap = new HashMap<>();
        
        for(int i=0; i<inorder.length; i++) inorderMap.put(inorder[i], i);
        
        return makeTree(preorder, 0, preorder.length-1);
    }
    
    public TreeNode makeTree(int[] preorder, int left, int right){
        if(left > right) return null;
        
        int val = preorder[idx++];
        
        TreeNode root = new TreeNode(val);
        
        root.left = makeTree(preorder, left, inorderMap.get(val)-1);
        root.right = makeTree(preorder, inorderMap.get(val)+1, right);
        
        return root;
    }
}
