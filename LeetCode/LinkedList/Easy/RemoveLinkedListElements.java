package LeetCode.LinkedList.Easy;
/*
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
*/
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null&&head.val == val) head = head.next;
        
        ListNode temp = head;
            
        while(temp != null){
            if(temp.next != null && temp.next.val == val) temp.next = temp.next.next;
            else temp = temp.next;
        }
        
        return head;
    }
}
