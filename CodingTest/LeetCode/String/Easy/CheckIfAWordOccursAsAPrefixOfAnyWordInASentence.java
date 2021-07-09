package CodingTest.LeetCode.String.Easy;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int answer = -1;
        String[] s = sentence.split(" ");
        
        for(int i=0; i<s.length; i++){
            if(s[i].contains(searchWord)&&s[i].charAt(0)==searchWord.charAt(0)) return i+1;
        }
        
        return answer;
    }
}
