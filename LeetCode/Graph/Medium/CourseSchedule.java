package LeetCode.Graph.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.

 

Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0. So it is possible.
Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 

Constraints:

1 <= numCourses <= 105
0 <= prerequisites.length <= 5000
prerequisites[i].length == 2
0 <= ai, bi < numCourses
All the pairs prerequisites[i] are unique.
*/
public class CourseSchedule {
    //BFS(Topological Sort)
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        int[] degree = new int[n];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer>[] list = new ArrayList[n];
        
        for(int i=0; i<n; i++) list[i] = new ArrayList<>();
        
        for(int[] pre : prerequisites){
            list[pre[1]].add(pre[0]);
            degree[pre[0]]++;
        }
        /*
        for(int i=0; i<n; i++){
            for(int j=0; j<list[i].size(); j++) System.out.print(i+":"+list[i].get(j)+" ");
            System.out.println();
        }
        */
        for(int i=0; i<n; i++){
            //System.out.println(degree[i]);
            if(degree[i] == 0) q.add(i);
        }
        
        for(int i=0; i<n; i++){
            if(q.isEmpty()) return false;
            
            int v = q.poll();
            
            for(int node : list[v]){
                degree[node]--;
                
                if(degree[node] == 0) q.add(node);
            }
        }
        
        for(int i:degree){
            if(i != 0) return false;
        }
        
        return true;
    }

    /*DFS
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        int[] degree = new int[n];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer>[] list = new ArrayList[n];
        
        for(int i=0; i<n; i++) list[i] = new ArrayList<>();
        
        for(int[] pre : prerequisites) list[pre[1]].add(pre[0]);
        
        for(int i=0; i<n; i++){
            if(degree[i] == 0 && !isCycle(list, degree, i)) return false;
        }
        
        return true;
    }
    
    public boolean isCycle(List<Integer>[] list, int[] degree, int v){
        if(degree[v] == 1) return false;
        
        if(degree[v] == 2) return true;
        
        degree[v] = 1;
        
        for(int i:list[v]){
            if(!isCycle(list, degree, i)) return false;       
        }
        
        degree[v] = 2;
        
        return true;
    }
    */
}
