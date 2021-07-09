package CodingTest.LeetCode.String.Easy;

public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String answer = "1";
        
        for(int i=2; i<=n; i++){
            char temp = answer.charAt(0);
            int count = 1;
            StringBuilder sb = new StringBuilder();
            
            for(int j=1; j<answer.length(); j++){
                if(temp != answer.charAt(j)){
                    sb.append(count).append(temp);
                    count = 1;
                    temp = answer.charAt(j);
                }
                else count++;
            }
            
            sb.append(count).append(temp);
            
            answer = sb.toString();
        }
        /*
        for(int i=0; i<dp.length; i++){
            System.out.println(dp[i]);
        }
        */
        return answer;
    }
}
