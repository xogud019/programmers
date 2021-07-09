package CodingTest.LeetCode.Tree.Medium;

import java.util.ArrayList;
import java.util.List;

/*
You are given the root of a binary tree with n nodes, where each node is uniquely assigned a value from 1 to n. You are also given a sequence of n values voyage, which is the desired pre-order traversal of the binary tree.

Any node in the binary tree can be flipped by swapping its left and right subtrees. For example, flipping node 1 will have the following effect:


Flip the smallest number of nodes so that the pre-order traversal of the tree matches voyage.

Return a list of the values of all flipped nodes. You may return the answer in any order. If it is impossible to flip the nodes in the tree to make the pre-order traversal match voyage, return the list [-1].

 

Example 1:


Input: root = [1,2], voyage = [2,1]
Output: [-1]
Explanation: It is impossible to flip the nodes such that the pre-order traversal matches voyage.
Example 2:


Input: root = [1,2,3], voyage = [1,3,2]
Output: [1]
Explanation: Flipping node 1 swaps nodes 2 and 3, so the pre-order traversal matches voyage.
Example 3:


Input: root = [1,2,3], voyage = [1,2,3]
Output: []
Explanation: The tree's pre-order traversal already matches voyage, so no nodes need to be flipped.
 

Constraints:

The number of nodes in the tree is n.
n == voyage.length
1 <= n <= 100
1 <= Node.val, voyage[i] <= n
All the values in the tree are unique.
All the values in voyage are unique.
*/
public class FlipBinaryTreeToMatchPreorderTraversal {
    int idx;
    int[] arr;
    List<Integer> answer;
    
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        idx = 0;
        arr = voyage;
        answer = new ArrayList<>();
        boolean canFlip = dfs(root);
        
        if(!canFlip){
            answer = new ArrayList<>();
            answer.add(-1);
            return answer;
        }
        
        return answer;
    }
    
    public boolean dfs(TreeNode root){
        if(root == null) return true;;
        
        if(root.val == arr[idx]){
            idx++;
            int ptr = idx;
            
            boolean left = dfs(root.left);
            boolean right = dfs(root.right);
            
            if(left&&right) return true;
            
            idx = ptr;
            flip(root);
            answer.add(root.val);
            
            return dfs(root.left)&&dfs(root.right);
        }
        
        return false;
    }
    
    public void flip(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    /*failed case
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        
        if(equals(list, voyage)) return new ArrayList<>();
        
        int val = 1;
        int max = 0;
        
        for(int i:voyage) max = Math.max(max, i);
        
        while(val <= max){
            swap(root, val);
            list = new ArrayList<>();
            preOrder(root, list);
            
            if(equals(list, voyage)){
                List<Integer> answer = new ArrayList<>();
                answer.add(val);
                return answer;
            }
            swap(root, val);
            val++;
        }
        
        return new ArrayList<>(Arrays.asList(-1));
    }
    
    public void swap(TreeNode root, int val){
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            TreeNode node = q.peek();
            
            if(node.val == val){
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                break;
            }
            
            for(int i=0; i<size; i++){
                node = q.poll();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
    }
    
    public void preOrder(TreeNode root, List<Integer> list){
        if(root != null){
            list.add(root.val);
            preOrder(root.left, list);
            preOrder(root.right, list);
        }
    }
    
    public boolean equals(List<Integer> list, int[] arr){
        for(int i=0; i<arr.length; i++){
            if(list.get(i) != arr[i]) return false;
        }
        
        return true;
    }
    */
}
