package LeetCode.Tree.Hard;
/*
Given a binary tree, we install cameras on the nodes of the tree. 

Each camera at a node can monitor its parent, itself, and its immediate children.

Calculate the minimum number of cameras needed to monitor all nodes of the tree.

 

Example 1:


Input: [0,0,null,0,0]
Output: 1
Explanation: One camera is enough to monitor all nodes if placed as shown.
Example 2:


Input: [0,0,null,0,null,0,null,null,0]
Output: 2
Explanation: At least two cameras are needed to monitor all nodes of the tree. The above image shows one of the valid configurations of camera placement.

Note:

The number of nodes in the given tree will be in the range [1, 1000].
Every node has value 0.
*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeCameras {
    //using dfs - bottom up
    int answer;
    
    public int minCameraCover(TreeNode root) {
        answer = 0;
        
        answer = dfs(root) == 1? answer+1 : answer;
        
        return answer;
    }
    
    public int dfs(TreeNode root){
        if(root == null) return 0; //no need;
        
        if(root.left == null && root.right == null) return 1; // need1
        
        int l = dfs(root.left), r = dfs(root.right);
        
        if(l == 1 || r == 1){
            answer++;
            return 2;
        }
        //have2  coverd3
        if(l == 2 || r == 2) return 3;
        
        return 1;
    }
}
