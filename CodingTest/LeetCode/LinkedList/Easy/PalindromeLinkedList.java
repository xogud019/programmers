package CodingTest.LeetCode.LinkedList.Easy;

import java.util.ArrayList;
import java.util.List;

/*
Given the head of a singly linked list, return true if it is a palindrome.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
*/
public class PalindromeLinkedList {
    //using list
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        
        int lo = 0, hi = list.size()-1;
        
        while(lo <= hi){
            if(list.get(lo++) != list.get(hi--)) return false;
        }
        
        return true;
    }
    /*using stack
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        if(head.next == null) return true;
        
        Stack<Integer> stk = new Stack<>();
        ListNode node = head;
        
        while(node != null){
            stk.push(node.val);
            node = node.next;
        }
        
        while(head != null){
            if(stk.peek()==head.val){
                stk.pop();
                head = head.next;
            }
            else return false;
        }
        //
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
        //
        return true;
    }
    */
    /*using StringBuilder
     public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        if(head.next == null) return true;
        
        StringBuilder sb = new StringBuilder();
        
        while(head != null){
            sb.append(""+head.val);
            head = head.next;
        }
        
        String left = sb.substring(0, sb.length()/2);
        String right = sb.reverse().substring(0, sb.length()/2);
        //System.out.println(left+" "+right);
        return left.equals(right);
    }
    */
}
