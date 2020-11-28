package LeetCode.Contest;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp2 = new ListNode();
        ListNode answer = list1;
        
        while(list1 != null){
            if(list1.next != null &&list1.next.val == a){
                temp2.next = list1.next;
                list1.next = list2;
                break;
            }
            
            list1 = list1.next;
        }
        
        while(list2.next != null){
            list2 = list2.next;
        }
        
        while(temp2 != null){
            if(temp2.val == b+1){
                list2.next = temp2;
                break;
            }
            
            temp2 = temp2.next;
        }
        return answer;
    }
}
