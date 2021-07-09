package CodingTest.LeetCode.Tree.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example:

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
*/
public class BinaryTreeRightSideView {
    //BFS
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null) return list;
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                if(i==size-1) list.add(temp.val);
                
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        
        return list;
    }
    /*DFS
    List<Integer> list;
    
    public List<Integer> rightSideView(TreeNode root) {
        list = new ArrayList<>();
        
        dfs(root,0);
        
        return list;
    }
    
    public void dfs(TreeNode root, int level){
        if(root == null) return;
        
        if(list.size() == level) list.add(root.val);
        dfs(root.right, level+1);
        dfs(root.left, level+1);
    }
    */
}
