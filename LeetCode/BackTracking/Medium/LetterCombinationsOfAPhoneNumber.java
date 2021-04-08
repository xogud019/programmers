package LeetCode.BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

 -   abc def
ghi  jkl mno
pqrs tuv wxyz

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
*/
public class LetterCombinationsOfAPhoneNumber {
    List<String> answer;
    String[][] pad = {{"."},{"."},{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
    
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        
        answer = new ArrayList<>();
        
        backtracking(digits, 0, new StringBuilder());
        
        return answer;
    }
    
    public void backtracking(String digits, int depth, StringBuilder sb){
        if(depth == digits.length()){
            answer.add(sb.toString());
            return;
        }
        
        int idx = digits.charAt(depth)-'0';
        //System.out.println(idx);
        for(int i=0; i<pad[idx].length; i++){
            sb.append(pad[idx][i]);
            backtracking(digits, depth+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
