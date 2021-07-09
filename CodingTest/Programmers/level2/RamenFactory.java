package CodingTest.Programmers.level2;

import java.util.*;

public class RamenFactory {
    public static void main(String[] args){
        int stock = 10;
        int[] dates = {1,8,10};
        int[] supplies = {1,1,100};
        int k = 100;
        System.out.println(solution(stock, dates, supplies, k));
    }

    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer= 0;
        int day = 0;
        int dIndex = 0;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        while(day<k){
            if(dates[dIndex]==day){
                //System.out.println(day);
                pq.add(supplies[dIndex]);
                if(dIndex != dates.length-1){
                    dIndex++;
                }
            }
            /*
            if(day==dates[dIndex]&&dIndex<dates.length){
                pq.add(supplies[sIndex]);
                dIndex++;
                sIndex++;
            }
            */
            if(stock==0&&!pq.isEmpty()){
                stock+=pq.poll();
                answer++;
            }
            day++;
            stock--;
        }

        return answer;
    }

}