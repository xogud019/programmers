package LeetCode.Graph.Medium;
/*
Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1, and return them in any order.
The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]). 

Example 1:

Input: graph = [[1,2],[3],[3],[]]
Output: [[0,1,3],[0,2,3]]
Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.

Example 2:

Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]

Example 3:

Input: graph = [[1],[]]
Output: [[0,1]]

Example 4:

Input: graph = [[1,2,3],[2],[3],[]]
Output: [[0,1,2,3],[0,2,3],[0,3]]

Example 5:

Input: graph = [[1,3],[2],[3],[]]
Output: [[0,1,2,3],[0,3]]
 

Constraints:
1.n == graph.length
2.2 <= n <= 15
3.0 <= graph[i][j] < n
4.graph[i][j] != i (i.e., there will be no self-loops).
5.The input graph is guaranteed to be a DAG.
*/
import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {
    List<List<Integer>> answer;
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        findRoute(graph, list, 0);
        
        return answer;
    }
    
    public void findRoute(int[][] graph, List<Integer> list, int node){
        list.add(node);
        
        if(node == graph.length-1){
            answer.add(new ArrayList(list));
            return;
        }
        else{
            for(int v:graph[node]){
                findRoute(graph,list, v);
                list.remove(list.size()-1);
            }
        }
        
    }
}
