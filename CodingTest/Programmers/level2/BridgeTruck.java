package Programmers.level2;

import java.util.*;

public class BridgeTruck {
    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 0;
        Queue<Truck> q = new LinkedList<>();
        List<Truck> list = new ArrayList<>();

        Truck[] truck = new Truck[truck_weights.length];
        int n = truck_weights.length;

        for(int i=0; i<n; i++){
            truck[i] = new Truck(truck_weights[i]);
            q.add(truck[i]);
        }
        
        while(!q.isEmpty()){
            if(list.isEmpty()){
                list.add(q.poll());
                moveTruck(list);
            }
            else{
                int total_weights=totalWeights(list);
                if(total_weights+q.peek().weights<=weight){
                    list.add(q.poll());
                    moveTruck(list);
                }
                else{
                    moveTruck(list);
                }
            }

            for(int i=0; i<list.size(); i++){
                if(list.get(i).position==bridge_length){
                    list.remove(i);
                }
            }
            answer++;
        }

        return answer+bridge_length;
    }

    public static int totalWeights(List<Truck> list){
        int answer =0;
        for(int i=0; i<list.size(); i++){
            answer+=list.get(i).weights;
        }
        return answer;
    }

    public static void moveTruck(List<Truck> list){
        for(int i =0; i<list.size(); i++){
            list.get(i).position++;
        }
    }
}

class Truck{
    int position = 0;
    int weights = 0;

    public Truck(int weights){
        this.weights = weights;
    }
}