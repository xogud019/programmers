package LeetCode.Easy;

import java.util.*;

public class PalindromeLinkedList {
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
        /*
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
        */
        return true;
    }
}
