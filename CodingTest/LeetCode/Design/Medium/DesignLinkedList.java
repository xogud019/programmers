package CodingTest.LeetCode.Design.Medium;

import java.util.Arrays;
/*
Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement the MyLinkedList class:

MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 

Example 1:

Input
["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
[[], [1], [3], [1, 2], [1], [1], [1]]
Output
[null, null, null, null, 2, null, 3]

Explanation
MyLinkedList myLinkedList = new MyLinkedList();
myLinkedList.addAtHead(1);
myLinkedList.addAtTail(3);
myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
myLinkedList.get(1);              // return 2
myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
myLinkedList.get(1);              // return 3
 

Constraints:

0 <= index, val <= 1000
Please do not use the built-in LinkedList library.
At most 2000 calls will be made to get, addAtHead, addAtTail, addAtIndex and deleteAtIndex.
*/
public class DesignLinkedList {
    //using array
    class MyLinkedList {
        int[] arr = new int[2001];
        int len = 0;
        /** Initialize your data structure here. */
        public MyLinkedList() {
            Arrays.fill(arr, -1);
        }
        
        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            return arr[index];
        }
        
        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            for(int i=len; i>0; i--) arr[i] = arr[i-1];
            
            len++;
            arr[0] = val;
        }
        
        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            arr[len++] = val;
        }
        
        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            for(int i=len; i>index; i--) arr[i] = arr[i-1];
            
            arr[index] = val;
            len++;
        }
        
        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if(arr[index] == -1) return;
            
            for(int i=index; i<len; i++) arr[i] = arr[i+1];
            
            arr[len--] = -1;
        }
    }

    /*slngly linked list
    
    class ListNode{
        int val;
        ListNode next;
        
        public ListNode(){}
        
        public ListNode(int val){
            this.val = val;
        }
        
        public int getVal(){
            return this.val;
        }
    }
    class MyLinkedList {
        ListNode head;
        int len;
        /** Initialize your data structure here. 
        public MyLinkedList() {
            head = new ListNode();
            len = 0;
        }
        
        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. 
        public int get(int index) {
            if(index >= len) return -1;
            
            ListNode temp = head.next;
            
            int idx = 0;
            
            while(idx < index){
                idx++;
                temp = temp.next;
            }
            
            return temp.getVal();
        }
        
        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. 
        public void addAtHead(int val) {
            ListNode temp = new ListNode(val);
            
            temp.next = head.next;
            head.next = temp;
            len++;
        }
        
        /** Append a node of value val to the last element of the linked list.
        public void addAtTail(int val) {
            ListNode temp = new ListNode(val), prev = head, copy = head.next;
            
            while(copy != null){
                prev = copy;
                copy = copy.next;
            }
            
            prev.next = temp;
            len++;
        }
        
        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. 
        public void addAtIndex(int index, int val) {
            if(index > len) return;
            
            int idx = 0;
            ListNode prev = head, copy = head.next;
            
            while(idx < index){
                prev = copy;
                copy = copy.next;
                idx++;
            }
            
            ListNode temp = new ListNode(val);
            temp.next = copy;
            prev.next = temp;
            len++;
            
        }
        
        /** Delete the index-th node in the linked list, if the index is valid.
        public void deleteAtIndex(int index) {
            if(index >= len) return;
            
            int idx = 0;
            ListNode prev = head, copy = head.next;
            
            while(idx < index){
                prev = copy;
                copy = copy.next;
                idx++;
            }
            
            prev.next = copy.next;
            len--;
        }
    }
    */

    /*doubly linked list
    class ListNode{
        ListNode prev, next;
        int val;
            
        ListNode(){}
            
        ListNode(int val){
            this.val = val;
            prev = null;
            next = null;
        }
        
        public int getVal(){
            return this.val;
        }
    }

    class MyLinkedList {
        ListNode head;
        int size;
        /** Initialize your data structure here. 
        public MyLinkedList() {
            head = new ListNode();
            size = 0;
        }
        
        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. 
        public int get(int index) {
            if(index >= size) return -1;
            
            ListNode temp = head;
            int idx = 0;
            
            while(idx <= index){
                temp = temp.next;
                idx++;
            }
            
            return temp.getVal();
        }
        
        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. 
        public void addAtHead(int val) {
            ListNode temp = head, node = new ListNode(val);
            
            node.next = temp.next;
            if(temp.next != null) node.prev = temp.next.prev;
            temp.next = node;
            if(node.next != null) node.next.prev = node;
            
            size++;
        }
        
        /** Append a node of value val to the last element of the linked list. 
        public void addAtTail(int val) {
            ListNode temp = head, node = new ListNode(val);
            
            while(temp.next != null) temp = temp.next;
            
            temp.next = node;
            node.prev = temp; 
            
            size++;
        }
        
        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. 
        public void addAtIndex(int index, int val) {
            if(index > size) return;
            
            ListNode temp = head, node = new ListNode(val);
            
            int idx = 0;
            
            while(idx < index){
                temp = temp.next;
                idx++;
            }
            
            node.next = temp.next;
            if(temp.next != null) node.prev = temp.next.prev;
            temp.next = node;
            if(node.next != null) node.next.prev = node;
            
            size++;
        }
        
        /** Delete the index-th node in the linked list, if the index is valid. 
        public void deleteAtIndex(int index) {
            if(index >= size) return;
            
            ListNode temp = head;
            int idx = 0;
            
            while(idx < index){
                temp = temp.next;
                idx++;
            }
            
            if(temp.next.next != null) temp.next.next.prev = temp;
            if(temp.next.next != null) temp.next = temp.next.next;
            else temp.next = null;
            size--;
        }
    }
    */
}
