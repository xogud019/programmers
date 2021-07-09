package CodingTest.LeetCode.Contest;

public class RearrangeSpacesBetweenWords {
    public String reorderSpaces(String text) {
        int space = 0;
        int val = 0;
        int rest = 0;
        String answer ="";
        
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==' ') space++;
        }
        
        while(text.contains("  ")){
            text = text.replaceAll("  "," ");
        }
        
        text = text.trim();

        String[] arr = text.split(" ");
        
        if(arr.length==1){
            for(int i=0; i<space; i++){
                arr[0]+= " ";
            }
            
            return arr[0];
        }
        val = space/(arr.length-1);
        rest = space%(arr.length-1);
        
        for(int i=0; i<arr.length; i++){
            answer +=arr[i];
            
            if(i!=arr.length-1){
                for(int j=0; j<val; j++){
                    answer += " ";
                }
            }
        }
        
        for(int i=0; i<rest; i++){
            answer+=" ";
        }
        
        return answer;
    }
}
