package Codility;

import java.util.*;

public class Dominator{
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer,Integer> map = new HashMap<>();
        int val = 0;
        int count = 0;

        if(A.length==0) return -1;
        
        for(int i:A){
            if(!map.containsKey(i)) map.put(i,1);
            else map.put(i, map.get(i)+1);
        }
        /*same
        for(int i:A){
            map.put(i,map.getOrDefaulf(i,0)+1);
        }
        */
        
        for(int i:map.keySet()){
            if(map.get(i)>count){
                count = map.get(i);
                val = i;
            }   
        }
        
        if(count<=A.length/2) return -1;
        
        for(int i=0; i<A.length; i++){
            if(A[i]==val) return i;
        }
        
        return -1;
    }
    /*failed case = correct 37, efficient 25
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer,Integer> map = new TreeMap<>();
        int base = 0;
        int answer = 0;
        
        if(A.length==0) return -1;
        
        for(int i:A){
            if(!map.containsKey(i)) map.put(i,1);
            else map.put(i, map.get(i)+1);
        }
        
        for(int i:map.keySet()){
            if(map.get(i)>= A.length/2){
                base = i;
                break;
            }
        }
        
        for(int i=0; i<A.length; i++){
            if(A[i]==base){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    */
    /*failed case = correct 50, efficient 100
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer,Integer> map = new HashMap<>();
        int val = 0;
        int count = 0;
        int answer = 0;
        
        if(A.length==0) return -1;
        
        for(int i:A){
            if(!map.containsKey(i)) map.put(i,1);
            else map.put(i, map.get(i)+1);
        }
        
        
        for(int i:map.keySet()){
            if(map.get(i)>count){
                count = map.get(i);
                val = i;
            }   
        }
        
        if(count<A.length/2) return -1;
        
        for(int i=0; i<A.length; i++){
            if(A[i]==val) return i;
        }
        
        return -1;
    }
    */
}