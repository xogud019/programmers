package CodingTest.LeetCode.DFS.Hard;
/*
There are n servers numbered from 0 to n-1 connected by undirected server-to-server connections forming a network where connections[i] = [a, b] represents a connection between servers a and b. Any server can reach any other server directly or indirectly through the network.

A critical connection is a connection that, if removed, will make some server unable to reach some other server.

Return all critical connections in the network in any order.

 

Example 1:



Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
Output: [[1,3]]
Explanation: [[3,1]] is also accepted.
 

Constraints:

1 <= n <= 10^5
n-1 <= connections.length <= 10^5
connections[i][0] != connections[i][1]
There are no repeated connections.
*/
public class CriticalConnectionsInANetwork {
    /*copy coding  - targan algorithm
    List<List<Integer>> answer;
    List<Integer>[] graph;
    int[] dsnt, dsn;
    int cnt;
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        graph = new ArrayList[n];
        answer = new ArrayList<>();
        
        for(List<Integer> list : connections){
            int u = list.get(0);
            int v = list.get(1);
            
            if(graph[u] == null) graph[u] = new ArrayList<>();
            if(graph[v] == null) graph[v] = new ArrayList<>();
            
            graph[u].add(v);
            graph[v].add(u);
        }
        
        dsnt = new int[n];
        dsn = new int[n];
        cnt = 0;
        Arrays.fill(dsnt, -1);
        Arrays.fill(dsn, -1);
        
        dfs(0, -1);
        
        return answer;
    }
    
    public void dfs(int node, int parent){
        if(dsnt[node] != -1) return;
        
        dsnt[node] = cnt;
        dsn[node] = cnt;
        cnt++;
        
        for(Integer i:graph[node]){
            if(i == parent) continue;
            
            dfs(i, node);
            
            if(dsnt[node] < dsn[i]) answer.add(Arrays.asList(node, i));
            else dsn[node] = Math.min(dsn[node], dsn[i]);
        }
    }
    */
    /*
    public void dfs(List<List<Integer>> connections, int start){
        visited[start] = true;
        System.out.print(start+" ");
        
        for(int i=0; i<len; i++){
            if(connections.get(i).get(0)== start &&!visited[connections.get(i).get(1)]){
                dfs(connections, connections.get(i).get(1));
            }        
        }
    }
    */
}
