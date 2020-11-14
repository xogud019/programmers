package LeetCode.Array.Easy;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int[] answer = new int[len];
        int dis = Integer.MIN_VALUE/2;
        //System.out.println(Integer.MIN_VALUE/2);
        for(int i=0; i<len; i++){
            if(S.charAt(i)==C) dis = i;
            answer[i] = i-dis;
        }
        
        dis = Integer.MAX_VALUE/2;
        
        for(int i=len-1; i>=0; i--){
            if(S.charAt(i)==C) dis = i;
            answer[i] = Math.min(answer[i],dis-i);
        }
        
        
        //for(int i:answer) System.out.print(i+" ");
        
        return answer;
    }
}
