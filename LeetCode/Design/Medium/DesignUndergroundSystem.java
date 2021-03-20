package LeetCode.Design.Medium;

import java.util.HashMap;

/*
Implement the UndergroundSystem class:

void checkIn(int id, string stationName, int t)
A customer with a card id equal to id, gets in the station stationName at time t.
A customer can only be checked into one place at a time.
void checkOut(int id, string stationName, int t)
A customer with a card id equal to id, gets out from the station stationName at time t.
double getAverageTime(string startStation, string endStation)
Returns the average time to travel between the startStation and the endStation.
The average time is computed from all the previous traveling from startStation to endStation that happened directly.
Call to getAverageTime is always valid.
You can assume all calls to checkIn and checkOut methods are consistent. If a customer gets in at time t1 at some station, they get out at time t2 with t2 > t1. All events happen in chronological order.

 

Example 1:

Input
["UndergroundSystem","checkIn","checkIn","checkIn","checkOut","checkOut","checkOut","getAverageTime","getAverageTime","checkIn","getAverageTime","checkOut","getAverageTime"]
[[],[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],["Paradise","Cambridge"],["Leyton","Waterloo"],[10,"Leyton",24],["Leyton","Waterloo"],[10,"Waterloo",38],["Leyton","Waterloo"]]

Output
[null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000]

Explanation
UndergroundSystem undergroundSystem = new UndergroundSystem();
undergroundSystem.checkIn(45, "Leyton", 3);
undergroundSystem.checkIn(32, "Paradise", 8);
undergroundSystem.checkIn(27, "Leyton", 10);
undergroundSystem.checkOut(45, "Waterloo", 15);
undergroundSystem.checkOut(27, "Waterloo", 20);
undergroundSystem.checkOut(32, "Cambridge", 22);
undergroundSystem.getAverageTime("Paradise", "Cambridge");       // return 14.00000. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 11.00000. There were two travels from "Leyton" to "Waterloo", a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20. So the average time is ( (15-3) + (20-10) ) / 2 = 11.00000
undergroundSystem.checkIn(10, "Leyton", 24);
undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 11.00000
undergroundSystem.checkOut(10, "Waterloo", 38);
undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 12.00000
Example 2:

Input
["UndergroundSystem","checkIn","checkOut","getAverageTime","checkIn","checkOut","getAverageTime","checkIn","checkOut","getAverageTime"]
[[],[10,"Leyton",3],[10,"Paradise",8],["Leyton","Paradise"],[5,"Leyton",10],[5,"Paradise",16],["Leyton","Paradise"],[2,"Leyton",21],[2,"Paradise",30],["Leyton","Paradise"]]

Output
[null,null,null,5.00000,null,null,5.50000,null,null,6.66667]

Explanation
UndergroundSystem undergroundSystem = new UndergroundSystem();
undergroundSystem.checkIn(10, "Leyton", 3);
undergroundSystem.checkOut(10, "Paradise", 8);
undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 5.00000
undergroundSystem.checkIn(5, "Leyton", 10);
undergroundSystem.checkOut(5, "Paradise", 16);
undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 5.50000
undergroundSystem.checkIn(2, "Leyton", 21);
undergroundSystem.checkOut(2, "Paradise", 30);
undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 6.66667
 

Constraints:
1.There will be at most 20000 operations.
2.1 <= id, t <= 106
3.All strings consist of uppercase and lowercase English letters, and digits.
4.1 <= stationName.length <= 10
5.Answers within 10-5 of the actual value will be accepted as correct.
*/
public class DesignUndergroundSystem {
    /*failed case 
    class UndergroundSystem {
        HashMap<Integer, Integer> time;
        HashMap<Integer, String> station;
    
        public UndergroundSystem() {
            time = new HashMap<>();
            station = new HashMap<>();
        }
    
        public void checkIn(int id, String stationName, int t) {
            if(time.containsKey(id)) return;
            time.put(id,t);
            station.put(id,stationName);
        }
    
        public void checkOut(int id, String stationName, int t) {
            time.put(id, t-time.get(id));
            station.put(id,station.get(id)+"@"+stationName);
        }
    
        public double getAverageTime(String startStation, String endStation) {
            String str = startStation+"@"+endStation;
            int sum = 0, count = 0;
        
            for(int i:station.keySet()){
                if(station.get(i).equals(str)){
                    count++;
                    sum += time.get(i);
                }
            }
        
            return (double)sum/count;
        }
    }
    */
    class UndergroundSystem {
        HashMap<String, Time> station;
        HashMap<Integer, Integer> inTime;
        HashMap<Integer, String> inStation;
        
        public UndergroundSystem() {
            station = new HashMap<>();
            inTime = new HashMap<>();
            inStation = new HashMap<>();
        }
        
        public void checkIn(int id, String stationName, int t) {
            inTime.put(id,t);
            inStation.put(id,stationName);
        }
        
        public void checkOut(int id, String stationName, int t) {
            int time = t-inTime.get(id);
            String str = inStation.get(id)+":"+stationName;
            
            if(station.containsKey(str)){
                Time temp = station.get(str);
                
                temp.sum += time;
                temp.count++;
                
                station.put(str,temp);
            }
            else station.put(str,new Time(time,1));
        }
        
        public double getAverageTime(String startStation, String endStation) {
            String str = startStation+":"+endStation;
            
            return station.get(str).getAvg();
        }
    }
    class Time{
        int sum = 0;
        int count = 0;
        
        public Time(int sum, int count){
            this.sum = sum;
            this.count = count;
        }
        
        public double getAvg(){
            return (double)sum/count;
        }
    }
}
/*
class UndergroundSystem {
    class Time{
        int sum = 0;
        int count = 0;
        
        public Time(int sum, int count){
            this.sum += sum;
            this.count += count;
        }
        
        public void add(int sum){
            this.sum += sum;
            this.count++;
        }
        
        public double getAvg(){
            return (double)sum/count;
        }
    }
    
    HashMap<Integer, String> station;
    HashMap<Integer, Integer> time;
    HashMap<String, Time> total;
    
    public UndergroundSystem() {
        station = new HashMap<>();
        time = new HashMap<>();
        total = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        station.put(id, stationName);
        time.put(id, t*(-1));
    }
    
    public void checkOut(int id, String stationName, int t) {
        String route = station.get(id)+"@"+stationName;
        station.put(id, route);
        time.put(id, time.get(id)+t);
        
        if(total.containsKey(route)){
            Time tt = total.get(route);
            
            tt.add(time.get(id));
            
            total.put(route, tt);
        }
        else total.put(route, new Time(time.get(id),1));
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation+"@"+endStation;
        
        return total.get(key).getAvg();
        
    }
}
*/