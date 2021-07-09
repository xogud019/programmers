package CodingTest.Programmers.level4;

import java.util.*;
//time limit ->using trie
public class SearchLyrics {
    public static void main(String[] args){
        String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
        String[] queries ={"fro??", "????o", "fr???", "fro???", "pro?"};

        int[] answer = solution(words, queries);
        for(int i:answer){
            System.out.print(i+" ");
        }
    }
    public static int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];
        List<HashSet<String>> list = new ArrayList<>();
        HashSet<String> set;
        for(int i=0; i<queries.length; i++){
            queries[i] = queries[i].replaceAll("\\?", ".");
        }

        for(String s: queries){
            set = new HashSet<>();
            for(String ss: words){
                if(ss.matches(s)){
                    set.add(ss);
                }
            }
            list.add(set);
        }

        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i).size();
        }
        return answer;
    }
}