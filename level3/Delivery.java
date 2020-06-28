package level3;
import java.util.*;

public class Delivery {
    //not
    public static void main(String[] args){
        int N = 5;
        int K = 3;
        int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        
        System.out.println(solution(N, road, K));
    }

    public static int solution(int N, int[][] road, int K) {
        int[] parent = new int[N+1];
        Set<Integer> edge = new TreeSet<>();

        edge.add(1);

        Arrays.sort(road,new Comparator<int[]>(){
            @Override
            public int compare(int[] a1, int[] a2){
                int val1 = a1[0];
                int val2 = a2[0];
                
                return val1-val2;
            }
        });
        
        print(road);
        for(int i=0; i<road.length; i++){
            if(edge.contains(road[i][0])){
                
            }
            else if(edge.contains(road[i][1])){

            }
        }
        /*
        for(int i=0; i<road.length; i++){
            if(findSet(parent, road[i][0])==findSet(parent, road[i][1])){
                continue;
            }
            else{
                if(road[i][2]<=3){
                    union(parent, road[i][0], road[i][1]);
                    edge.add(road[i][0]);
                    edge.add(road[i][1]);
                }
            }
        }
        */
        return edge.size();
    }

    public static int findSet(int[] parent, int node){
        if(parent[node]==node){
            return node;
        }
        else{
            return parent[node]=findSet(parent, parent[node]);
        }
    }

    public static void union(int[] parent, int node1, int node2){
        int a = findSet(parent, node1);
        int b = findSet(parent, node2);

        if(a!=b){
            parent[b] = a;
        }
    }

    public static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}