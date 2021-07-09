package CodingTest.LeetCode.Tree.Easy;

import java.util.ArrayList;
import java.util.List;
/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
Example 4:


Input: root = [1,2]
Output: [2,1]
Example 5:


Input: root = [1,null,2]
Output: [1,2]
 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 

Follow up: Recursive solution is trivial, could you do it iteratively?
*/
public class BinaryTreeInorderTraversal {
    //recursion
    List<Integer> answer;
    
    public List<Integer> inorderTraversal(TreeNode root) {
        answer = new ArrayList<>();
        
        inorder(root);
        
        return answer;
    }
    
    public void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            answer.add(root.val);
            inorder(root.right);
        }
    }

    /*iteration
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        
        while(root != null || !stk.isEmpty()){
            while(root != null){
                stk.push(root);
                root = root.left;
            }
            
            root = stk.pop();
            answer.add(root.val);
            
            root = root.right;
        }
        
        return answer;
    }
    */
}
