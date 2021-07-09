package CodingTest.LeetCode.LinkedList.Medium;

import java.util.ArrayList;

/*
You are given the head of a linked list, and an integer k.
Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]

Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]

Example 3:

Input: head = [1], k = 1
Output: [1]

Example 4:

Input: head = [1,2], k = 1
Output: [2,1]

Example 5:

Input: head = [1,2,3], k = 2
Output: [1,2,3]
 
Constraints:
1.The number of nodes in the list is n.
2.1 <= k <= n <= 105
3.0 <= Node.val <= 100
*/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SwappingNodesInALinkedList {
    //9ms 54.7m using list
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        
        //check length
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        
        int len = list.size();
        
        //return case
        if(len == 1 && k ==1) return head;
        
        //swap
        int num = list.get(k-1);
        list.set(k-1, list.get(len-k));
        list.set(len-k, num);
        
        ListNode point = new ListNode();
        ListNode answer = new ListNode(list.get(0));
        point.next = answer;
        int idx = 1;
        
        while(idx < len){
            answer.next = new ListNode(list.get(idx++));
            answer = answer.next;
        }
        
        return point.next;
    }
    /*4m 190m using listnode
    public ListNode swapNodes(ListNode head, int k) {
        ListNode front = head, back = null;
        int len = 0;
        
        while(front != null){
            front = front.next;
            len++;
        }
        
        len = len-k+1;
        
        front = head;
        back = head;
        
        while(k>1){
            k--;
            front = front.next;
        }
        
        while(len>1){
            len--;
            back = back.next;
        }
        
        
        int swap = front.val;
        front.val = back.val;
        back.val = swap;
        
        return head;
    }
    */
    /*8m 55m using array
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        
        //check length
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        //return case
        if(len == 1 && k ==1) return head;
        
        int[] arr = new int[len];
        
        temp = head;
        int idx = 0;
        //make val arr
        while(temp != null){
            arr[idx++] = temp.val;
            temp = temp.next;
        }
        
        //swap
        int num = arr[k-1];
        arr[k-1] = arr[len-k];
        arr[len-k] = num;
        
        ListNode point = new ListNode();
        ListNode answer = new ListNode(arr[0]);
        point.next = answer;
        idx = 1;
        
        while(idx < len){
            answer.next = new ListNode(arr[idx++]);
            answer = answer.next;
        }
        
        return point.next;
    }
    */
}
