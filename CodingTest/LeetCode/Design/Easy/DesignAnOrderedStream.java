package CodingTest.LeetCode.Design.Easy;

import java.util.ArrayList;
import java.util.List;

public class DesignAnOrderedStream {
    class OrderedStream {
        String[] stream;
        int ptr;
        int last;
        public OrderedStream(int n) {
            stream = new String[n];
            ptr = 1;
            last = 0;
        }
        
        public List<String> insert(int id, String value) {
            List<String> list = new ArrayList<>();
            stream[id-1] = value;
            int index = ptr;
            
            while(ptr<=stream.length&&stream[ptr-1]!=null){
                ptr++;
            }
            
            if(stream[index-1] == null) return list;
            else{
                for(int i=last; i<ptr-1; i++){
                    list.add(stream[i]);
                    last = i+1;
                }
                return list;
            }
        }
    }
    
}
