package LeetCode.Contest;

public class KeyCard {
    /*failed case
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> answer = new ArrayList<>();
        
        if(keyName.length<3) return answer;
        
        for(int i=0; i<keyName.length-2; i++){
            while(i+2<keyName.length&&keyName[i].equals(keyName[i+2])){
                String[] start = keyTime[i].split(":");
                String[] end = keyTime[i+2].split(":");
                
                int time = (Integer.parseInt(end[0])*60+Integer.parseInt(end[1]))-(Integer.parseInt(start[0])*60+Integer.parseInt(start[1]));
                
                if(time<=60&&time>0) answer.add(keyName[i]);
                
                i++;
            }
        }
        Collections.sort(answer);
        
        return answer;
    }
    */
}
