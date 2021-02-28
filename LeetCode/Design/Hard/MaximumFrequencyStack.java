package LeetCode.Design.Hard;

import java.util.HashMap;
import java.util.Stack;

public class MaximumFrequencyStack {
    ///*time limit
    class FreqStack {
        HashMap<Integer, Integer> map;
        Stack<Integer> main, serve;
        
        public FreqStack() {
            map = new HashMap<>();
            main = new Stack<>();
            serve = new Stack<>();
        }
        
        public void push(int x) {
            main.push(x);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        public int pop() {
            int sum = 0;
            int stkV = main.peek();
            int max = map.get(stkV), tempMax = map.get(stkV);
            
            //find max freq, cal sum of freq
            for(int i:map.keySet()){
                sum += map.get(i);
                if(map.get(i) > max) max = map.get(i);
            }
            //return main.pop(), if all elements have same freq
            if(map.size() - sum == 0){
                map.put(stkV, map.get(stkV)-1);
                if(map.get(stkV) == 0) map.remove(stkV);
                
                return main.pop();
            }
            //return main.pop(), if the last element is the max freq
            if(max == tempMax){
                map.put(stkV, map.get(stkV)-1);
                if(map.get(stkV) == 0) map.remove(stkV);
                
                return main.pop();
            }
            else{
                while(true){
                    serve.push(main.pop());
                    stkV = main.peek();
                    
                    if(map.get(stkV) == max){
                        main.pop();
                        map.put(stkV, map.get(stkV)-1);
                        if(map.get(stkV) == 0) map.remove(stkV);
                    
                        break;
                    }
                }
            
                while(!serve.isEmpty()) main.push(serve.pop());
            
                return stkV;
            }
        }
    }
    //*/
}
