package CodingTest.LeetCode.Contest;

import java.util.LinkedList;

public class DesignFrontMiddleBackQueue {
    class FrontMiddleBackQueue {
        LinkedList<Integer> list;
        
        public FrontMiddleBackQueue() {
            list = new LinkedList<>();    
        }
        
        public void pushFront(int val) {
            list.offerFirst(val);
        }
        
        public void pushMiddle(int val) {
            int size = list.size();
            list.add(size/2, val);
        }
        
        public void pushBack(int val) {
            list.offerLast(val);
        }
        
        public int popFront() {
            if(list.size()==0) return -1;
            return list.removeFirst();
        }
        
        public int popMiddle() {
            if(list.size()==0) return -1;
            int size = list.size();
            if(size%2==1) return list.remove(size/2);
            else return list.remove(size/2-1);
        }
        
        public int popBack() {
            if(list.size()==0) return -1;
            return list.removeLast();
        }
    }
    
}
