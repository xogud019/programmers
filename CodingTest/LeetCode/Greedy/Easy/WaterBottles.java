package CodingTest.LeetCode.Greedy.Easy;

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int answer = numBottles;
        int empty = numBottles;
        numBottles = 0;
        
        while(empty >= numExchange){
            numBottles = empty/numExchange;
            answer += numBottles;
            empty = empty%numExchange + numBottles;
        }
        
        return answer;
    }
}
