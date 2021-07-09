package CodingTest.LeetCode.String.Easy;

public class CompareStringsByFrequencyOfTheSmallestCharacter {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int freq = makeFre(queries[i]);
            int count = 0;
            
            for(String s:words){
                if(freq<makeFre(s)) count++;
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
    
    public int makeFre(String s){
        int freq = 0;
        
        char c = s.charAt(0);
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)<c){
                c = s.charAt(i);
            }
        }
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                freq++;
            }
        }
        
        return freq;
    }
}
