package LeetCode.Math.Easy;

public class DistributeCandiesToPeople {
    public int[] distributeCandies(int candies, int num_people) {
        int[] answer = new int[num_people];
        int candy = 1;
        int idx = 0;
        
        while(candies>0){
            if(candy > candies){
                answer[idx%num_people] += candies;
                break;
            }
            
            answer[idx%num_people] += candy;
            candies -= candy;
            candy++;
            System.out.println(answer[idx%num_people]);
            idx++;
            
        }
        
        return answer;
    }
}
