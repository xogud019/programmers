package LeetCode.Array.Easy;

import java.util.ArrayList;

/*
In a deck of cards, each card has an integer written on it.

Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:

Each group has exactly X cards.
All the cards in each group have the same integer.
 

Example 1:

Input: deck = [1,2,3,4,4,3,2,1]
Output: true
Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
Example 2:

Input: deck = [1,1,1,2,2,2,3,3]
Output: false´
Explanation: No possible partition.
Example 3:

Input: deck = [1]
Output: false
Explanation: No possible partition.
Example 4:

Input: deck = [1,1]
Output: true
Explanation: Possible partition [1,1].
Example 5:

Input: deck = [1,1,2,2,2,2]
Output: true
Explanation: Possible partition [1,1],[2,2],[2,2].
 

Constraints:
1.1 <= deck.length <= 10^4
2.0 <= deck[i] < 10^4
*/
public class XOfAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        int len = deck.length;
        int[] arr = new int[10001];
        ArrayList<Integer> val = new ArrayList<>();
        
        for(int i:deck) arr[i]++;
        /*
        for(int i:arr){
            System.out.println(i);
        }
        */
        for(int i:arr){
            if(i != 0) val.add(i);
        }
        
        i_loop:for(int i=2; i<len+1; i++){
            if(len%i==0){
                for(int v:val){
                    if(v%i!=0) continue i_loop;
                }
                
                return true;
            }
        }
        
        return false;
    }
}
