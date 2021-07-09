package CodingTest.LeetCode.String.Easy;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderDataInLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, new Comparator<String>(){
           @Override
            public int compare(String log1, String log2){
                String[] l1 = log1.split(" ",2);
                String[] l2 = log2.split(" ",2);
                
                boolean isD1 = Character.isDigit(l1[1].charAt(0));
                boolean isD2 = Character.isDigit(l2[1].charAt(0));
                //two letter
                
                if(!isD1 && !isD2){
                    if(l1[1].compareTo(l2[1]) != 0) return l1[1].compareTo(l2[1]);
                    
                    return l1[0].compareTo(l2[0]);
                }
                //letter digit
                
                if(!isD1 && isD2) return -1;
                else if(isD1 && !isD2) return 1;
                else return 0;
            }
        });
    
        return logs;
    }
}
