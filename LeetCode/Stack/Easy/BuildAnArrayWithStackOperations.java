package LeetCode.Stack.Easy;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> answer = new ArrayList<>();
        int idx = 0;
        
        for(int i=1; i<=n; i++){
            if(idx==target.length) break;
            if(target[idx]==i){
                answer.add("Push");
                idx++;
            }
            else{
                answer.add("Push");
                answer.add("Pop");
            }
        }
        
        return answer;
    }
}
