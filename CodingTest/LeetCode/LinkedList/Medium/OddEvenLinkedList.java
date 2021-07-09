package CodingTest.LeetCode.LinkedList.Medium;
/*
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
 

Constraints:

The number of nodes in the linked list is in the range [0, 104].
-106 <= Node.val <= 106
 
*/
public class OddEvenLinkedList {
    /*
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode odd = head, even = head.next, temp = even;
        
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        
        odd.next = temp;
        
        return head;
    }
    */
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode temp = head, odd = new ListNode(), even = new ListNode(), answer = new ListNode(), oddTemp = new ListNode(), evenTemp = new ListNode();
        
        oddTemp.next = odd;
        evenTemp.next = even;
        
        int count = 1;
        
        while(temp != null){
            //System.out.println(temp.val);
            if(count%2==1){
                odd.next = new ListNode(temp.val);
                odd = odd.next;
            }
            else{
                even.next = new ListNode(temp.val);
                even = even.next;
            }
            
            temp = temp.next;
            count++;
        }
        even.next = null;
        
        oddTemp = oddTemp.next.next;
        evenTemp = evenTemp.next.next;
        answer.next = oddTemp;
        
        while(oddTemp.next != null) oddTemp = oddTemp.next;
        
        //System.out.println(oddTemp.val);
        
        oddTemp.next = evenTemp;
        
        return answer.next;
    }

    /*
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        if(head.next == null || head.next.next == null) return head;
        
        ListNode odd = new ListNode(head.val), even = new ListNode(head.next.val);
        head = head.next.next;
        ListNode answer = odd, evenTemp = even;
        
        int cnt = 0;
        while(head != null){
            if(cnt%2==0){
                odd.next = new ListNode(head.val);
                odd = odd.next;
            }
            else{
                even.next = new ListNode(head.val);
                even = even.next;
            }
            
            head = head.next;
            cnt++;
        }
        
        even.next = null;
        odd.next = evenTemp;
        
        return answer;
    }
    */
}
