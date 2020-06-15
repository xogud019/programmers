package level2;

public class ThatSong {
    static String[] shape = {"C#","D#","E#","F#","G#","A#"}; 
    static String[] lower = {"c","d","e","f","g","a"}; 
    public static void main(String[] args){
        String m = "CC#BCC#BCC#BCC#B";
        String[] musicinfos = {"03:00,03:30,FOO,CC#B", "02:00,02:30,BAR,CC#B"};
        System.out.println(solution(m, musicinfos));
    }

    public static String solution(String m, String[] musicinfos){     
        String answer="(None)";
        for(int i=0; i<shape.length; i++){
            m = m.replaceAll(shape[i], lower[i]);
        }
        int tempM = 0;
        //System.out.println(m);
        for(int i=0; i<musicinfos.length; i++){
            String[] s = musicinfos[i].split("[,|:]");
            int time = 0;
            String melody = s[5];
            String title = s[4];
            String playMel = "";
            int hour = Math.abs(Integer.parseInt(s[0])-Integer.parseInt(s[2]));
            int minute = Math.abs(Integer.parseInt(s[1])-Integer.parseInt(s[3]))*1;
            for(int j=0; j<shape.length; j++){
                melody = melody.replaceAll(shape[j], lower[j]);
            }
            
            time = hour*60+minute;
            //System.out.println(melody);
            //System.out.println(time);
            
            for(int j=0; j<time; j++){
                playMel += melody.charAt(j%melody.length());
            }

            if(playMel.contains(m)){
                if(time>tempM){
                    tempM = time;
                    answer = title;
                }
            }

            //System.out.println(playMel);
            //System.out.println(playMel.length());
            
            //System.out.println(index);
            //System.out.println(playMel);
        }

        return answer;
    }
}