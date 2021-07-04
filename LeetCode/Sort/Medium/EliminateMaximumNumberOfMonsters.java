package LeetCode.Sort.Medium;

import java.util.Arrays;

/*
You are playing a video game where you are defending your city from a group of n monsters. You are given a 0-indexed integer array dist of size n, where dist[i] is the initial distance in meters of the ith monster from the city.

The monsters walk toward the city at a constant speed. The speed of each monster is given to you in an integer array speed of size n, where speed[i] is the speed of the ith monster in meters per minute.

The monsters start moving at minute 0. You have a weapon that you can choose to use at the start of every minute, including minute 0. You cannot use the weapon in the middle of a minute. The weapon can eliminate any monster that is still alive. You lose when any monster reaches your city. If a monster reaches the city exactly at the start of a minute, it counts as a loss, and the game ends before you can use your weapon in that minute.

Return the maximum number of monsters that you can eliminate before you lose, or n if you can eliminate all the monsters before they reach the city.

 

Example 1:

Input: dist = [1,3,4], speed = [1,1,1]
Output: 3
Explanation:
At the start of minute 0, the distances of the monsters are [1,3,4], you eliminate the first monster.
At the start of minute 1, the distances of the monsters are [X,2,3], you don't do anything.
At the start of minute 2, the distances of the monsters are [X,1,2], you eliminate the second monster.
At the start of minute 3, the distances of the monsters are [X,X,1], you eliminate the third monster.
All 3 monsters can be eliminated.
Example 2:

Input: dist = [1,1,2,3], speed = [1,1,1,1]
Output: 1
Explanation:
At the start of minute 0, the distances of the monsters are [1,1,2,3], you eliminate the first monster.
At the start of minute 1, the distances of the monsters are [X,0,1,2], so you lose.
You can only eliminate 1 monster.
Example 3:

Input: dist = [3,2,4], speed = [5,3,2]
Output: 1
Explanation:
At the start of minute 0, the distances of the monsters are [3,2,4], you eliminate the first monster.
At the start of minute 1, the distances of the monsters are [X,0,2], so you lose.
You can only eliminate 1 monster.
 

Constraints:

n == dist.length == speed.length
1 <= n <= 105
1 <= dist[i], speed[i] <= 105
*/
public class EliminateMaximumNumberOfMonsters {
    public int eliminateMaximum(int[] dist, int[] speed){
        int n = dist.length;
        
        for(int i=0; i<n; i++)
            dist[i] = (dist[i]/speed[i]) + (dist[i]%speed[i] == 0? 0 : 1);
    
        Arrays.sort(dist);
        
        int idx = 0, time = 0, answer = 0;
        
        while(idx < n){
            if(dist[idx] > time){ 
                answer++;
                time++;
                idx++;
            }
            else break;
            
        }
        
        return answer;
    }
    /*wrong case
    public int eliminateMaximum(int[] dist, int[] speed){
        int n = dist.length, count = 1, answer = 0, amt = 0;        
        int[] arrive = new int[n];

        while(amt < n){
            for(int i=0; i<n; i++){
                if(dist[i] <= 0) continue;
                
                dist[i] -= speed[i];
                
                if(dist[i] <= 0){
                    arrive[i] = count;
                    amt++;
                }
            }
            
            count++;
        }
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
                
        for(int i:arrive) map.put(i, map.getOrDefault(i, 0)+1);
        
        int time = 1;
        
        while(time < n){
            if(!map.containsKey(time)) time++;
            else{
                if(map.get(time) > 1){
                    time++;
                    break;
                }
                else time++;
            }
        }
        
        return time;
    }
    */
    /*wrong case
    class Monster{
        int count = 0;
        
        public Monster(int dis, int spd){
            while(dis-spd >= 0){
                this.count++;
                dis -= spd;
            }
        }
    }
    
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        PriorityQueue<Monster> pq = new PriorityQueue<>(n, new Comparator<Monster>(){
            @Override
            public int compare(Monster m1, Monster m2){
                return m1.count - m2.count;
            }
        });
        
        for(int i=0; i<n; i++) pq.add(new Monster(dist[i], speed[i]));
        
        int time = 1;
        pq.poll();
        
        while(!pq.isEmpty()){
            Monster mon = pq.poll();
            //System.out.println(time +" "+mon.count);
            if(time >= mon.count) break;
            
            time++;
            
            if(time == n) break;
        }
        
        return time;
    }
    */
}
