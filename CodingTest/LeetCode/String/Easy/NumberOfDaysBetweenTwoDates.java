package CodingTest.LeetCode.String.Easy;

public class NumberOfDaysBetweenTwoDates {
    static int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    public int daysBetweenDates(String date1, String date2) {
        int day1 = 0, day2 = 0, mon1 = 0, mon2 = 0, yoon1 = 0, yoon2 = 0;
        String[] d1 = date1.split("-");
        String[] d2 = date2.split("-");
        
        //year+day
        day1 += Integer.parseInt(d1[0])*365 + Integer.parseInt(d1[2]);
        day2 += Integer.parseInt(d2[0])*365 + Integer.parseInt(d2[2]);
        
        //yoon
        for(int i=1; i<Integer.parseInt(d1[0]); i++) if(yoon(i)) yoon1++;
        for(int i=1; i<Integer.parseInt(d2[0]); i++) if(yoon(i)) yoon2++;
        
        if(Integer.parseInt(d1[1])>2 && yoon(Integer.parseInt(d1[0]))) yoon1++;
        if(Integer.parseInt(d2[1])>2 && yoon(Integer.parseInt(d2[0]))) yoon2++;
        
        //month
        for(int i=0; i<Integer.parseInt(d1[1]); i++) mon1 += month[i];
        for(int i=0; i<Integer.parseInt(d2[1]); i++) mon2 += month[i];

        return Math.abs((day1+mon1+yoon1)-(day2+mon2+yoon2));
    }
    
    public boolean yoon(int n){
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) return true;
        else return false;
    }
}
