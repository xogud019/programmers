package CodingTest.LeetCode.Map.Easy;

import java.util.HashMap;

/*
You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.

The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.

Return the earliest year with the maximum population.

 

Example 1:

Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
Example 2:

Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation: 
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.
 

Constraints:

1 <= logs.length <= 100
1950 <= birthi < deathi <= 2050
*/
public class MaximumPopulationYear {
    public int maximumPopulation(int[][] logs) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int[] log : logs){
            for(int i=log[0]; i<log[1]; i++) map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int max = 0;
        
        for(int i:map.keySet()) max = Math.max(max, map.get(i));    
        
        int answer = 2051;
        
        for(int i:map.keySet()){
            if(map.get(i)==max) answer = Math.min(answer, i);
        }
        
        return answer;
    }
}
