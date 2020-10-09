package LeetCode.Tree.Easy;

import java.util.*;

public class TwoSumIVInputIsABST {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        
        return sumEquals(root, k, set);
    }
    
    public boolean sumEquals(TreeNode root, int k, Set<Integer> set){
        if(root == null) return false;
        
        if(set.contains(k-root.val)) return true;
                        
        set.add(root.val);
        
        return sumEquals(root.left, k, set) || sumEquals(root.right, k, set);
    }
    /*failed case
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        dfs(root, k, list, set);
        
        for(int i:list){
            if(set.contains(i)) return true;
        }
        
        return false;
    }
    
    public void dfs(TreeNode root, int k, List<Integer> list, Set<Integer> set){
        if(root != null){
            list.add(root.val);
            set.add(k-root.val);
            dfs(root.left, k, list, set);
            dfs(root.right, k, list, set);
        }
    }
    */
}
