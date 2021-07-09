package CodingTest.LeetCode.Design.Easy;

import java.util.ArrayList;
import java.util.List;

public class DesignHashSet {
    class MyHashSet {
        List<Integer> list;
        /** Initialize your data structure here. */
        public MyHashSet() {
            list = new ArrayList<>();
        }
        
        public void add(int key) {
            if(!list.contains(key)) list.add(key);
        }
        
        public void remove(int key) {
            for(int i=0; i<list.size(); i++){
                if(list.get(i)==key){
                    list.remove(i);
                    break;
                }
            }
        }
        
        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            if(list.contains(key)) return true;
            else return false;
        }
    }
}
