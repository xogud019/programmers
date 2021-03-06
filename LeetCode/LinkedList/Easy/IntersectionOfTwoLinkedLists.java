package LeetCode.LinkedList.Easy;
/*
Write a program to find the node at which the intersection of two singly linked lists begins.

Example 1:


Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Reference of the node with value = 8
Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 

Example 2:


Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Reference of the node with value = 2
Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
 

Example 3:


Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: null
Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.
 

Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Each value on each linked list is in the range [1, 10^9].
Your code should preferably run in O(n) time and use only O(1) memory.
*/
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB, curA = headA, curB = headB;
        int lenA = 0, lenB = 0;
        
        while(A!=null){
            lenA++;
            A = A.next;
        }
        
        while(B!=null){
            lenB++;
            B = B.next;
        }
        
        if(lenA > lenB){
            for(int i=0; i<lenA-lenB; i++){
                curA = curA.next;
            }
        }
        else if(lenB > lenA){
            for(int i=0; i<lenB-lenA; i++){
                curB = curB.next;
            }
        }
        
        while(curA != null){
            if(curA == curB) return curA;
            
            curA = curA.next;
            curB = curB.next;
        }
        
        return null;
    }
    /*
    //ex A = 4 1 8 4 5, B = 5 6 1 8 4 5
    //in while A = 4 1 8 4 5 + 5 6 1 8 4 5
    //in while B = 5 6 1 8 4 5 + 4 1 8 4 5
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA, tempB = headB;
        
        if(headA == null || headB == null) return null;
        
        boolean aliasA = false, aliasB = false;
        
        while(tempA != tempB){
            if(tempA.next == null){
                if(aliasA) return null;
                
                tempA = headB;
                aliasA = true;
            }
            else tempA  = tempA.next;
            
            if(tempB.next == null){
                if(aliasB) return null;
                
                tempB = headA;
                aliasB = true;
            }
            else tempB = tempB.next;
        }
        
        return tempA;
    }
    */
}

