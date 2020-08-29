package LeetCode.Medium;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; } 
}

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
}