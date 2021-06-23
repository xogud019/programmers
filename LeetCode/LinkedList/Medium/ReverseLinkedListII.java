package LeetCode.LinkedList.Medium;

import java.util.ArrayList;
import java.util.List;

/*
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:

Input: head = [5], left = 1, right = 1
Output: [5]
 

Constraints:

The number of nodes in the list is n.
1 <= n <= 500
-500 <= Node.val <= 500
1 <= left <= right <= n
 
*/
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        if(head.next == null) return head;
        
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        
        int idx = 1;
        
        while(temp != null){
            if(idx >= left && idx <= right) list.add(temp.val);
            
            if(temp.next == null) break;
            
            temp = temp.next;
            idx++;
        }
                
        ListNode answer = new ListNode();
        ListNode ptr = answer;
        
        //for(int i:list) System.out.println(i);
        int j = list.size()-1;
        
        for(int i=1; i<=idx; i++){
            if(i >= left && i <= right) answer.next = new ListNode(list.get(j--));
            else answer.next = new ListNode(head.val);
            
            head = head.next;
            answer = answer.next;
        }
        
        return ptr.next;
    }
}
