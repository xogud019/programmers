package LeetCode.Greedy.Easy;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int answer = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        
        for(int i=0; i<g.length; i++){
            for(int j=0; j<s.length; j++){
                if(s[j]>=g[i]){
                    answer++;
                    s[j] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
    /*time out
    public int findContentChildren(int[] g, int[] s) {
        int answer = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<g.length; i++){
            for(int j=0; j<s.length; j++){
                if(list.contains(j)) continue;
                
                if(s[j]>=g[i]){
                    answer++;
                    list.add(j);
                    break;
                }
            }
        }
        
        return answer;
    }
    */
}
