package LeetCode.Contest;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int answer = 0;
        for(String s : logs){
            if(s.equals("./")) continue;
            else if(s.equals("../")){
                if(answer>0) answer--;
            }
            else{
                answer++;
            }
        }
        
        return answer;
    }
}
