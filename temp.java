public class temp {
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'kruskals' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts WEIGHTED_INTEGER_GRAPH g as parameter.
     */

    /*
     * For the weighted graph, <name>:
     *
     * 1. The number of nodes is <name>Nodes.
     * 2. The number of edges is <name>Edges.
     * 3. An edge exists between <name>From[i] and <name>To[i]. The weight of the edge is <name>Weight[i].
     *
     */

    public static int kruskals(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
        int[][] graph = new int[gFrom.size()][3];
        int answer = 0;
        int[] parent = new int[gNodes];

        for(int i=0; i<gNodes; i++){
            parent[i] = i;
        }
        for(int i=0; i<graph.length; i++){
            graph[i][0] = gFrom.get(i);
            graph[i][1] = gTo.get(i);
            graph[i][2] = gWeight.get(i);
        }

        Arrays.sort(graph, new Comparator<int[]>(){
            @Override
            public int compare(int[] a1, int[] a2){
                return a1[2]-a2[2];
            }
        });

        for(int i=0; i<graph.length; i++){
            if(find(parent, graph[i][0]-1)==find(parent, graph[i][1]-1)){
                continue;
            }
            else{
                union(parent, graph[i][0]-1, graph[i][1]-1);
                answer +=graph[i][2];
            }
        }
        return answer;
    }

    public static int find(int[] parent, int a){
        if(parent[a]==a){
            return a;
        }
        else return parent[a] = find(parent, parent[a]);
    }

    public static void union(int[] parent, int a, int b){
        if(find(parent,a)!=find(parent,b)){
            parent[b] = a;
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] gNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int gNodes = Integer.parseInt(gNodesEdges[0]);
        int gEdges = Integer.parseInt(gNodesEdges[1]);

        List<Integer> gFrom = new ArrayList<>();
        List<Integer> gTo = new ArrayList<>();
        List<Integer> gWeight = new ArrayList<>();

        IntStream.range(0, gEdges).forEach(i -> {
            try {
                String[] gFromToWeight = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                gFrom.add(Integer.parseInt(gFromToWeight[0]));
                gTo.add(Integer.parseInt(gFromToWeight[1]));
                gWeight.add(Integer.parseInt(gFromToWeight[2]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int res = Result.kruskals(gNodes, gFrom, gTo, gWeight);

        // Write your code here.

        bufferedReader.close();
        bufferedWriter.close();
    }
}
}