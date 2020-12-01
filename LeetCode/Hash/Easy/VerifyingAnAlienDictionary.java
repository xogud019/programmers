package LeetCode.Hash.Easy;

public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int len = words.length;
        
        for(int i=1; i<len; i++){
            String s1 = words[i-1];
            String s2 = words[i];
            boolean isE = false;
            
            for(int j=0; j<Math.min(s1.length(),s2.length()); j++){
                char c1 = s1.charAt(j);
                char c2 = s2.charAt(j);
                
                if(order.indexOf(c1)>order.indexOf(c2)) return false;
                else if(order.indexOf(c1) == order.indexOf(c2)) continue;
                else{
                    isE = true;
                    break;
                }
            }
            
            if(!isE){
                if(s1.length()>s2.length()) return false;
            }
            
        }
        
        return true;
    }
}
