package CodingTest.Hackers.Medium.StackAndQueue;
import java.util.*;

public class ATaleofTwoStacks {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue<T>{
    Stack<T> stk1 = new Stack<>();
    Stack<T> stk2 = new Stack<>();

    void enqueue(T n){
        stk1.push(n);
    }

    void dequeue(){
        if(stk2.isEmpty()){
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
        }
        stk2.pop();
    }

    T peek(){
        if(stk2.isEmpty()){
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
        }
        return stk2.peek();
    }
}