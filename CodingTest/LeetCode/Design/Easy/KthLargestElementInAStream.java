package CodingTest.LeetCode.Design.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class KthLargestElementInAStream {
    class KthLargest {
        int idx = 0;
        ArrayList<Integer> list;
        
        public KthLargest(int k, int[] nums) {
            list = new ArrayList<>();
            
            for(int i:nums) list.add(i);
            
            this.idx = k-1;
        }
        
        public int add(int val) {
            list.add(val);
            Collections.sort(list,Collections.reverseOrder());
            
            return list.get(idx);
        }
    }
}
