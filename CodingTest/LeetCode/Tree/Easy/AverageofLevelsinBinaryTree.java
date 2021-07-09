package CodingTest.LeetCode.Tree.Easy;
/*
Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
Note:
The range of node's value is in the range of 32-bit signed integer.
*/
import java.util.*;

public class AverageofLevelsinBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            double sum = 0, count = 0;
            Queue<TreeNode> tempQ = new LinkedList<>();
            
            while(!q.isEmpty()){
                TreeNode temp = q.poll();
                sum += temp.val;
                count++;
                
                if(temp.left != null) tempQ.add(temp.left);
                if(temp.right != null) tempQ.add(temp.right);
            }
            
            q = tempQ;
            list.add(sum/count);
        }
        
        return list;
    }
    /*
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            double avg = 0;
            int size = q.size();
            
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                avg += node.val;
                
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            
            answer.add(avg/size);
        }
        
        return answer;
    }
    */
}

