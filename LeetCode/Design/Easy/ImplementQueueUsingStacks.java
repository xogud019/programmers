package LeetCode.Design.Easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    class MyQueue {
        Stack<Integer> stk1;
        Stack<Integer> stk2;
        /** Initialize your data structure here. */
        public MyQueue() {
            stk1 = new Stack<>();
            stk2 = new Stack<>();
        }
        
        /** Push element x to the back of queue. */
        public void push(int x) {
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
            stk1.push(x);
            
            while(!stk2.isEmpty()){
                stk1.push(stk2.pop());
            }
        }
        
        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return stk1.pop();
        }
        
        /** Get the front element. */
        public int peek() {
            return stk1.peek();
        }
        
        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stk1.isEmpty()&&stk2.isEmpty();
        }
    }    
}
