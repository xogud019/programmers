package LeetCode.Tree.Easy;

import java.util.*;

public class MinimumAbsoluteDifferenceInBST {
    //speed 5, memory 15;
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int answer = Integer.MAX_VALUE;
        
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                answer = Math.min(answer, Math.abs(list.get(j)-list.get(i)));
            }
        }
        
        return answer;
    }
    
    public void inOrder(TreeNode root, List<Integer> list){
        if(root != null){
            list.add(root.val);
            inOrder(root.left, list);
            inOrder(root.right, list);
        }
    }
}
