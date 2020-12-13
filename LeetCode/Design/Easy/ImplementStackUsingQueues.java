package LeetCode.Design.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;
        
        /** Initialize your data structure here. */
        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }
        
        /** Push element x onto stack. */
        public void push(int x) {
            q1.add(x);
        }
        
        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            while(q1.size()>1){
                q2.add(q1.poll());
            }
            
            int temp = q1.poll();
            
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
            
            return temp;
        }
        
        /** Get the top element. */
        public int top() {
            while(q1.size()>1){
                q2.add(q1.poll());
            }
            
            int temp = q1.peek();
            q2.add(q1.poll());
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
            
            return temp;
        }
        
        /** Returns whether the stack is empty. */
        public boolean empty() {
            return q1.isEmpty();
        }
    }
}
