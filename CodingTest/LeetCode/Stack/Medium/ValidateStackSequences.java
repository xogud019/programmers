package CodingTest.LeetCode.Stack.Medium;
/*
Given two sequences pushed and popped with distinct values, return true if and only if this could have been the result of a sequence of push and pop operations on an initially empty stack.

 

Example 1:

Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4), pop() -> 4,
push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
Example 2:

Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
Explanation: 1 cannot be popped before 2.
 

Constraints:

0 <= pushed.length == popped.length <= 1000
0 <= pushed[i], popped[i] < 1000
pushed is a permutation of popped.
pushed and popped have distinct values.
*/
import java.util.Stack;

public class ValidateStackSequences {
    //2ms
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length == 0) return true;
        
        Stack<Integer> stk = new Stack<>();
        stk.push(pushed[0]);
        int i = 1, j = 0, count = 0;;
        
        while(j < popped.length){
            if(count>2) return false;
            
            if(stk.isEmpty() && i< pushed.length) stk.push(pushed[i++]);
            
            if(stk.peek() == popped[j]){
                stk.pop();
                j++;
            }
            else{
                if(i<pushed.length) stk.push(pushed[i++]);
                else count++;
            }
        }
        
        if(stk.isEmpty()) return true;
        
        return false;
    }
    /*1ms
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int N = pushed.length;
        Stack<Integer> stack = new Stack();

        int j = 0;
        for (int x: pushed) {
            stack.push(x);
            while (!stack.isEmpty() && j < N && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        return j == N;
    }
    */
}
