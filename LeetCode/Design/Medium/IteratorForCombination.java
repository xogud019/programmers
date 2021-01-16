package LeetCode.Design.Medium;

import java.util.ArrayList;
import java.util.Collections;

/*
Design the CombinationIterator class:

CombinationIterator(string characters, int combinationLength) Initializes the object with a string characters of sorted distinct lowercase English letters and a number combinationLength as arguments.
next() Returns the next combination of length combinationLength in lexicographical order.
hasNext() Returns true if and only if there exists a next combination.
 

Example 1:

Input
["CombinationIterator", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
[["abc", 2], [], [], [], [], [], []]
Output
[null, "ab", true, "ac", true, "bc", false]

Explanation
CombinationIterator itr = new CombinationIterator("abc", 2);
itr.next();    // return "ab"
itr.hasNext(); // return True
itr.next();    // return "ac"
itr.hasNext(); // return True
itr.next();    // return "bc"
itr.hasNext(); // return False
 

Constraints:
1.1 <= combinationLength <= characters.length <= 15
2.All the characters of characters are unique.
3.At most 104 calls will be made to next and hasNext.
4.It's guaranteed that all calls of the function next are valid.
*/
public class IteratorForCombination {
    class CombinationIterator {
        ArrayList<String> list;
        boolean[] visited;
        int idx;
        
        public CombinationIterator(String characters, int combinationLength) {
            idx = 0;
            list = new ArrayList<>();
            visited = new boolean[characters.length()];
            
            combi(list, characters, visited,new StringBuilder(), combinationLength,0);
            
            Collections.sort(list);
            
            for(String ss: list){
                System.out.println(ss);
            }
        }
        
        public String next() {
            String temp = list.get(idx);
            idx++;
            
            return temp;
        }
        
        public boolean hasNext() {
            return idx <list.size();
        }
        
        public void combi(ArrayList<String> list, String str, boolean[] visited,StringBuilder s, int n, int start){
            if(s.length()==n){
                list.add(s.toString());
                return;
            }
            
            for(int i=start; i<str.length(); i++){
                if(!visited[i]){
                    visited[i] = true;
                    s.append(""+str.charAt(i));
                    combi(list,str,visited,s,n, i+1);
                    s.delete(s.length()-1, s.length());
                    visited[i] = false;
                }
            }
        }
    }
}
