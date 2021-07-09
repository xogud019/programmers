package CodingTest.LeetCode.BitManifulation.Easy;

public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps (int num) {
        int answer = 0;
        
        while(num>0){
            if(num%2== 0) num /=2;
            else num -=1;
            
            answer++;
        }
        
        return answer;
    }

    /*bitt man
    public int numberOfSteps (int num) {
        if(num == 0) return 0;
        
        return Integer.toBinaryString(num).length() + Integer.bitCount(num)-1;
    }
    Explanation:
Example for numberOfSteps(5)
Steps involved -
1. 5 - 1 = 4
2. 4/2 = 2
3. 2/2 = 1
4. 1 - 0 = 0
Converting the above steps to binary gives us the following -
1. 101 - 1 = 100
2. 100 >> 1 = 10 (divided by 2)
3. 10 >> 1 = 1
4. 1 - 1 = 0
Steps 1, 4 indicates the number of set bit count
Steps 2, 3 indicates the total number of digits in the binary representation - 1. We are subtracting one as the end result is 0 which is being included in the binary representation's length
    */
}
