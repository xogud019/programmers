package CodingTest.Programmers.level3;

import java.util.*;

public class DiskController {
    public static void main(String[] args){
        int[][] jobs = {{0,3},{1,9},{2,6}};
        System.out.println(solution(jobs));
    }

    public static int solution(int[][] jobs){
        int answer = 0;
        int cnt = 0;
        int time = 0;
        Queue<Job> waiting = new PriorityQueue<>(new Comparator<Job>() {
            @Override
            public int compare(Job j1, Job j2){
                return j1.req-j2.req;
            }
        });
        Queue<Job> exe = new PriorityQueue<>(new Comparator<Job>() {
            @Override
            public int compare(Job j1, Job j2){
                return j1.pros-j2.pros;
            }
        });

        for(int i=0; i<jobs.length; i++){
            waiting.add(new Job(jobs[i][0],jobs[i][1]));
        }

        while(cnt<jobs.length){
            while(!waiting.isEmpty()&&waiting.peek().req<=time){
                exe.add(waiting.poll());
            }

            if(!exe.isEmpty()){
                cnt++;
                time += exe.peek().pros;
                answer+=time-exe.poll().req;
            }
            else{
                time++;
            }
        }
        return answer/cnt;
    }
    
    static class Job{
        int req = 0;
        int pros = 0;

        public Job(int req, int pros){
            this.req = req;
            this.pros = pros;
        }
    }
}