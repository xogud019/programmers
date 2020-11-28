package LeetCode.Array.Easy;

public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start == destination) return 0;
        
        int n = distance.length;
        int clock = 0, counterClock = 0;
        int i = start, j = destination;
        //clock
        while(i%n!=j){
            clock += distance[i%n];
            i++;
        }
        //counter
        i = start;
        while(i!=j){
            i--;
            if(i<0) i = n-1;
            counterClock += distance[i];
        }
        
        return Math.min(clock, counterClock);
    }
}
