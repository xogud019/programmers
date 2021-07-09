package CodingTest.LeetCode.Sort.Easy;

import java.util.Arrays;

public class ValidAnagram {
    /*hashMap
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c:s.toCharArray()) map.put(c, map.getOrDefault(c,0)+1);
        
        for(char c:t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
                
                if(map.get(c)==0) map.remove(c);
            }
            else return false;
        }
        
        return true;
    }
    */
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        if(arr1.length != arr2.length) return false;
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]) return false;
        }
        
        return true;
    }
}
