package LeetCode.String.Medium;
/*
You are given two strings a and b that consist of lowercase letters. In one operation, you can change any character in a or b to any lowercase letter.

Your goal is to satisfy one of the following three conditions:

Every letter in a is strictly less than every letter in b in the alphabet.
Every letter in b is strictly less than every letter in a in the alphabet.
Both a and b consist of only one distinct letter.
Return the minimum number of operations needed to achieve your goal.

 

Example 1:

Input: a = "aba", b = "caa"
Output: 2
Explanation: Consider the best way to make each condition true:
1) Change b to "ccc" in 2 operations, then every letter in a is less than every letter in b.
2) Change a to "bbb" and b to "aaa" in 3 operations, then every letter in b is less than every letter in a.
3) Change a to "aaa" and b to "aaa" in 2 operations, then a and b consist of one distinct letter.
The best way was done in 2 operations (either condition 1 or condition 3).
Example 2:

Input: a = "dabadd", b = "cda"
Output: 3
Explanation: The best way is to make condition 1 true by changing b to "eee".
 

Constraints:

1 <= a.length, b.length <= 105
a and b consist only of lowercase letters.
*/
public class ChangeMinimumCharactersToSatisfyOneOfThreeConditions{
    public int minCharacters(String a, String b) {
        return Math.min(con3(a+b), Math.min(con1(a,b), con1(b,a)));
    }
    
    public int con1(String a, String b){
        int min = Integer.MAX_VALUE;
        
        for(char ch = 'b'; ch <= 'z'; ch++){
            int temp = 0;
            
            for(char c:a.toCharArray()){
                if(c >= ch) temp++; 
            }
            
            for(char c:b.toCharArray()){
                if(c < ch) temp++;
            }
            
            min = Math.min(min, temp);
        }
        return min;
    }
    
    public int con3(String str){
        int[] arr = new int[26];
        int max = Integer.MIN_VALUE;
        
        for(char c:str.toCharArray()) arr[c-'a']++;
        
        for(int i:arr){
            if(i == 0) continue;
            
            max = Math.max(max, i);
        }
        
        return str.length()-max;
    }
}