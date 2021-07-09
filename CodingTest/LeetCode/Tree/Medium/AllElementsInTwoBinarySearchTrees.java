package CodingTest.LeetCode.Tree.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Given two binary search trees root1 and root2.
Return a list containing all the integers from both trees sorted in ascending order.

Example 1:

Input: root1 = [2,1,4], root2 = [1,0,3]
Output: [0,1,1,2,3,4]

Example 2:

Input: root1 = [0,-10,10], root2 = [5,1,7,0,2]
Output: [-10,0,0,1,2,5,7,10]

Example 3:

Input: root1 = [], root2 = [5,1,7,0,2]
Output: [0,1,2,5,7]

Example 4:

Input: root1 = [0,-10,10], root2 = []
Output: [-10,0,10]

Example 5:

Input: root1 = [1,null,8], root2 = [8,1]
Output: [1,1,8,8]

Constraints:
1.Each tree has at most 5000 nodes.
2.Each node's value is between [-10^5, 10^5].
*/
public class AllElementsInTwoBinarySearchTrees {
    ArrayList<Integer> list;
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        list = new ArrayList<>();
        
        preOrder(root1);
        preOrder(root2);
        
        Collections.sort(list);
        
        return list;
    }
    
    public void preOrder(TreeNode root){
        if(root != null){
            list.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
