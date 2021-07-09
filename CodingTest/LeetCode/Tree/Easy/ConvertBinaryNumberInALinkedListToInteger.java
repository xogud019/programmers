package CodingTest.LeetCode.Tree.Easy;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        String bit = "";
        
        while(head != null){
            bit += ""+head.val;
            
            head = head.next;
        }
        
        
        return Integer.parseInt(bit,2);
    }
}
