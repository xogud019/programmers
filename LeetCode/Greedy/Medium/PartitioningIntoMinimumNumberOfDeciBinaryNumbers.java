package LeetCode.Greedy.Medium;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        int answer = 0;
        
        for(char c:n.toCharArray()){
            answer = Math.max(answer, c-'0');
        }
        return answer;
    }
}
