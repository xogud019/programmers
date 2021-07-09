package CodingTest.LeetCode.Stack.Easy;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        
        for(int i=0; i<nums1.length; i++){
            int idx = 0;
            
            for(int j=0; j<nums2.length; j++){
                if(nums2[j]==nums1[i]){
                    idx = j;
                    break;
                }    
            }
            
            if(idx == nums2.length-1){
                answer[i] = -1;
                continue;
            }
            
            boolean isT = false;
            
            for(int j=idx+1; j<nums2.length; j++){
                if(nums2[j]>nums1[i]){
                    answer[i] = nums2[j];
                    isT = true;
                    break;
                }
            }
            
            if(!isT) answer[i] = -1;
        }
        
        return answer;
    }
}
