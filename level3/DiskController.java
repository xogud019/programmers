package level3;
import java.util.*;

public class DiskController {
    public static void main(String[] args){
        int[][] jobs = {{0,3},{1,9},{2,6}};

        System.out.println(solution(jobs));
    }

    public static int solution(int[][] jobs){
        int answer = 0;
        Queue<Job> pq = new PriorityQueue<>();


        return answer;
    }

    class Job{
        int req=0;
        int pro=0;
    }
}