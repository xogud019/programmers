package LeetCode.LinkedList.Easy;
/*
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

 

Example 1:


Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: l1 = [], l2 = []
Output: []
Example 3:

Input: l1 = [], l2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both l1 and l2 are sorted in non-decreasing order.
*/
public class MergeTwoSortedLists {
    //reduce iterate
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode answer = new ListNode();
        root.next = answer;
        
        while(l1!=null||l2!=null){
            if(l1 != null && (l2 == null || l1.val <= l2.val)){
                answer.next = new ListNode(l1.val);
                l1 = l1.next;
                answer = answer.next;
            }
            else{
                answer.next = new ListNode(l2.val);
                l2 = l2.next;
                answer = answer.next;
            }
        }
        
        return root.next.next;
    }

    /*brute force iterate
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode temp = new ListNode(), answer = new ListNode();
        answer = temp;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
                temp = temp.next;
            }
            else{
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
                temp = temp.next;
            }
        }
        
        if(l2 == null){
            while(l1 != null){
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
                temp = temp.next;
            }
        }
        else{
            while(l2 != null){
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
                temp = temp.next;
            }
        }
        
        return answer.next;
    }
    */
}
