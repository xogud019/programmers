package LeetCode.Graph.Medium;
/*
In this problem, a tree is an undirected graph that is connected and has no cycles.

You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added. The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed. The graph is represented as an array edges of length n where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the graph.

Return an edge that can be removed so that the resulting graph is a tree of n nodes. If there are multiple answers, return the answer that occurs last in the input.

 

Example 1:


Input: edges = [[1,2],[1,3],[2,3]]
Output: [2,3]
Example 2:


Input: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
Output: [1,4]
 

Constraints:

n == edges.length
3 <= n <= 1000
edges[i].length == 2
1 <= ai < bi <= edges.length
ai != bi
There are no repeated edges.
The given graph is connected.
*/
public class RedundantConnection {
    /*failed case - wrong answer
    //dfs
    int n;
    boolean[] visited;
    int cycle;
    
    public int[] findRedundantConnection(int[][] edges) {
        n = edges.length;
        visited = new boolean[n+1];
        cycle = 0;
        
        dfs(edges, 1);
        
        for(int i=n-1; i>=0; i--){
            if(edges[i][1] == cycle) return edges[i];
        }
        
        return new int[2];
    }
    
    public void dfs(int[][] edges, int v){
        if(!visited[v]){
            visited[v] = true;
            
            for(int i=0; i<n; i++){
                if(edges[i][0] == v){
                    dfs(edges, edges[i][1]);
                }
            }
        }
        else{
            //cycle = v;
            System.out.println("cycle"+v);
            return;
        }
    }
    */
}
