package LeetCode.LinkedList.Medium;

import java.util.ArrayList;
import java.util.List;

/*
Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

 

Example 1:


Input: head = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
Example 2:

Input: head = []
Output: []
Example 3:

Input: head = [0]
Output: [0]
Example 4:

Input: head = [1,3]
Output: [3,1]
 

Constraints:

The number of nodes in head is in the range [0, 2 * 104].
-10^5 <= Node.val <= 10^5
*/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ConvertSortedListToBinarySearchTree {
    //using arrayList = 1ms
    List<Integer> list;
    
    public TreeNode sortedListToBST(ListNode head) {
        list = new ArrayList<>();    
        
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        
        TreeNode root = dfs(null, 0, list.size()-1);
        return root;
    }
    
    public TreeNode dfs(TreeNode root, int left, int right){
        if(left > right) return null;
        int mid = left + (right - left)/2;
        
        if(root == null) root = new TreeNode(list.get(mid));

        root.left = dfs(root.left, left, mid -1);
        root.right = dfs(root.right, mid + 1, right);
        
        return root;
    }

    /* using array = 0ms
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        
        int count = 0;
        
        while(temp != null){
            temp = temp.next;
            count++;
        }
        
        int[] arr = new int[count];
        int idx = 0;
        
        while(head != null){
            arr[idx++] = head.val;
            head = head.next;
        }
        
        TreeNode root = dfs(null, arr, 0, count - 1);
        return root;
    }
    
    public TreeNode dfs(TreeNode root, int[] arr, int left, int right){
        if(left > right) return null;
        int mid = left + (right - left)/2;
        
        if(root == null) root = new TreeNode(arr[mid]);

        root.left = dfs(root.left, arr, left, mid -1);
        root.right = dfs(root.right, arr, mid + 1, right);
        
        return root;
    }
    */
}
