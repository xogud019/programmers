package LeetCode.Medium;

import java.util.Comparator;
import java.util.PriorityQueue;
/*
You are given two integers memory1 and memory2 representing the available memory in bits on two memory sticks. There is currently a faulty program running that consumes an increasing amount of memory every second.

At the ith second (starting from 1), i bits of memory are allocated to the stick with more available memory (or from the first memory stick if both have the same available memory). If neither stick has at least i bits of available memory, the program crashes.

Return an array containing [crashTime, memory1crash, memory2crash], where crashTime is the time (in seconds) when the program crashed and memory1crash and memory2crash are the available bits of memory in the first and second sticks respectively.

 

Example 1:

Input: memory1 = 2, memory2 = 2
Output: [3,1,0]
Explanation: The memory is allocated as follows:
- At the 1st second, 1 bit of memory is allocated to stick 1. The first stick now has 1 bit of available memory.
- At the 2nd second, 2 bits of memory are allocated to stick 2. The second stick now has 0 bits of available memory.
- At the 3rd second, the program crashes. The sticks have 1 and 0 bits available respectively.
Example 2:

Input: memory1 = 8, memory2 = 11
Output: [6,0,4]
Explanation: The memory is allocated as follows:
- At the 1st second, 1 bit of memory is allocated to stick 2. The second stick now has 10 bit of available memory.
- At the 2nd second, 2 bits of memory are allocated to stick 2. The second stick now has 8 bits of available memory.
- At the 3rd second, 3 bits of memory are allocated to stick 1. The first stick now has 5 bits of available memory.
- At the 4th second, 4 bits of memory are allocated to stick 2. The second stick now has 4 bits of available memory.
- At the 5th second, 5 bits of memory are allocated to stick 1. The first stick now has 0 bits of available memory.
- At the 6th second, the program crashes. The sticks have 0 and 4 bits available respectively.
 

Constraints:

0 <= memory1, memory2 <= 231 - 1

*/
public class IncrementalMemoryLeak {
    class Stick{
        int idx = 0;
        int ava = 0;
        
        public Stick(int idx, int ava){
            this.idx = idx;
            this.ava = ava;
        }
    }
    
    public int[] memLeak(int memory1, int memory2) {
        PriorityQueue<Stick> pq = new PriorityQueue<>(new Comparator<Stick>(){
            @Override
            public int compare(Stick s1, Stick s2){
                if(s1.ava == s2.ava) return s1.idx - s2.idx;
                
                return s2.ava-s1.ava;
            }
        });
        
        pq.add(new Stick(1, memory1));
        pq.add(new Stick(2, memory2));
        
        int[] answer = new int[3];
        int time = 1;
        
        while(time <= pq.peek().ava){
            Stick stk = pq.poll();
            
            stk.ava -= time;
            time++;
            pq.add(stk);
        }
        
        answer[0] = time;
        answer[pq.peek().idx] = pq.poll().ava;
        answer[pq.peek().idx] = pq.poll().ava;
        
        return answer;
    }
}
