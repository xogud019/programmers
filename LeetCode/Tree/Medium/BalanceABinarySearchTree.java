package LeetCode.Tree.Medium;
/*
Given a binary search tree, return a balanced binary search tree with the same node values.

A binary search tree is balanced if and only if the depth of the two subtrees of every node never differ by more than 1.

If there is more than one answer, return any of them.

 

Example 1:



Input: root = [1,null,2,null,3,null,4,null,null]
Output: [2,1,3,null,null,null,4]
Explanation: This is not the only correct answer, [3,1,4,null,2,null,null] is also correct.
 

Constraints:

The number of nodes in the tree is between 1 and 10^4.
The tree nodes will have distinct values between 1 and 10^5.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//not yet
public class BalanceABinarySearchTree {
    /*failed case
    static TreeNode answer;
    
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) return null;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            TreeNode temp;
            
            for(int i=0; i<size; i++){
                temp = q.poll();
                list.add(temp.val);
                
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        
        Collections.sort(list);
        //this part maybe reason
        int rootIdx = list.size()/2;
        int rootVal = list.get(rootIdx);
        list.remove(rootIdx);
        answer = new TreeNode(rootVal);
        
        for(int i:list){
            addNode(i);
        }
        
        return answer;
    }
    
    public void addNode(int val){
        TreeNode node = new TreeNode(val);
        
        if(answer == null) answer = node;
        else{
            TreeNode cur = answer;
            TreeNode parent;
            
            while(true){
                parent = cur;
                
                if(val < parent.val){
                    cur = parent.left;
                    
                    if(cur == null){
                        parent.left = node;
                        return;
                    }
                }
                else{
                    cur = parent.right;
                    
                    if(cur == null){
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }
    */
    static TreeNode answer;
    
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) return null;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            TreeNode temp;
            
            for(int i=0; i<size; i++){
                temp = q.poll();
                list.add(temp.val);
                
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        
        Collections.sort(list);
        
        answer = create(list,0,list.size()-1);
        
        return answer;
    }
    
    public TreeNode create(List<Integer> list, int start, int end){
        if(end < start) return null;
        if(start == end) return new TreeNode(list.get(start));
        else{
            int mid = (start+end)/2;
            return new TreeNode(list.get(mid),create(list,start, mid-1),create(list, mid+1, end));
        }
    }
}
