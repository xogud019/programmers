package level2;
import java.util.*;

public class BrideeTruck {
    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weigths = {7,4,5,6};
        System.out.println(solution(bridge_length, weight, truck_weigths));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weigths){
        int answer=0;
        int time=0;
        int[] bridge = new int[bridge_length];
        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<truck_weigths.length; i++){
            q.add(truck_weigths[i]);
        }

        while(!q.isEmpty()){
            if(check(bridge)==false){
                if(sum(bridge)+q.peek()<weight){
                    for(int i=0; i<bridge.length; i++){
                        if(bridge[i]==0){
                            bridge[i]=q.poll();
                            break;
                        }
                    }

                    time++;
                    
                }
            }
        }
        
        return answer;
    }

    public static boolean check(int[] bridge){
        int count=0;
        boolean isZ = false;
        for(int i:bridge){
            if(bridge[i]==0){
                count++;
            }
        }

        if(count==bridge.length){
            return isZ=true;
        }
        return isZ;
    }

    public static int sum(int[] bridge){
        int answer=0;
        for(int i:bridge){
            answer+=bridge[i];
        }

        return answer;
    }
}