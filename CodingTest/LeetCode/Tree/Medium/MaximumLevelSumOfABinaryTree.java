package CodingTest.LeetCode.Tree.Medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
/*
Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

Return the smallest level x such that the sum of all the values of nodes at level x is maximal.

Example 1:

Input: root = [1,7,0,7,-8,null,null]
Output: 2
Explanation: 
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.

Example 2:

Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
Output: 2
 

Constraints:
1.The number of nodes in the tree is in the range [1, 104].
2.-105 <= Node.val <= 105
*/
public class MaximumLevelSumOfABinaryTree {
    class Node{
        TreeNode node;
        int level;
        
        public Node(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public int maxLevelSum(TreeNode root) {
        Queue<Node> q = new LinkedList<>();
        int answer = 0 , max = Integer.MIN_VALUE, prevLevel = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(0,max);    
        q.add(new Node(root,1));
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            
            if(temp.level == prevLevel+1){
                int val = map.get(prevLevel);
                
                if(max < val){
                    max = val;
                    answer = prevLevel;
                }
            }
            
            prevLevel = temp.level;
            
            if(temp.node.left != null) q.add(new Node(temp.node.left, temp.level+1));
            if(temp.node.right != null) q.add(new Node(temp.node.right, temp.level+1));

            map.put(temp.level, map.getOrDefault(temp.level,0)+temp.node.val);
        }
        
        if(max < map.get(prevLevel)) answer = prevLevel;
        
        return answer;
    }
}
