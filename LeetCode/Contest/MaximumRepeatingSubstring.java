package LeetCode.Contest;

public class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(word);
        
        while(sequence.contains(sb.toString())){
            answer++;
            sb.append(word);
        }
        
        return answer;
    }
}
