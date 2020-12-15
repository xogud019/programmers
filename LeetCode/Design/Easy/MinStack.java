package LeetCode.Design.Easy;

import java.util.Stack;

public class MinStack {
    class MinStacks {
        Stack<Integer> stk1;
        Stack<Integer> stk2;
    
        /** initialize your data structure here. */
        public MinStacks() {
            stk1 = new Stack<>();
            stk2 = new Stack<>();
        }
        
        public void push(int x) {
            stk1.push(x);
        }
        
        public void pop() {
            stk1.pop();
        }
        
        public int top() {
            return stk1.peek();
        }
        
        public int getMin() {
            int min = Integer.MAX_VALUE;
            
            while(!stk1.isEmpty()){
                min = Math.min(min, stk1.peek());
                stk2.push(stk1.pop());
            }
            
            while(!stk2.isEmpty()) stk1.push(stk2.pop());
            
            return min;
        }
    }
}
