package LeetCode.LinkedList.Easy;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int mid = 0;
        int count = 0;
        int leng = len(temp);
        
        if(leng%2==0) mid = leng/2;
        else mid = leng/2;
        
        while(count != mid){
            count++;
            temp = temp.next;
        }
        
        ListNode answer = temp;
        
        return answer;
    }
    
    public int len(ListNode node){
        int count = 0;
        
        while(node != null){
            count++;
            node = node.next;
        }
        
        return count;
    }
}
