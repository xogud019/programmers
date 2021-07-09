package CodingTest.LeetCode.Math.Easy;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        int[] answer = new int[2];
        int start = 1; int end = n-1;
        
        while(start<=end){
            if(containZero(start) && containZero(end)){
                answer[0] = start;
                answer[1]= end;
                break;
            }
            
            start++;
            end--;
        }
        
        return answer;
    }
    
    public boolean containZero(int num){
        while(num>0){
            if(num%10 == 0) return false;
            
            num /= 10;
        }
        
        return true;
    }
}
