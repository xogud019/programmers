package CodingTest.LeetCode.LinkedList.Easy;
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
    /*
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        
        while(cur != null && cur.next != null){
            if(cur.next.val == val) cur.next = cur.next.next;
            else cur = cur.next;
        }
        
        return dummy.next;
    }
    */
}
