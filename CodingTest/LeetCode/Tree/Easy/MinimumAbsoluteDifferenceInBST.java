package CodingTest.LeetCode.Tree.Easy;

import java.util.*;

public class MinimumAbsoluteDifferenceInBST {
    /*
    static int prev;
    static int answer;
    public int getMinimumDifference(TreeNode root) {
        answer = Integer.MAX_VALUE;
        prev = -1;
        
        dfs(root);
        
        return answer;
    }
    
    public void dfs(TreeNode root){
        if(root == null) return;
        
        dfs(root.left);
        
        if(prev != -1){
            answer = Math.min(answer, Math.abs(prev-root.val));
        }
        
        prev = root.val;
        
        dfs(root.right);
    }
    */
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
