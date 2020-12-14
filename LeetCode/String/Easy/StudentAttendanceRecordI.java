package LeetCode.String.Easy;

public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int a = 0, len = s.length();
        
        for(int i=0; i<len; i++){
            if(s.charAt(i)=='A'){
                a++;
                if(a>1) return false;
            }
            else if(s.charAt(i)=='L'){
                if(i+1<len && s.charAt(i+1) == 'L'){
                    if(i+2<len && s.charAt(i+2) == 'L' ) 
                        return false;
                }    
            }
        }
        
        return true;
    }
}
