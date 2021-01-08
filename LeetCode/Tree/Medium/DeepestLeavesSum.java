package LeetCode.Tree.Medium;

import java.util.HashMap;
/*
Given a binary tree, return the sum of values of its deepest leaves.
 
Example 1:

Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
Output: 15

Constraints:
1.The number of nodes in the tree is between 1 and 10^4.
2.The value of nodes is between 1 and 100.
*/
public class DeepestLeavesSum {
    class Solution {
        HashMap<Integer, Integer> map;
        
        public int deepestLeavesSum(TreeNode root) {
            map = new HashMap<>();
            int maxKey = 0;
            
            dfs(root, 0);
            
            for(int i:map.keySet()) maxKey = Math.max(i,maxKey);
            
            return map.get(maxKey);
            
        }
        
        public void dfs(TreeNode node, int level){
            if(node == null) return;
        
            dfs(node.left, level+1);
            dfs(node.right, level+1);
            
            if(node.left == null && node.right == null){
                //System.out.println(level+" "+node.val);
                map.put(level, map.getOrDefault(level, 0)+node.val);
            }
        }
    }
}
