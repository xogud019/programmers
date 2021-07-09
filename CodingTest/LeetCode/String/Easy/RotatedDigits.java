package CodingTest.LeetCode.String.Easy;

public class RotatedDigits {
    public int rotatedDigits(int N) {
        int answer = 0;
        
        for(int i=1; i<=N; i++){
            int num = i;
            boolean conTrue = false;
            boolean conFalse = false;
            
            while(num > 0){
                if(num % 10 == 2 || num % 10 == 5 || num % 10 == 6 || num % 10 == 9) conTrue = true;
                
                if(num %10 == 3 || num %10 == 4 || num %10 == 7) conFalse = true;
                
                num /= 10;
            }
            
            if(conTrue && !conFalse) answer++;
        }
        
        return answer;
    }
}
