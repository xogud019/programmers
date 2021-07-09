package CodingTest.LeetCode.Tree.Easy;

import java.util.*;

public class FindModeInBinarySearchTree {
    Map<Integer, Integer> map;

    public int[] findMode(TreeNode root) {
        if(root == null){
            int[] answer = new int[0];
            return answer;
        }
        
        map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int[] answer;
        inOrder(root);
        
        int max = 0;
        
        for(int i : map.keySet()){
            max = Math.max(max, map.get(i));
        }
        
        for(int i: map.keySet()){
            if(map.get(i)==max){
                list.add(i);
            }
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public void inOrder(TreeNode root){
        if(root != null){
            map.put(root.val, map.getOrDefault(root.val, 0)+1);
            inOrder(root.left);
            inOrder(root.right);
        }
    }
}
