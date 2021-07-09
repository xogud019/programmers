package CodingTest.LeetCode.Contest;

public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        if(s.length() == 0) return 0;
        
        int answer = 0;
        int count = 0;
        
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);

            if(temp == '(') count++;
            else if(temp == ')') count--;
            else if(Character.isDigit(temp)) answer = Math.max(answer, count);
        }
        
        return answer;
    }
}
