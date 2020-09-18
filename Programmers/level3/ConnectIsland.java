package Programmers.level3;

import java.util.*;

public class ConnectIsland {
    public static void main(String[] args){
        int n = 5;
        int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,3},{2,3,8},{3,4,1}};
        System.out.println(solution(n, costs));
    }   
    //kruskal must be used with union-find
    public static int solution(int n, int[][] costs){
        int answer = 0;
        List<Integer> edge = new ArrayList<>();
        int[] parent = new int[n];

        for(int i=0; i<n; i++){
            parent[i]= i;
        }
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2){
                int val1 = a1[2];
                int val2 = a2[2];
                return val1-val2;
            }
        });

        for(int i=0; i<costs.length; i++){
            if(findSet(parent, costs[i][0])==findSet(parent, costs[i][1])){
                continue;
            }
            else{
                union(parent, costs[i][0], costs[i][1]);
                edge.add(costs[i][2]);
            }
        }

        for(int i=0; i<edge.size(); i++){
            answer+=edge.get(i);
        }
        
        return answer;
    }

    public static int findSet(int[] parent, int node){
        if(parent[node]==node){
            return node;
        }
        else{
            return parent[node]= findSet(parent, parent[node]);
        }
    }

    public static void union(int[] parent, int node1, int node2){
        int a =  findSet(parent, node1);
        int b =  findSet(parent, node2);

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