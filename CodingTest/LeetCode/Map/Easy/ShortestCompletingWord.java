package CodingTest.LeetCode.Map.Easy;

import java.util.TreeMap;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String lic = licensePlate.toLowerCase();
        TreeMap<Character, Integer> map = new TreeMap<>();
        TreeMap<Character, Integer> temp;
        int prevVal = 0;
        String prevS = "";
        
        for(char c : lic.toLowerCase().toCharArray()){
            if(!Character.isDigit(c) && c != ' ') map.put(c, map.getOrDefault(c,0)+1);
        }
        
        for(int i=0; i<words.length; i++){
            temp = new TreeMap<>();
            int val = 0;
            
            for(char c : words[i].toCharArray()) temp.put(c, temp.getOrDefault(c, 0)+1);
            
            for(char c : map.keySet()){
                if(temp.containsKey(c)){
                    if(temp.get(c)==map.get(c)) val += map.get(c);
                    else val += Math.min(map.get(c), temp.get(c));
                }
            }
            
            if(val > prevVal){
                prevVal = val;
                prevS = words[i];
            }
            else if(val == prevVal && !prevS.equals("")){
                if(prevS.length()>words[i].length()) prevS = words[i];
            }
        }
        
        return prevS;
    }
}
