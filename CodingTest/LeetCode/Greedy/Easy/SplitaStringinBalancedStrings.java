package CodingTest.LeetCode.Greedy.Easy;

public class SplitaStringinBalancedStrings {
    public int balancedStringSplit(String s) {
        int answer = 0;
        int l = 0, r = 0;
        
        for(int i=0; i<s.length(); ++i){
            char temp = s.charAt(i);
            
            if(temp == 'L') l++;
            else r++;
            
            if(l==r&&l!=0){
                answer ++;
                l = 0;
                r = 0;
            }
        }
        
        return answer;
    }
}
