package LeetCode.Tree.Medium;

import java.util.HashMap;

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
