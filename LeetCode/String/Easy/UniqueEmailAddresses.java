package LeetCode.String.Easy;

import java.util.*;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        
        for(String s:emails){
            int index = s.indexOf("@");
            String local = s.substring(0,index);
            String domain = s.substring(index+1,s.length());
            
            if(local.indexOf("+")!= -1) local = local.substring(0,local.indexOf("+"));
            
            local = local.replaceAll("\\.","");
            set.add(local+"@"+domain);
        }
        
        return set.size();
    }
}
