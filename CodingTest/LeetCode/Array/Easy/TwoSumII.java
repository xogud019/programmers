package CodingTest.LeetCode.Array.Easy;

public class TwoSumII {
    //1ms
    public int[] twoSum(int[] numbers, int target) {
        int[]answer = new int[2];
        int low = 0, high = numbers.length-1;
        
        while(low<high){
            if(numbers[high]+numbers[low] >target) high--;
            else if(numbers[high]+numbers[low] < target) low++;
            else{
                answer[0] = low+1;
                answer[1] = high+1;
                break;
            }
        }
        
        
        return answer;
    }
    /*304ms
    public int[] twoSum(int[] numbers, int target) {
        int[]answer = new int[2];
        
        loop_f : for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]+numbers[j] == target){
                    answer[0] = i+1;
                    answer[1] = j+1;
                    break loop_f;
                }
            }
        }
        
        return answer;
    }
    */
}
