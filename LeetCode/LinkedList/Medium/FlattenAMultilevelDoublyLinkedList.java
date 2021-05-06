package LeetCode.LinkedList.Medium;

public class FlattenAMultilevelDoublyLinkedList {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    //iter
    public Node flatten(Node head) {
        Node cur = head;
        
        while(cur != null){
            if(cur.child == null){
                cur = cur.next;
                continue;
            }
            
            Node child = cur.child;
            
            while(child.next != null) child = child.next;
            
            child.next = cur.next;
            if(cur.next != null) cur.next.prev = child;
            cur.next = cur.child;
            cur.child.prev = cur;
            cur.child = null;
        }
        
        return head;
    }
}
