package LeetCode.String.Easy;

import java.util.HashSet;

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        HashSet<String> set = new HashSet<>();
        set.add(x+""+y);
        
        for(char c : path.toCharArray()){
            if(c == 'E') y++;
            else if(c == 'W') y--;
            else if(c == 'S') x++;
            else x--;
            
            if(set.contains(x+""+y)) return true;
            else set.add(x+""+y);
        }
        
        return false;
    }
}
