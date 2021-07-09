package CodingTest.LeetCode.String.Medium;
/*
S and T are strings composed of lowercase letters. In S, no letter occurs more than once.

S was sorted in some custom order previously. We want to permute the characters of T so that they match the order that S was sorted. More specifically, if x occurs before y in S, then x should occur before y in the returned string.

Return any permutation of T (as a string) that satisfies this property.

Example :
Input: 
S = "cba"
T = "abcd"
Output: "cbad"
Explanation: 
"a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a". 
Since "d" does not appear in S, it can be at any position in T. "dcba", "cdba", "cbda" are also valid outputs.
 

Note:
1.S has length at most 26, and no character is repeated in S.
2.T has length at most 200.
3.S and T consist of lowercase letters only.
*/
public class CustomSortString {
    /*failed case
    public String customSortString(String S, String T) {
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int count = 0;
        
        for(char c:T.toCharArray()) q.add(c);
        
        while(!q.isEmpty()){
            if(count == S.length()*q.size()) idx++;
            if(idx == S.length()) break;

            char temp = q.poll();
            
            if(temp == S.charAt(idx)){
                sb.append(""+temp);
                count=0;
                continue;
            }
            
            count++;
            q.add(temp);
        }
        
        while(!q.isEmpty()) sb.append(""+q.poll());
        
        return sb.toString();
    }
    */
    public String customSortString(String S, String T) {
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[T.length()];
        
        for(char c: S.toCharArray()){
            for(int i=0; i<T.length(); i++){
                if(c == T.charAt(i) && !visited[i]){
                    sb.append(""+c);
                    visited[i] = true;
                }
            }    
        }
        
        for(int i=0; i<T.length(); i++){
            if(!visited[i]) sb.append(""+T.charAt(i));
        }
        
        return sb.toString();
    }
}
