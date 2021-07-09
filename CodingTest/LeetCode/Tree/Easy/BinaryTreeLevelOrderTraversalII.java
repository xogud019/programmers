package CodingTest.LeetCode.Tree.Easy;

import java.util.*;
/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000
*/
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();
        List<List<Integer>> temp = new ArrayList<>();
        List<Integer> list;
        
        if(root == null) return answer;
        
        q.add(root);
        list = new ArrayList<>();
        list.add(root.val);
        temp.add(list);
        
        while(!q.isEmpty()){
            int size = q.size();
            list = new ArrayList<>();
            
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                
                if(node.left != null){
                    q.add(node.left);    
                    list.add(node.left.val);
                } 
                
                if(node.right != null){
                    q.add(node.right);   
                    list.add(node.right.val);
                }
            }
            
            if(list.size() != 0) temp.add(list);
        }
        
        for(int i=temp.size()-1; i>=0; i--) answer.add(temp.get(i));
        
        return answer;
    }

    /*
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list;
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            list = new ArrayList<>();
            
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                
                list.add(node.val);
            }
            
            answer.add(list);
        }
        
        return answer;
    }
    */
}
