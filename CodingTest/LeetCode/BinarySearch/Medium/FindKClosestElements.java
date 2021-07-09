package CodingTest.LeetCode.BinarySearch.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindKClosestElements {
    //using sort
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        
        for(int i:arr) list.add(i);
        
        Collections.sort(list, new Comparator<Integer>(){
           @Override
            public int compare(Integer v1, Integer v2){
                if(Math.abs(x-v1) == Math.abs(x-v2)) return v1 - v2;
                
                return Math.abs(x-v1) - Math.abs(x-v2);
            }
        });
        
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<k; i++) answer.add(list.get(i));
        
        Collections.sort(answer);
        
        return answer;
    }
    /*failed case - wrong case 
    //binarysearch try 1
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> answer = new ArrayList<>();
        
        if(arr[0] >= x){
            for(int i=0; i<k; i++) answer.add(arr[i]);
            
            return answer;
        }
        else if(arr[arr.length-1] <= x){
            for(int i=arr.length-k; i<arr.length; i++) answer.add(arr[i]);
            
            return answer;
        }
        
        int idx = 0;
        
        for(int i=0; i<arr.length; i++)
            if(arr[i] == x){
                idx = i;
                break;
            } 
        
        answer.add(arr[idx]);
        
        int count = 1, val = 1;
        
        while(count < k){
            if(search(arr, idx-val)){ 
                count++;
                answer.add(arr[idx-val]);
            }
            
            if(count == k) break;
            
            if(search(arr, idx+val)){ 
                answer.add(arr[idx+val]);
                count++;
                
            }
            
            val++;
        }
        
        Collections.sort(answer);
                
        return answer;
    }
    
    public boolean search(int[] arr, int idx){
        if(idx < 0 || idx >= arr.length) return false;
        int lo = 0, hi = arr.length-1;
        
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            
            if(arr[mid] > arr[idx]){
                hi = mid-1;
            }
            else if(arr[mid] < arr[idx]){
                lo = mid+1;
            }
            else return true;
        }
        
        return false;
    }

    //try 2
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> answer = new ArrayList<>();
        int n = arr.length;
        int lo = 0, hi = n-k;
        
        while(lo < hi){
            int mid = lo + (hi - lo)/2;
            
            if(Math.abs(arr[mid]-x) > Math.abs(arr[mid+k] -x)){
                lo = mid + 1;
            }
            else hi = mid;
        }
        
        for(int i=lo; i<lo+k; i++) answer.add(arr[i]);
        
        return answer;
    }
    */

}
