package LeetCode.Tree.Medium;

import java.util.HashMap;

public class SumOfNodesWithEvenValuedGrandparent {
    class Solution {
        HashMap<TreeNode,TreeNode> map; 
        int sum;
        
        public int sumEvenGrandparent(TreeNode root) {
            map = new HashMap<>();
            sum = 0;
            dfs(root,null);
            
            return sum;
        }
        
        public void dfs(TreeNode child, TreeNode parent){
            if(child == null) return;
            
            map.put(child, parent);
            dfs(child.left, child);
            dfs(child.right, child);
            
            if(parent != null && map.containsKey(parent)){
                TreeNode grant = map.get(parent);
                if(grant != null && grant.val%2 == 0){
                    sum += child.val;
                }
            }
        }
    }
}
