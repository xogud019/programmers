package Programmers.level2;

import java.util.*;

public class MaxMinNum {
    public static void main(String[] args){
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        String[] arr = new String[s.length()];
        Queue<Integer> orderQ = new PriorityQueue<>();
        Queue<Integer> rOrderQ = new PriorityQueue<>(Collections.reverseOrder());

        arr = s.split(" ");

        for(int i=0; i<arr.length; i++){
            orderQ.add(Integer.parseInt(arr[i]));
            rOrderQ.add(Integer.parseInt(arr[i]));
        }
        answer = Integer.toString(orderQ.poll())+" "+rOrderQ.poll();
        return answer;
    }
}