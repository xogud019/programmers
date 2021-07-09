package CodingTest.Programmers.level1;

public class ThirdnaryReverse {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            int temp = n%3;
            n /= 3;
            
            sb.append(""+temp);    
        }
        
        answer = Integer.parseInt(sb.toString(),3);

        return answer;
    }
}
