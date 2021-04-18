package LeetCode.LinkedList.Medium;
/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Follow up: Could you do this in one pass?

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
*/
public class RemoveNthNodeFromEndOfList {
    /*two pass
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode answer = new ListNode(0);
        answer.next = head;
        ListNode temp = head;
        int len = 0;
        
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        temp = answer;
        len -= n;
        
        while(len > 0){
            temp = temp.next;
            len--;
        }
        
        temp.next = temp.next.next;
        
        return answer.next;
    }   
    */

    //one(actually two)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode answer = new ListNode(0);
        answer.next = head;
        ListNode first = answer, second = answer;
        
        for(int i=0; i<=n; i++) first = first.next;
        
        while(first != null){
            first = first.next;
            second = second.next;
        }
        
        second.next = second.next.next;
        
        return answer.next;
    }
}
