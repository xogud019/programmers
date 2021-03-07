package LeetCode.String.Medium;
/*
The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.

For example, the beauty of "abaacc" is 3 - 1 = 2.
Given a string s, return the sum of beauty of all of its substrings.

 

Example 1:

Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
Example 2:

Input: s = "aabcbaa"
Output: 17
 

Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters.
*/
public class SumOfBeautyOfAllSubstrings {
    /*time out
    public int beautySum(String s) {
        int beauty = findBeauty(s);
        int answer = 0, len = s.length();
        
        for(int i = 0; i<len-1; i++){
            for(int j=i+1; j<=len; j++){
                int temp = findBeauty(s.substring(i,j));
                
                if(temp > 0) answer += temp;
                
                System.out.println(s.substring(i,j));
                if(findBeauty(s.substring(i,j)) == beauty) answer++;
                
            }
        }
        return answer;
    }
    
    public int findBeauty(String s){
        Map<Character,Integer> map = new HashMap<>();

        for(char c:s.toCharArray()) map.put(c, map.getOrDefault(c,0)+1);
        
        int max = 0, min = 501;
        
        for(char c:map.keySet()){
            max = Math.max(max, map.get(c));
            min = Math.min(min, map.get(c));
        }
        
        return max-min;
    }
    */
    public int beautySum(String s) {
        int len = s.length();
        int answer = 0;
        int[] count;
        
        for(int i=0; i<len-1; i++){
            count = new int[26];
            
            for(int j=i; j<len; j++){                
                count[s.charAt(j)-'a']++;
                
                answer += beauty(count);
                //System.out.print(find(s.substring(i,j))+" ");
                //System.out.println(s.substring(i,j));
            }
        }
        
        return answer;
    }
    
   public int beauty(int[] arr){
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       
       for(int i:arr){
           if(i==0) continue;
           
           max = Math.max(max, i);
           min = Math.min(min, i);
       }
       
       return max - min;
   }
}
