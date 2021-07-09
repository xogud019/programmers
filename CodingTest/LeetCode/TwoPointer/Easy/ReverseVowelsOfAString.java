package CodingTest.LeetCode.TwoPointer.Easy;

import java.util.HashSet;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int start = 0, end = s.length()-1;
        char[] str = s.toCharArray();
        
        while(start<end){
            if(!set.contains(s.charAt(start))) start++;
            if(!set.contains(s.charAt(end))) end--;
            
            if(set.contains(s.charAt(start)) &&set.contains(s.charAt(end))){
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }
        
        return new String(str);
    }
}
