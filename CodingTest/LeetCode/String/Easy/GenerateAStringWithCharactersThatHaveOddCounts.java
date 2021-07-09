package CodingTest.LeetCode.String.Easy;

public class GenerateAStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
        String[] dic = {"a","b","c"};
        String answer = "";
        
        if(n==1) return dic[0];
        
        if(n%2==0){
            while(n-- > 1){
                answer += dic[0];
            }       
            
            answer += dic[1];
        }
        else{
            while(n-- > 2){
                answer += dic[0];
            }
            
            answer += dic[1]+dic[2];
        }
        
        return answer;
    }
}
