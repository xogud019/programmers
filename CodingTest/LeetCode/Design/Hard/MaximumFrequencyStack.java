package CodingTest.LeetCode.Design.Hard;
/*
Implement FreqStack, a class which simulates the operation of a stack-like data structure.

FreqStack has two functions:

push(int x), which pushes an integer x onto the stack.
pop(), which removes and returns the most frequent element in the stack.
If there is a tie for most frequent element, the element closest to the top of the stack is removed and returned.
 

Example 1:

Input: 
["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
[[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
Output: [null,null,null,null,null,null,null,5,7,5,4]
Explanation:
After making six .push operations, the stack is [5,7,5,7,4,5] from bottom to top.  Then:

pop() -> returns 5, as 5 is the most frequent.
The stack becomes [5,7,5,7,4].

pop() -> returns 7, as 5 and 7 is the most frequent, but 7 is closest to the top.
The stack becomes [5,7,5,4].

pop() -> returns 5.
The stack becomes [5,7,4].

pop() -> returns 4.
The stack becomes [5,7].
 

Note:

Calls to FreqStack.push(int x) will be such that 0 <= x <= 10^9.
It is guaranteed that FreqStack.pop() won't be called if the stack has zero elements.
The total number of FreqStack.push calls will not exceed 10000 in a single test case.
The total number of FreqStack.pop calls will not exceed 10000 in a single test case.
The total number of FreqStack.push and FreqStack.pop calls will not exceed 150000 across all test cases.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaximumFrequencyStack {
    /*time limit
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
    */
    class FreqStack {
        Map<Integer, Integer> map;
        PriorityQueue<int[]> pq;
        int time;
        //0 val 1 time 2 order
        public FreqStack() {
            map = new HashMap<>();
            pq = new PriorityQueue<>((a,b) -> a[1]==b[1]? b[2] - a[2] : b[1] - a[1]);
            time = 0;
        }
        
        public void push(int x) {
            int freq = map.getOrDefault(x, 0) +1;
            map.put(x, freq);
            pq.add(new int[] {x, freq, time++});
        }
        
        public int pop() {
            int[] val = pq.poll();
            
            if(map.get(val[0]) == 1) map.remove(val[0]);
            else map.put(val[0], map.get(val[0])-1);
            /*
            if(val[1] == 1) map.remove(val[0]);
            else map.put(x[0], x[1]-1);
            */
            return val[0];
        }
    }
}
