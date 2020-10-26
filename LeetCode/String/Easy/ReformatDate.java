package LeetCode.String.Easy;

public class ReformatDate {
    public String reformatDate(String date) {
        String answer = "";
        String[] arr = date.split(" ");
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        answer += arr[2] + "-";
        
        for(int i=0; i<month.length; i++){
            if(month[i].equals(arr[1])){
                if(i<9) answer += "0"+(i+1)+"-";
                else answer += ""+(i+1)+"-";   
            }
        }
        
        if(arr[0].length()==3) answer += "0"+arr[0].substring(0,1);
        else answer += arr[0].substring(0,2);
        
        return answer;
    }
}
