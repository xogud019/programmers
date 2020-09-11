package LeetCode.Easy;
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode answer = new ListNode();
        root.next = answer;
        
        while(l1!=null||l2!=null){
            if(l1 != null && (l2 == null || l1.val <= l2.val)){
                answer.next = new ListNode(l1.val);
                l1 = l1.next;
                answer = answer.next;
            }
            else{
                answer.next = new ListNode(l2.val);
                l2 = l2.next;
                answer = answer.next;
            }
        }
        
        return root.next.next;
    }
}
