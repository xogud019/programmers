package CodingTest.LeetCode.Tree.Medium;

import java.util.HashMap;
/*
Given a binary tree, return the sum of values of nodes with even-valued grandparent.  (A grandparent of a node is the parent of its parent, if it exists.)
If there are no nodes with an even-valued grandparent, return 0. 

Example 1:

Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
Output: 18
Explanation: The red nodes are the nodes with even-value grandparent while the blue nodes are the even-value grandparents.
 

Constraints:
1.The number of nodes in the tree is between 1 and 10^4.
2.The value of nodes is between 1 and 100.
*/
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
