package CodingTest.LeetCode.Math.Easy;

public class DayOfTheYear{
    public int dayOfYear(String date) {
        String[] arr = date.split("-");
        int answer = 0;
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<Integer.parseInt(arr[1])-1;i++){
            answer += month[i];
        }
        if(leap(Integer.parseInt(arr[0])) && Integer.parseInt(arr[1]) > 2) answer++;
        answer += Integer.parseInt(arr[2]);
        return answer;
    }
    
    public boolean leap(int i){
        return (i%4==0 && i%100 !=0 )|| i %400==0;
    }
}