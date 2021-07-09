package CodingTest.LeetCode.LinkedList.Medium;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/
public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode root = new ListNode();
        root.next = answer;
        int temp = 0;
        
        while(l1!=null|| l2!=null){
            int x = l1 != null? l1.val:0;
            int y = l2 != null? l2.val:0;
            int data = x+y+temp;
            
            if(data>=10){
                answer.next = new ListNode(data%10);
                temp = data/10;
            }
            else{
                answer.next = new ListNode(data);
                temp = 0;
            }
            
            answer = answer.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            
        }
        
        if(temp!=0){
            answer.next = new ListNode(temp);
        }
        
        return root.next.next;
    }

    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rnd = 0;
        ListNode temp = new ListNode();
        ListNode answer = temp;
        
        while(l1 != null || l2 != null){
            int v1 = l1 == null? 0 : l1.val, v2 = l2 == null? 0 : l2.val;
            int v = v1 + v2 + rnd;
            
            if(v > 9){
                temp.next = new ListNode(v%10);
                rnd = v/10;
            }
            else{
                temp.next = new ListNode(v);
                rnd = 0;
            }
            
            temp = temp.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        
        if(rnd != 0) temp.next = new ListNode(rnd);
        
        return answer.next;
    }
    */
}