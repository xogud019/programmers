package Programmers.level2;


public class ThatSong {
    static String[] shape = {"C#","D#","E#","F#","G#","A#"}; 
    static String[] lower = {"c","d","e","f","g","a"}; 
    public static void main(String[] args){
        String m = "CC#BCC#BCC#BCC#B";
        String[] musicinfos = {"03:00,03:30,FOO,CC#B", "12:00,12:04,BAR,CC#B"};
        System.out.println(solution(m, musicinfos));
    }

    public static String solution(String m, String[] musicinfos){     
        String answer="(None)";
        for(int i=0; i<shape.length; i++){
            m = m.replaceAll(shape[i], lower[i]);
        }
        int tempM = 0;
        
        for(int i=0; i<musicinfos.length; i++){
            String[] s = musicinfos[i].split("[,|:]");
            String melody = s[5];
            String playMel = "";
            int hour = Integer.parseInt(s[2]) - Integer.parseInt(s[0]);
            int minute = Integer.parseInt(s[3]) - Integer.parseInt(s[1]) + (hour * 60);;
            for(int j=0; j<shape.length; j++){
                melody = melody.replaceAll(shape[j], lower[j]);
            }
            
            for(int j=0; j<minute; j++){
                playMel += melody.charAt(j%melody.length());
            }

            if(playMel.contains(m)){
                if(tempM<minute){
                    tempM = minute;
                    answer = s[4];
                }
            }
        }

        return answer;
    }
}