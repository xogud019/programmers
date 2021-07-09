package CodingTest.LeetCode.Tree.Medium;

import java.util.HashMap;

/*
Return any binary tree that matches the given preorder and postorder traversals.

Values in the traversals pre and post are distinct positive integers.

 

Example 1:

Input: pre = [1,2,4,5,3,6,7], post = [4,5,2,6,7,3,1]
Output: [1,2,3,4,5,6,7]
 

Note:

1 <= pre.length == post.length <= 30
pre[] and post[] are both permutations of 1, 2, ..., pre.length.
It is guaranteed an answer exists. If there exists multiple answers, you can return any of them.
*/
public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {
    HashMap<Integer, Integer> map;
    int idx;
    
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        map = new HashMap<>();
        idx = 0;
        
        for(int i=0; i<post.length; i++) map.put(post[i], i);
        
        return makeTree(pre, 0, post.length-1);
    }
    
    public TreeNode makeTree(int[] pre, int left, int right){
        if(left > right) return null;
        
        TreeNode root = new TreeNode(pre[idx++]);
        
        if(left == right) return root;
        
        int index = map.get(pre[idx]);
        
        root.left = makeTree(pre, left, index);
        root.right = makeTree(pre, index+1, right-1);
        
        return root;
    }
}
