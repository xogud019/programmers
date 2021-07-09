package CodingTest.LeetCode.Map.Medium;

import java.util.HashMap;
import java.util.HashSet;
/*
Given a wordlist, we want to implement a spellchecker that converts a query word into a correct word.

For a given query word, the spell checker handles two categories of spelling mistakes:

Capitalization: If the query matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the case in the wordlist.
Example: wordlist = ["yellow"], query = "YellOw": correct = "yellow"
Example: wordlist = ["Yellow"], query = "yellow": correct = "Yellow"
Example: wordlist = ["yellow"], query = "yellow": correct = "yellow"
Vowel Errors: If after replacing the vowels ('a', 'e', 'i', 'o', 'u') of the query word with any vowel individually, it matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the match in the wordlist.
Example: wordlist = ["YellOw"], query = "yollow": correct = "YellOw"
Example: wordlist = ["YellOw"], query = "yeellow": correct = "" (no match)
Example: wordlist = ["YellOw"], query = "yllw": correct = "" (no match)
In addition, the spell checker operates under the following precedence rules:

When the query exactly matches a word in the wordlist (case-sensitive), you should return the same word back.
When the query matches a word up to capitlization, you should return the first such match in the wordlist.
When the query matches a word up to vowel errors, you should return the first such match in the wordlist.
If the query has no matches in the wordlist, you should return the empty string.
Given some queries, return a list of words answer, where answer[i] is the correct word for query = queries[i].

 

Example 1:

Input: wordlist = ["KiTe","kite","hare","Hare"], queries = ["kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"]
Output: ["kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"]
 

Note:

1 <= wordlist.length <= 5000
1 <= queries.length <= 5000
1 <= wordlist[i].length <= 7
1 <= queries[i].length <= 7
All strings in wordlist and queries consist only of english letters.
*/
public class VowelSpellchecker {
    /*failed case
    HashSet<String> wordList;
    HashMap<String,String> capList;
    HashMap<String,String> voList;

    public String[] spellchecker(String[] wordlist, String[] queries) {
        wordList = new HashSet<>();
        capList = new HashMap<>();
        voList = new HashMap<>();
        
        ArrayList<String> list = new ArrayList<>();
        
        for(String word : wordlist){
            wordList.add(word);
        }
        
        for(String word:queries){
            if(sameWord(word)){ 
                list.add(word);
                continue;
            }
            
            if(cap(word)){
                list.add(capList.get(word));
                continue;
            }
            if(vowel(word)) {
                list.add(voList.get(word));
                continue;
            }
            
            list.add("");
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public boolean sameWord(String str){
        for(String s:wordList){
            if(str.equals(s)) return true;
        }
        
        return false;
    }
    
    public boolean cap(String str){
        for(String s:wordList){
            if(str.toLowerCase().equals(s.toLowerCase())){
                capList.put(str, s);
                return true;
            }
        }
        
        return false;
    }
    
    public boolean vowel(String str){
        
        for(String s:wordList){
            StringBuilder s1 = new StringBuilder(), s2 = new StringBuilder();
            
            for(char c: s.toCharArray()){
                if(vo(c)) s1.append("*");
                else s1.append(""+c);
            }
            
            for(char c:str.toCharArray()){
                if(vo(c)) s2.append("*");
                else s2.append(""+c);
            }
            //System.out.println(str+" "+s1.toString()+" "+s2.toString() +" "+ s1.toString().equals(s2.toString()));
            if(s1.toString().equals(s2.toString())){
                //System.out.println(str+" "+s);
                voList.put(str, s);
                return true;
            }
        }
        
        return false;
    }
    
    public boolean vo(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    */
    HashSet<String> wordList;
    HashMap<String,String> capList;
    HashMap<String,String> voList;

    public String[] spellchecker(String[] wordlist, String[] queries) {
        wordList = new HashSet<>();
        capList = new HashMap<>();
        voList = new HashMap<>();
        int len = queries.length;
        
        for(String word : wordlist){
            wordList.add(word);
            
            String wordL = word.toLowerCase();
            capList.putIfAbsent(wordL, word);
            
            String wordLV = vowel(wordL);
            voList.putIfAbsent(wordLV, word);
        }
        
        String[] answer = new String[len];
        
        for(int i=0; i<len; i++) answer[i] = check(queries[i]);
        
        return answer;
    }
    
    public String check(String query){
        if(wordList.contains(query)) return query;
        
        String queryC = query.toLowerCase();
        
        if(capList.containsKey(queryC)) return capList.get(queryC);
        
        String queryV = vowel(queryC);
        
        if(voList.containsKey(queryV)) return voList.get(queryV);
        
        return "";
    }
    
    public String vowel(String str){
        StringBuilder sb = new StringBuilder();
        
        for(char c: str.toCharArray()) sb.append(vo(c)? "*":c);
       
        return sb.toString();
    }
    
    public boolean vo(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
