package CodingTest.LeetCode.BackTracking.Medium;

import java.util.HashSet;
/*
You have n  tiles, where each tile has one letter tiles[i] printed on it.
Return the number of possible non-empty sequences of letters you can make using the letters printed on those tiles.

Example 1:

Input: tiles = "AAB"
Output: 8
Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".

Example 2:

Input: tiles = "AAABBC"
Output: 188

Example 3:

Input: tiles = "V"
Output: 1
 
Constraints:
1.1 <= tiles.length <= 7
2.tiles consists of uppercase English letters.
*/
public class LetterTilePossibilities {
    HashSet<String> set;
    
    public int numTilePossibilities(String tiles) {
        set = new HashSet<>();
        String[] arr = tiles.split("");
        boolean[] visited = new boolean[tiles.length()];
        findPos(arr, visited,"" ,tiles.length());
        return set.size();
    }
    
    public void findPos(String[] arr,boolean[] visited, String str, int n){
        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                str += arr[i];
                set.add(str);
                findPos(arr,visited,str,n);
                visited[i] = false;
                str = str.substring(0,str.length()-1);
            }
        }
    }
}
