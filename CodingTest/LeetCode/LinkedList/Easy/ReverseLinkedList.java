package CodingTest.LeetCode.LinkedList.Easy;
/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 

Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
*/
public class ReverseLinkedList {
    //iterate
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        
        return prev;
    }

    /*recursion
    ListNode temp;
    
    public ListNode reverseList(ListNode head) {
        temp = new ListNode();    
        ListNode answer = temp;
        
        dfs(head);
        
        return answer.next;
    }
    
    public void dfs(ListNode head){
        if(head == null) return;
        
        dfs(head.next);
        temp.next = new ListNode(head.val);
        temp = temp.next;
        
        return;
    }
    */
}
