package LeetCode.Tree.Easy;

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
}
