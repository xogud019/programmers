package CodingTest.LeetCode.Sort.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer;
        int i = 0, j =0;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }    
            
            else if(nums1[i]>nums2[j]) j++;
            else i++;
        }
        
        answer = new int[list.size()];
        
        for(int idx=0; idx<list.size(); idx++) answer[idx] = list.get(idx);
        
        return answer;
    }
}
